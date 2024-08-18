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
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String exp) {
        // code here
        Stack<String>st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z') st.push(c+"");
            else{
                String top1=st.pop();
                String top2=st.pop();
                st.push(c+top2+top1);
            }
        }
        return st.pop();

    }
}
