class Solution {
public List<List<Integer>> combinationSum2(int[] candidates, int target)    {
       List<List<Integer>> result=new ArrayList<>();
        
       Arrays.sort(candidates);
        
       helper(candidates,target,0,new ArrayList<>(),result);
        
       return result;
    }
    
public void helper(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result)
{
    if(target==0)
    {
        result.add(current);
        return;
    }
    if(target<0)
    {
        return;
    }
    
    for(int i=index;i<candidates.length;i++)
    {
        if(i==index || candidates[i]!=candidates[i-1])
        {
            current.add(candidates[i]);
    helper(candidates,target-candidates[i],i+1,new ArrayList<>(current),result);
            current.remove(current.size()-1);
        }
    }
}
}
