class Solution {
    public String reorganizeString(String S) {
        StringBuilder result=new StringBuilder();
        Map<Character,Integer> counts=new HashMap<>();
        
        for(int i=0;i<S.length();i++)
        {
            if(!counts.containsKey(S.charAt(i)))
            {
                counts.put(S.charAt(i),1);
            }
            else
            {
                counts.replace(S.charAt(i),counts.get(S.charAt(i))+1);
            }
        }
        
PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b) -> (counts.get(b)-counts.get(a)));
        maxHeap.addAll(counts.keySet());
        
        while(maxHeap.size()>1)
        {
            char current=maxHeap.remove();
            char next=maxHeap.remove();
            
            result.append(current);
            result.append(next);
            
            counts.replace(current,counts.get(current)-1);
            counts.replace(next,counts.get(next)-1);
            
            if(counts.get(current)>0)
            {
                maxHeap.add(current);
            }
            
             if(counts.get(next)>0)
            {
                maxHeap.add(next);
            }
        }
        
        if(!maxHeap.isEmpty())
        {
            char last=maxHeap.remove();
            
            if(counts.get(last)>1)
            {
                return "";
            }
            result.append(last);
        }
        
        return result.toString();  
    }
}
