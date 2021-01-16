class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
     HashMap<Integer,Integer> count=new HashMap<Integer,Integer>();
     for(int i=0;i<nums.length;i++)
     {
         if(count.containsKey(nums[i]))
         {
           count.put(nums[i], count.get(nums[i])+1);  
         }
         else
         {
           count.put(nums[i], 1);
         }
    }
        
    for(Map.Entry<Integer,Integer> entry:count.entrySet())
    {
        if(entry.getValue()==1)
            result=entry.getKey();
    }
        return result;       
  }
}
