class Solution {
    
    private void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void sortColors(int[] nums) {
        /*
        all elements < low are 0 and all elements > high are 2
        all elements from >= low < i are 1
        */
        int low=0;
        int high=nums.length-1;
        
        int i=0;
        
        while(i<=high)
        {
            if(nums[i]==0)
            {
                swap(nums,i,low);
                // increment 'i' and 'low'
                i++;
                low++;
            }
            else if(nums[i]==1)
            {
                i++;
            }
            else // the case for nums[i] == 2
            {
                swap(nums,high,i);
        // decrement 'high' only, after the swap the number at index 'i' could be 0, 1 or 2
                high--;
            }
        }
        
    }
}
