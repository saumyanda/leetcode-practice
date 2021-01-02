class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=0;
        int actualsum=0;
        
        for(int i=0;i<=nums.length;i++)
        {
            totalsum+=i;
        }
        
        for(int j=0;j<nums.length;j++)
        {
            actualsum+=nums[j];
        }
        
        return totalsum-actualsum;
    }
}
