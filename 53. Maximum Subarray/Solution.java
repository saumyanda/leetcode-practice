class Solution {
    public int maxSubArray(int[] nums) {
      int[] sum=new int[nums.length]; //Alternatively could be single variable sum
        sum[0]=nums[0];
        int result=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            sum[i]=Math.max(nums[i],sum[i-1]+nums[i]);//could be sum in all places line 9,10
            result=Math.max(result,sum[i]);
        }
        
        return result;
     
    }
}
