class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new LinkedList<Integer>();
        
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        if(rows==0 || cols==0)
            return result;
      
            int rowStart=0; //starting row index
            int colStart=0; //starting column index
            int rowEnd=rows-1; //ending row index
            int colEnd=cols-1; //ending column index
            
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
        for(int i=colStart; i<=colEnd; i++)
        {
            result.add(matrix[rowStart][i]);
        }
        rowStart++;
        
        for(int j=rowStart; j<=rowEnd; j++)
        {
           result.add(matrix[j][colEnd]);
        }
        colEnd--;
        
        if(rowStart<=rowEnd)
        {
        for(int c=colEnd; c>=colStart; c--)
        {
            result.add(matrix[rowEnd][c]);
        }
        rowEnd--;
        }
        
        if(colStart<=colEnd)
        {
        for(int p=rowEnd; p>=rowStart; p--)
        {
            result.add(matrix[p][colStart]);
        }
        colStart++;
        }
        }
        
        return result;
    }
}
