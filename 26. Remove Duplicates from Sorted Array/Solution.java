class Solution {
    public int removeDuplicates(int[] nums) {
       
        /*
        Since the array is sorted duplicate elements will be next to each other
        first element is always unique so we can start index from 1
        index is a variable for where to place the number
        */
        int index=1;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[index]=nums[i+1];
                index++;
            }
        }
        
        return index;
    }
}
