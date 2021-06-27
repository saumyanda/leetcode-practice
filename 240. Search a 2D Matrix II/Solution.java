class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //initialize a (row, col)(row,col) pointer to the bottom-left of the matrix
        int row=matrix.length-1;
        int col=0;
        
        while(col<=matrix[0].length-1 && row>=0)
        {
            //if the current value is larger than target we can move one row "up".
            if(matrix[row][col]>target)
            {
                row--;
            }
            //if current value is smaller than target, we can move one column "right"
            else if(matrix[row][col]<target)
            {
                col++;
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }
}
