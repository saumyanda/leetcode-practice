class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=Integer.MIN_VALUE;
        
        for(int[] row : accounts)
        {
            int rowSum=0;
            
            for(int i=0;i<row.length;i++)
            {
                rowSum+=row[i];
            }
            
            if(rowSum>max)
            {
                max=rowSum;
            }
        }
        
        return max;
    }
}
