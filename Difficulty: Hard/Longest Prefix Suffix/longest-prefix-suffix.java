//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int lps(String str) {
        // code here
        int n=str.length();
        int p=0;
        int s=1;
        int count=0;
        int pos=1;
        while(p<n && s<n){
            if(str.charAt(p)==str.charAt(s)){
                p++;
                s++;
                count++;
            }
            else{
                p=0;
                count=0;
                pos++;
                s=pos;
            }
        }
        return count;
    }
}