class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength=0;
        
        if(s.length()==0)
            return maxLength;
            
        HashMap<Character,Integer> character_counts=new HashMap<>();
        
        int windowStart=0;
        
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
            char rightChar=s.charAt(windowEnd);
            character_counts.put(rightChar,character_counts.getOrDefault(rightChar,0)+1);
            
            while(character_counts.get(rightChar)>1)
            {
                char leftChar=s.charAt(windowStart);
                character_counts.put(leftChar,character_counts.get(leftChar)-1);
                
                if(character_counts.get(leftChar)==0)
                {
                    character_counts.get(leftChar);
                }
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        
        return maxLength;
        
    }
}
