//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{   
    public static void dfs(int sr,int sc,int[][] image,int [][]ans,
    int []delrow,int []delcol,int color,int initColor){
     int n=image.length;
     int m=image[0].length;
     ans[sr][sc]=color;
     for(int i=0;i<4;i++){
        int nrow=sr+delrow[i];
        int ncol=sc+delcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==initColor
        && ans[nrow][ncol]!=color){
            dfs(nrow,ncol,image,ans,delrow,delcol,color,initColor);
        }
     }
   }
    public int[][] floodFill(int[][] image, int sr, int sc, int color)
    {
        // Code here 
        int initColor=image[sr][sc];
        int [][]ans=image;
        int []delrow={-1,0,1,0};
        int []delcol={0,1,0,-1};
        dfs(sr,sc,image,ans,delrow,delcol,color,initColor);
        return ans;
    }
}