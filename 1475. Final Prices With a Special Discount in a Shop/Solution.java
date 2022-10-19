class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result=new int[prices.length];
        
        for(int i=0;i<prices.length;i++)
        {
            result[i]=prices[i];
        }
        
        
        for(int i=0;i<prices.length;i++)
        {
            int currentPrice=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=currentPrice)
                {
                    result[i]=result[i]-prices[j];
                    break;
                }
            }
        }
        
        return result;
    }
}
