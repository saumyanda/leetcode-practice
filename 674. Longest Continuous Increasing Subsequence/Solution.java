class Solution {
    public int findLengthOfLCIS(int[] nums) {
        /*
Every (continuous) increasing subsequence is disjoint, and the boundary of each such subsequence occurs whenever nums[windowEnd-1] >= nums[windowEnd]. 
        
When it does, it marks the start of a new increasing subsequence at nums[windowEnd], and we store such i in the variable anchor.
        */
        int length=0;
        int windowStart=0;
        
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++)
        {
            if(windowEnd>0 && nums[windowEnd-1]>=nums[windowEnd])
            {
                windowStart=windowEnd;
            }
            length=Math.max(length,windowEnd-windowStart+1);
        }
        
        return length;
    }
}
