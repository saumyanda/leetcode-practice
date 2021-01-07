class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
       List<List<Integer>> result=new LinkedList<>();
        
       if(candidates==null || candidates.length==0)
       {
           return result;
       }
       
        Arrays.sort(candidates);
        
        List<Integer> combination=new LinkedList<>();
        
        combSum(result,combination,candidates,target,0);
        
        return result;
        
    }
    
public void combSum(List<List<Integer>> result, List<Integer> combination, int[] candidates, int target, int startIndex)
    {
       if(target==0)
       {
           result.add(new LinkedList<>(combination));
           return;
       }
                      
        for(int i=startIndex;i<candidates.length;i++)
        {
              if(candidates[i] > target)
              {
                  break;
              }
            
            combination.add(candidates[i]);
            combSum(result,combination,candidates,target-candidates[i],i);
            combination.remove(combination.size()-1);
        }
    }
    
}
