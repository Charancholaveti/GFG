//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {

            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }
            int x = Integer.parseInt(read.readLine().trim());
            Solution obj = new Solution();
            // Get results and print
            int[] result = obj.getMoreAndLess(nums, x);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int x) {
        // code here
        int count_min =0;
        int count_max =0;
        int res[] =new int[2];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<=x){
                count_min++;
            }
            if(arr[i]>=x){
                count_max++;
            }
        }
        res[0]=count_min;
        res[1]=count_max;
        return res;
    }
}