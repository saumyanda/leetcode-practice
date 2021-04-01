class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        
        helper(nums,0,new ArrayList<Integer>(), result);
        
        return result;
    }
    public void helper(int[] nums, int idx, List<Integer> current, List<List<Integer>> result)
    {
        result.add(new ArrayList<Integer>(current));
        
        for(int i=idx;i<nums.length;i++)
        {
            current.add(nums[i]);
            helper(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
    
    
}
