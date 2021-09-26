class Solution {
    /*
We use slow and fast pointers. The fast one moves one element at a time.

If the current element is 0, do nothing.
If the current element is non-0, swap its element with the slow pointer’s element and move the slow pointer.
The slow pointer always points to the next 0 if there is one.

The order of non-0 elements is preserved because the early one always gets swapped to the early 0s.
    */
    public void moveZeroes(int[] nums) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=0)
            {
                int temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
        }
    }
}
