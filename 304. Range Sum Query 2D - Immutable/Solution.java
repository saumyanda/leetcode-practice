//https://youtu.be/PwDqpOMwg6U
class NumMatrix {
    
    private int[][] T;

    public NumMatrix(int[][] matrix) {
        
        int rows=matrix.length+1;
        int cols=matrix[0].length+1;
        
        T=new int[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            T[i][0]=0;
        }
        
        for(int j=0;j<cols;j++)
        {
            T[0][j]=0;
        }
        
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {
                T[i][j]=matrix[i-1][j-1]+T[i-1][j]+T[i][j-1]-T[i-1][j-1];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        row1++;
        col1++;
        row2++;
        col2++;
        
        return T[row2][col2]-T[row1-1][col2]-T[row2][col1-1]+T[row1-1][col1-1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
