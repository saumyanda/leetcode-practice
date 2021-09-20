class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        //sort input array to apply 2 pointer strategy
        Arrays.sort(nums);
        
        List<List<Integer>> result=new LinkedList<>();
        
        for(int i=0;i<nums.length && nums[i]<=0;i++)
        {
            if(i==0 || nums[i-1]!=nums[i])
            {
                //call two sum to find a pair with target equal to -nums[i]
                TwoSum(result,i,nums);
            }
        }
        return result;
    }
    
    public void TwoSum(List<List<Integer>> result, int i, int[] nums)
    {
        int lo=i+1;
        int high=nums.length-1;
        
        while(lo<high)
        {
            int sum=nums[i]+nums[lo]+nums[high];
            
            if(sum<0)
            {
                lo++;
            }
            else if(sum>0)
            {
                high--;
            }
            else
            {
                result.add(Arrays.asList(nums[i],nums[lo++],nums[high--]));
                while(lo<high && nums[lo]==nums[lo-1])
                {
                    lo++;
                }
            }
        }
    }
}
