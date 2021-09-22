class Solution {
    //https://youtu.be/54nJhM2AZv4
    public double knightProbability(int n, int k, int row, int column) {
        
       double[][] curr=new double[n][n];
       double[][] next=new double[n][n];
        
       //the starting position has probability 1 bcoz the knight is initially present there
       curr[row][column]=1;
        
       int[] dr={-2,-1,1,2,2,1,-1,-2};
       int[] dc={1,2,2,1,-1,-2,-2,-1};
        
       for(int move=1; move<=k; move++)
       {
           for(int i=0; i<n; i++)
           {
               for(int j=0; j<n; j++)
               {
                   int new_r=0;
                   int new_c=0;
                   
                   if(curr[i][j]!=0)
                   {
                      for(int l=0;l<dr.length;l++)
                      {
                        new_r=i+dr[l];
                        new_c=j+dc[l];
                          
                        //check if the new position lies within the board
                          if(new_r>=0 && new_c>=0 && new_r<n && new_c<n)
                          {
                        //add the probability of going to the next index to the current index
                              next[new_r][new_c]+=curr[i][j]/8.0;
                          }
                      } 
                   }
               }
           }
           curr=next;
           next=new double[n][n];
       }
        
        double sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=curr[i][j];
            }
        }
        
        return sum;
        
    }
}
