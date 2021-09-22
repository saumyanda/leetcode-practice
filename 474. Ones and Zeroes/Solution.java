class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int[][] dp=new int[m+1][n+1];
        
        for(String s:strs)
        {
            int[] counts=countOnesZeroes(s);
            
            for(int zeroes=m;zeroes>=counts[0];zeroes--)
            {
                for(int ones=n;ones>=counts[1];ones--)
                {
        dp[zeroes][ones]=Math.max(dp[zeroes][ones], 1+dp[zeroes-counts[0]][ones-counts[1]]);
                }
            }
        }
        
      return dp[m][n];
    }
    
    public int[] countOnesZeroes(String s)
   {
    int[] result=new int[2];
    
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        result[c-'0']++;
    }
    
     return result;
    }
}
