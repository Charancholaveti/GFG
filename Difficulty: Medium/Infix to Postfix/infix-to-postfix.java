//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int prec(char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='*' || c=='/') return 2;
        else if(c=='^') return 3;
        else return -1;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        String ans="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans+=c;
            }else if(c=='(') st.push('(');
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans+=st.pop();
                }
                st.pop();
            }
            else{
               while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                   ans+=st.pop();
               }
               st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}