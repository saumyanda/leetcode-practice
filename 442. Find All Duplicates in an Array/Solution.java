class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Map<Integer,Integer> countmap=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(countmap.containsKey(nums[i]))
                countmap.replace(nums[i],countmap.get(nums[i])+1);
            else
            countmap.put(nums[i],1);
        }
        
        List<Integer> result=new LinkedList<Integer>();
        
        for(Map.Entry<Integer,Integer> entry: countmap.entrySet())
        {
            System.out.println(entry);
            if(entry.getValue()==2)
                result.add(entry.getKey());
        }
        
        return result;
    }
}
