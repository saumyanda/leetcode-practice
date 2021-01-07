class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        
        result.add(new ArrayList<>());
        
        for(int i=0;i<nums.length;i++)
        {
            List<List<Integer>> current=new ArrayList<>();
            
            for(List<Integer> l: result)
            {
                for(int j=0;j<l.size()+1;j++)
                {
                    l.add(j,nums[i]);
                    
                    List<Integer> temp=new ArrayList<Integer>(l);
                    current.add(temp);
                    
                    l.remove(j);
                }
            }
            
            result=new ArrayList<>(current);
        }
        
        return result;
       
    }
}
