//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        ArrayList<String> al=new ArrayList<>();
        String word="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='.') word+=str.charAt(i);
            else{
                al.add(word);
                word="";
            }
        }
        al.add(word);
        String ans="";
        for(int i=al.size()-1;i>=0;i--){
            ans+=al.get(i);
            if(i!=0) ans+=".";
        }
        return ans;
    }
}