class Solution {
    
    /*
we can keep a track of the 1' along all the lines possible while traversing the matrix once only. 

In order to do so, we make use of a 4mn sized dp array. 

Here, dp[0], dp[1], dp[2],dp[3] are used to store the maximum number of continuous 1's found so far along the Horizontal, Vertical, Diagonal and Anti-diagonal lines respectively. e.g. dp[i][j][0] is used to store the number of continuous 1's found so far(till we reach the element M[i][j]), along the horizontal lines only.

Thus, we traverse the matrix M in a row-wise fashion only but, keep updating the entries for every dp appropriately.
    */
    
    public int longestLine(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        
        int[][][] dp=new int[m][n][4];
        
        int ones=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    //number of 1s found in horizontal direction
                   dp[i][j][0]=(j>0) ? dp[i][j-1][0]+1 : 1;
                    
                    //number of 1s found in vertical direction
                   dp[i][j][1]=(i>0) ? dp[i-1][j][1]+1 : 1;
                    
                    //number of 1s found in diagonal direction
                   dp[i][j][2]=(i>0 && j>0) ? dp[i-1][j-1][2]+1 : 1;
                    
                //number of 1s found in anti-diagonal direction(bottom-left to top-right)
                   dp[i][j][3]=(i>0 && j<mat[0].length-1) ? dp[i-1][j+1][3]+1 : 1;
                }
                 ones=Math.max(ones,Math.max(
                Math.max(dp[i][j][0],dp[i][j][1]),
                Math.max(dp[i][j][2],dp[i][j][3])
                ));
            }                              
        }
        
        return ones;
    }
}
