class Solution {
    public int numSubmat(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        
        int[][] dp=new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=m-1;j>=0;j--)
            {
                if(mat[i][j]==1)
                {
                    count += 1;
                }
                else
                {
                    count = 0;
                }
                dp[i][j]=count;
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int min=Integer.MAX_VALUE;
                for(int k=i;k<n;k++)
                {
                    min=Math.min(min,dp[k][j]);
                    res+=min;
                }
            }
        }
        
       return res; 
        
    }
}
