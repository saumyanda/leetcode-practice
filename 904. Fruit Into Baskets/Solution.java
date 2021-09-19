class Solution {
    public int totalFruit(int[] fruits) {
        
        int maxTotalFruits=0;
        
        HashMap<Integer,Integer> tree_counts=new HashMap<>();
        
        int windowStart=0;
        
        for(int windowEnd=0;windowEnd<fruits.length;windowEnd++)
        {
            int rightTree=fruits[windowEnd];
            
            tree_counts.put(rightTree, tree_counts.getOrDefault(rightTree,0)+1);
            
            while(tree_counts.size()>2)
            {
                int leftTree=fruits[windowStart];
                
                tree_counts.put(leftTree,tree_counts.get(leftTree)-1);
                
                if(tree_counts.get(leftTree)==0)
                {
                    tree_counts.remove(leftTree);
                }
                windowStart++;
            }
            
            maxTotalFruits=Math.max(maxTotalFruits,windowEnd-windowStart+1);
        }
        
        return maxTotalFruits;
    }
}
