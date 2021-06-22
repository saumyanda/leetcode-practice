class Solution {
    /*
    Initialize 2 integer variables. Set both of them equal to the first value in the array.

currentSubarray will keep the running count of the current subarray we are focusing on.
maxSubarray will be our final return value. 

Continuously update it whenever we find a bigger subarray.

Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables). 

For each number, add it to the currentSubarray we are building. If currentSubarray becomes negative, we know it isn't worth keeping, so throw it away. 

Remember to update maxSubarray every time we find a new maximum.

Return maxSubarray.

Implementation

A clever way to update currentSubarray is using 
currentSubarray = max(num, currentSubarray + num). 

If currentSubarray is negative, then num > currentSubarray + num.

*/
    
    public int maxSubArray(int[] nums) {
        
        int maxsum=nums[0];
        int currsum=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum=Math.max(currsum, maxsum);
        }
        
        return maxsum;
    }
}
