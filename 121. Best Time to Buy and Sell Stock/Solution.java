class Solution {
    public int maxProfit(int[] prices) {
        
        int resultMaxProfit=0;
        
        if(prices.length==0)
        {
            return 0;
        }
        
        for(int i=0;i<prices.length-1;i++)
        {
           for(int j=i+1;j<prices.length;j++)
           {
               if(prices[j]-prices[i]>resultMaxProfit)
               {
                   resultMaxProfit=prices[j]-prices[i];
               }
           }
        }
        
        return resultMaxProfit;
    }
}
