class Solution {
    public int findMin(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        
        while(low<high)
        {
          int pivot=low+(high-low)/2;
            
          //case 1: nums[pivot]<nums[high] 
          //right half from pivot to high is sorted
          //look in left half
          if(nums[pivot]<nums[high])
          {
              high=pivot;
          }
          
          //case 2: nums[pivot]>nums[high]
          //left half from low to pivot-1 is sorted
          //look in right half
          else if(nums[pivot]>nums[high])
          {
              low=pivot+1;
          }
            
          //case 3: nums[pivot]==nums[high]
          //desired minimum can be on either side of pivot, not sure which
          //reduce search space by 1 by doing high-1
          else if(nums[pivot]==nums[high])
          {
              high=high-1;
          }  
        }
        
        return nums[low];
    }
}
