class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,0,result);
        return result;
       
    }
    
public void helper(int[] nums, int idx, List<List<Integer>> result)
    {
     if(idx==nums.length-1)
     {
         List<Integer> current=new ArrayList<Integer>();
         for(int i=0;i<nums.length;i++)
         {
             current.add(nums[i]);
         }
         result.add(current);
     }
    
    for(int i=idx;i<nums.length;i++)
    {
        swap(nums,i,idx);
        helper(nums,idx+1,result);
        swap(nums,i,idx);
    }
    }
    
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
