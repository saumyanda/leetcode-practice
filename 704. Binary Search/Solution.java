class Solution {
    public int binSearch(int[] nums, int target, int low, int high)
    {
        if(low<=high)
        {
        int middle=low+(high-low)/2;
        
        if(target==nums[middle])
            return middle;
        
        else if(target>nums[middle])
        {
            low=middle+1; 
        }
        
        else if(target<nums[middle])
        {
            high=middle-1;
        }
        return binSearch(nums,target,low,high);
        }
        else
        {
            return -1;
        }
    }
    public int search(int[] nums, int target) {
        return binSearch(nums,target,0,nums.length-1);
    }
}
