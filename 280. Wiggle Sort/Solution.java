class Solution {
    /*
    The final sorted nums needs to satisfy two conditions:

    If i is odd, then nums[i] >= nums[i - 1];

    If i is even, then nums[i] <= nums[i - 1].

    The code is just to fix the orderings of nums that do not satisfy 1 and 2.
    */
    public void wiggleSort(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(i%2==0)
            {
                if(nums[i]>nums[i+1])
                {
                   int temp=nums[i+1];
                   nums[i+1]=nums[i];
                   nums[i]=temp;
                }
            }
            else
            {
                if(nums[i]<nums[i+1])
                {
                   int temp=nums[i+1];
                   nums[i+1]=nums[i];
                   nums[i]=temp;
                }
            }
        }  
    }
    
}
