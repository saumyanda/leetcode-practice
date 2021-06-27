class Solution {
    public int search(int[] nums, int target) {
        
        int low=0,high=nums.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            //case 1: found target
            if(target==nums[mid])
            {
                return mid;
            }
            
            //case 2: right part of the array is sorted
            else if(nums[mid]<=nums[high])
            {
                //target lies in the right half of the array from mid+1 to high
                if(target>nums[mid] && target<=nums[high])
                {
                    low=mid+1; //go searching right
                }
                else
                {
                    high=mid-1; //go searching left
                }
            }
            
            //case 3: left part of the array is sorted
            else
            {
                //target lies in the left half of the array from low to mid-1
                if(target>=nums[low] && target<nums[mid])
                {
                    high=mid-1; //go seraching left
                }
                else
                {
                    low=mid+1; //go searching right
                }
            }
        }
        
       return -1; 
    }
}
