class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           
           int rows=matrix.length;
        
           int cols=matrix[0].length;
        
           //Visualize the 2d matrix as a sorted 1d array of size rows*cols
           int left=0, right=rows*cols-1;
           
           while(left<=right)
           {
               int middleIndex=(left+right)/2;
               
               int middleElement=matrix[middleIndex/cols][middleIndex%cols];
               
               if(target==middleElement)
               {
                   return true;
               }
               
               else if(target<middleElement)
               {
                   right=middleIndex-1;
               }
               else
               {
                   left=middleIndex+1;
               }
           }
        
        return false;
           
    }
}
