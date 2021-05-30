class Solution {
   
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int start=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]>0)
           {
               start=i;
               break;
           }
       }
        HashSet<Integer> hs=new HashSet<>();
        
        for(int k=start;k<nums.length;k++)
        {
            hs.add(nums[k]);
        }
        
        for(int j=1; j<=nums.length+1;j++)
        {
            if(!hs.contains(j))
            {
                return j;
            }
        }
        
        return 1;
    }
}
