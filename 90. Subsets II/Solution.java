class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> result=new ArrayList<>();
      Arrays.sort(nums);
      helper(nums,0,new ArrayList<Integer>(),result);
      Set<List<Integer>> res=new HashSet<>(result);
      result=new ArrayList<>(res); 
      return result;
    }
    
public void helper(int[] nums, int idx, List<Integer> current, List<List<Integer>> result)
    {
     result.add(new ArrayList<>(current));
     for(int i=idx; i<nums.length; i++)
     {
         current.add(nums[i]);
         helper(nums,i+1,current,result);
         current.remove(current.size()-1);
     }
    }
}
