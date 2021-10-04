class Solution {
    //counting sort
    //https://www.geeksforgeeks.org/counting-sort/
    //https://youtu.be/HkvChUv9dDg
    
    public int[] sortArray(int[] nums) {
        
        int[] result=new int[nums.length];
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        
        int[] counts=new int[max-min+1];
        
        Arrays.fill(counts,0);
        
        for(int i=0;i<nums.length;i++)
        {
            counts[nums[i]-min]++;
        }
        
        for(int i=1;i<counts.length;i++)
        {
            counts[i]+=counts[i-1];
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            result[counts[nums[i]-min]-1]=nums[i];
            counts[nums[i]-min]--;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=result[i];
        }
        
        return nums;
    }
}
