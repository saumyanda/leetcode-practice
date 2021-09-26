class Solution {
    
    /*
    Loop through the grid, for each element at (i, j) perform DFS to get the max value;
if (i, j) is out of the bound, or grid[i][j] == 0, or visited already, return current sum;
Otherwise, recurse to the neighbors and accumulate the sum.
    */
    private final int[] deltaRows={-1,0,1,0};
    private final int[] deltaCols={0,1,0,-1};
    
    public int getMaximumGold(int[][] grid) {
       
        int maxgold=0;
        int sum=0;
        int rows=grid.length;
        int cols=grid[0].length;
        
        boolean[][] visited=new boolean[rows][cols];
        //Loop through the grid, for each element at (i, j) perform DFS to get the max value
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                maxgold=Math.max(maxgold,dfs(grid,r,c,sum,visited));
            }
        }
        
        return maxgold;
    }
    
    public int dfs(int[][] grid, int r, int c, int sum, boolean[][] visited)
    {
        //if current cell r and c is out of bounds from the grid or 
        //if the current cell has 0 gold, don't visit and return sum
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0)
        {
            return sum;
        }
        
        //if visited don't visit the cell again
        if(visited[r][c]==true)
        {
            return sum;
        }
        
        int maxgold=0;
        //take the gold in the cell
        //visit it
        sum+=grid[r][c];
        visited[r][c]=true;
        
        //do a dfs on the neighbors
        //traverse it's 4 neigbors to get max value
        for(int i=0;i<deltaRows.length;i++)
        {
            maxgold=Math.max(maxgold,dfs(grid,r+deltaRows[i],c+deltaCols[i],sum,visited));
        }
        
        //backtrack
        sum-=grid[r][c];
        visited[r][c]=false;
        
        return maxgold;
    }
}
