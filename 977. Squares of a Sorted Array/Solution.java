class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result=new int[nums.length];
        
        int j=0;
        
        for(int i=nums.length-1;i>=0;i--)
        {
            result[j]=nums[i]*nums[i];
            j++;
        }
        
        Arrays.sort(result);
        
        return result;
    }
}
