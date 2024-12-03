//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Write your code here
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int[] lps = new int[concat.length()];
        int j = 0;
        for (int i = 1; i < concat.length(); i++) {
            while (j > 0 && concat.charAt(i) != concat.charAt(j)) {
                j = lps[j - 1];
            }
            if (concat.charAt(i) == concat.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        return s.length() - lps[concat.length() - 1];
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.nextString();
            System.out.println(Solution.minChar(s));

            System.out.println("~");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException {
            while (!st.hasMoreTokens()) read();
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends