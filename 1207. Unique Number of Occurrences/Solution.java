class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> counts=new HashMap<>();
        
        for(int num:arr)
        {
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        
        List<Integer> l=new LinkedList<>(counts.values());
        
        Collections.sort(l);
        
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i)==l.get(i+1))
            {
                return false;
            }
        }
        
        return true;
    }
}
