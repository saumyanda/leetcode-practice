class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        Map<Integer,Integer> remainders=new HashMap<>();
        
        int count=0;
        
        int currSum=0;
        
        remainders.put(0,1);
        
        for(int i=0;i<nums.length;i++)
        {
            currSum += nums[i];
            
            int remainder = currSum % k;
            int compliment = (k-remainder) % k;
            
            if(remainders.containsKey(compliment))
            {
                count+=remainders.get(compliment);
                remainders.replace(compliment, remainders.get(compliment)+1);
            }
            else
            {
                remainders.put(compliment,1);
            }
        }
        
        
        return count;
    }
}
