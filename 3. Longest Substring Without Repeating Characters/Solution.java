class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int windowStart=0;
        int maxLength=0;
        
        //map of characters and their indexes
        HashMap<Character,Integer> map=new HashMap<>();
        
        // if the map already contains the 'rightChar', 
        // shrink the window from the beginning so that
        // we have only one occurrence of 'rightChar'
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++)
        {
            char rightChar=s.charAt(windowEnd);
            if(map.containsKey(rightChar))
            {
                // this is tricky; in the current window, 
                // we will not have any 'rightChar' after its previous index
                // and if 'windowStart' is already ahead of the 
                // last index of 'rightChar',   we'll keep 'windowStart'
                windowStart=Math.max(windowStart, map.get(rightChar)+1);
            }
            map.put(rightChar,windowEnd); // insert the 'rightChar' into the map
            
            // remember the maximum length so far
            maxLength=Math.max(maxLength, windowEnd-windowStart+1); 
        }
        
        return maxLength;
    }
}
