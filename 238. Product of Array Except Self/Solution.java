class Solution {
    
    public int[] productLeft(int[] nums)
    {
        int[] l=new int[nums.length];
        
        l[0]=1;
        
        for(int i=1;i<nums.length;i++)
        {
            l[i]=l[i-1]*nums[i-1];
        }
        
        return l;
        
    }
    
    public int[] productRight(int[] nums)
    {
        int[] r=new int[nums.length];
        
        r[nums.length-1]=1;
        
        for(int i=nums.length-2;i>=0;i--)
        {
               r[i]=r[i+1]*nums[i+1];
        }
        return r;
    }
    public int[] productExceptSelf(int[] nums) {
        
        int[] output=new int[nums.length];
        
        int[] left=productLeft(nums);
        
        int[] right=productRight(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            output[i]=left[i] * right[i];
        }
        
        return output;
        
    }
}
