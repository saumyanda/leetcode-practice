class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> j=new HashSet<Character>();
        
        for(int i=0;i<jewels.length();i++)
        {
            j.add(jewels.charAt(i));
        }
        
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            if(j.contains(stones.charAt(i)))
            {
               count++; 
            }
        }
        
        return count;
            
    }
}
