class Solution {
    
    /*
    Solution :- First create a boolean matrix for number of rows and another for number of columns
    Then iterate through the matrix if you find zero mark that row and column to zero in boolean matrix
    
    At the end of first iteration we have marked all the rows or columns that should be marked to zero.
    Now go throug the matrix one more time checking if either the current row or column is marked zero in boolean
    matrix if yes mark that value to zero
     */
    
    public void setZeroes(int[][] matrix) {
       
        boolean[] zeroRows=new boolean[matrix.length];
        boolean[] zeroColums=new boolean[matrix[0].length];
        
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroRows[i]=true;
                    zeroColums[j]=true;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(zeroRows[i] || zeroColums[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
       
    }
}
