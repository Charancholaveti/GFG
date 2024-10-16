//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Read number of test cases

        // Loop through each test case
        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            List<Integer> arr = new ArrayList<>();

            // Convert input to list of integers
            for (String str : inputArr) {
                arr.add(Integer.parseInt(str));
            }

            Solution ob = new Solution();
            boolean ans = ob.checkSorted(arr);

            // Output result
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }

        scanner.close();
    }
}

// } Driver Code Ends


class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count=0;
        int i,j;
        for(i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=i+1)
            {
                for(j=i;j<arr.size();j++)
                {
                    if(arr.get(j)==i+1)
                    break;
                }
                int temp=arr.get(j);
                 arr.set(j,arr.get(i));
                arr.set(i,temp);
                count++;
            }
            if(count>2)
            break;
        }
        if(count==2|| count==0)
        return true;
        return false;

    }
}