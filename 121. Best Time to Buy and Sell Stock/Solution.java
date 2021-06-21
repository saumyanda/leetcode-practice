class Solution {
    public int maxProfit(int[] prices) {
        /*
        The sentence "We need to find the largest peak following the smallest valley" is plain wrong. 
        What we are actually doing is this: for every element, 
        we are calculating the difference between that element and the minimum of all the values before that element 
        and we are updating the maximum profit if the difference thus found is greater than the current maximum profit.
        */
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < minprice)
            {
                minprice=prices[i];
            }
            else if(prices[i]-minprice > maxprofit)
            {
                maxprofit=prices[i]-minprice;
            }
        }
        
        return maxprofit;
        
    }
}
