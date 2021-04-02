class Solution {
    public int removeElement(int[] nums, int val) {
        int length=0;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                length++;
                nums[index]=nums[i];
                index++;
            }
        }
        return length;
    }
}
