class Solution {
    public int countSquares(int[][] matrix) {
//https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/643429/Python-DP-Solution-%2B-Thinking-Process-Diagrams-(O(mn)-runtime-O(1)-space)
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        int res=0;
        
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(matrix[r][c]==1)
                {
                    if(r==0 || c==0)
                    {
                        res+=1; //each cell is a 1x1 square on it's own
                    }
                    else
                    {
                        //each cell depends on it's neighbors
                        //take the minimum of all of it's neighbors
                        //each combo is only as strong as it's weakest link
                    //if any of the neighbors contains  0 it can't form a bigger square
                    //instead take the square of size 1x1  
                        int cellValue=matrix[r][c]+
                        Math.min(
                            Math.min(matrix[r-1][c],matrix[r][c-1]),matrix[r-1][c-1]
                        );

                        res+=cellValue;

                        //memoize the result
                        matrix[r][c]=cellValue;
                    }
                }
            }
        }
        
        return res;
    }
}
