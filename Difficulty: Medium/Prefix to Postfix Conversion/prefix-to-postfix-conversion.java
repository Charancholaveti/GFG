//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToPost(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToPost(String exp) {
        // code here
        Stack<String>st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z') st.push(c+"");
            else{
                String top1=st.pop();
                String top2=st.pop();
                st.push(top1+top2+c);
            }
        }
        return st.pop();

    }
}
