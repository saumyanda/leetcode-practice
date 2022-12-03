class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        LinkedList<Integer> result=new LinkedList<Integer>();
        
        HashMap<Integer,Integer> counts1= new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> counts2= new HashMap<Integer,Integer>();

        for(int i=0;i<nums1.length;i++)
        {
            if(!counts1.containsKey(nums1[i]))
            {
                counts1.put(nums1[i], 1);
            }
            else
            {
                counts1.replace(nums1[i], counts1.get(nums1[i])+1);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(!counts2.containsKey(nums2[i]))
            {
                counts2.put(nums2[i], 1);
            }
            else
            {
                counts2.replace(nums2[i], counts2.get(nums2[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> set: counts2.entrySet())
        {
            if(counts1.containsKey(set.getKey()))
            {
    for(int i=0;i<Math.min(counts1.get(set.getKey()), counts2.get(set.getKey()));i++) {
                    result.add(set.getKey());
                }
            }
        }

        int[] res=new int[result.size()];
        int k=0;
        for(int e: result)
        {
            res[k]=e;
            k++;
        }

        return res;
    }
}
