//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>hm=new HashMap<>();
        int l = 0;
        int r = 0;
        int len = -1;
        int n = s.length();
        while( r < n){
            if(hm.containsKey(s.charAt(r))){
                hm.put(s.charAt(r),hm.get(s.charAt(r))+1);
            }
            else{
                hm.put(s.charAt(r),1);
            }
            if(hm.size() > k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l)) == 0) hm.remove(s.charAt(l));
                l++;
            }
            if(hm.size() == k){
                len = Math.max(len,r-l+1);
            }
            r++;
        }
        return len;
    }
}