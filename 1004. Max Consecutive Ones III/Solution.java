class Solution {
    public int longestOnes(int[] nums, int k) {
      
        int windowStart=0;
        // maximum length of subarray with 1s
        // length of this array is the required result
        int maxLength=0;
        
        //maximum count of 1s in the window
        int maxOnesCount=0;
        
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++)
        {
            if(nums[windowEnd]==1)
            {
                maxOnesCount++;
            }
            
            //maximum k number of 0s can be replaced
            //so if the size of the window i.e. windowEnd-windowStart+1 is greater than k
            //reduce the size of the window so that max k 0s can be replaced
            if(windowEnd - windowStart + 1 - maxOnesCount > k)
            {
                if(nums[windowStart]==1)
                {
                    maxOnesCount--;
                }
                
                //shrink window size
                windowStart++;
            }
            
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        
        return maxLength;
    }
}
