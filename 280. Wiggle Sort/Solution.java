class Solution {
    /*
    The final sorted nums needs to satisfy two conditions:

    If i is odd, then nums[i] >= nums[i - 1];

    If i is even, then nums[i] <= nums[i - 1].

    The code is just to fix the orderings of nums that do not satisfy 1 and 2.
    */
    public void wiggleSort(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
        {
            if(i%2==0)
            {
                if(nums[i]>nums[i-1])
                {
                   swap(nums,i-1,i);
                }
            }
            else
            {
                if(nums[i]<nums[i-1])
                {
                   swap(nums,i-1,i);
                }
            }
        }  
    }
    
    private static void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
