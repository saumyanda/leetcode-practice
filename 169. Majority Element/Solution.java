class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer> countmap=new HashMap<Integer, Integer>();
        
        int result=0;
        
     for(int i=0;i<nums.length;i++)
     {
         if(countmap.containsKey(nums[i]))
         {
             countmap.replace(nums[i],countmap.get(nums[i])+1);
         }
         else
         {
             countmap.put(nums[i],1);
         }
     }
        
     for(Map.Entry<Integer,Integer> entry : countmap.entrySet())
     {
         if(entry.getValue() > Math.floor(nums.length/2))
            result=entry.getKey();
     }
            
            return result;
    }
}
