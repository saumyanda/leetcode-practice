//https://leetcode.com/problems/matrix-block-sum/discuss/477041/Java-Prefix-sum-with-Picture-explain-Clean-code-O(m*n)

//range sum reference: https://youtu.be/PwDqpOMwg6U

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int[][] T = new int[mat.length+1][mat[0].length+1];
        
        for(int i=0;i<T.length;i++)
        {
            T[i][0]=0;
        }
        
        for(int j=0;j<T[0].length;j++)
        {
            T[0][j]=0;
        }
        
        for(int i=1;i<T.length;i++)
        {
            for(int j=1;j<T[0].length;j++)
            {
                T[i][j]=mat[i-1][j-1]+T[i-1][j]+T[i][j-1]-T[i-1][j-1];
            }
        }
        
        int[][] ans=new int[mat.length][mat[0].length];
        
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                int row1=Math.max(0,i-k);
                int col1=Math.max(0,j-k);
                int row2=Math.min(mat.length-1,i+k);
                int col2=Math.min(mat[0].length-1,j+k);
                
                row1++;
                col1++;
                row2++;
                col2++;
                
            ans[i][j]=T[row2][col2]-T[row1-1][col2]-T[row2][col1-1]+T[row1-1][col1-1];
            }
        }
        
        return ans;
    }
}
