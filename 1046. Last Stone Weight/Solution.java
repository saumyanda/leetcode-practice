class Solution {
    public int lastStoneWeight(int[] stones) {
       
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>();
        
        for(int stone: stones)
        {
            maxHeap.add(-stone);
        }
        
        while(maxHeap.size()>1)
        {
            int stone1=-maxHeap.remove();
            int stone2=-maxHeap.remove();
            
            if(stone1>stone2)
            {
                maxHeap.add(-(stone1-stone2));
            }
            if(stone2>stone1)
            {
                maxHeap.add(-(stone2-stone1));
            }
        }
        
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
        
    }
}
