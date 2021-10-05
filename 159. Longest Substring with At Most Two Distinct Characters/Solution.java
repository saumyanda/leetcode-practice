class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int windowStart=0;
        int max=Integer.MIN_VALUE;
        
        HashMap<Character,Integer> counts=new HashMap<>();
        
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++)
        {
            char rightChar=s.charAt(windowEnd);
//keep adding one character in the sliding window (i.e., slide the window ahead) in a stepwise fashion
            counts.put(rightChar, counts.getOrDefault(rightChar,0)+1);
            
//shrink the window from the beginning if the count of distinct characters in the HashMap is larger than 2
            while(counts.size()>2) //shrink the window till it gets to size 2
            {
                char leftChar=s.charAt(windowStart);
                counts.put(leftChar,counts.get(leftChar)-1);
//While shrinking, we’ll decrement the character’s frequency going out of the window and remove it from the HashMap if its frequency becomes zero.
                if(counts.get(leftChar)==0)
                {
                    counts.remove(leftChar);
                }
                windowStart++;
            }
//check if the current window length is the longest so far, and if so, remember its length
            max=Math.max(max,windowEnd-windowStart+1);
        }
        
        return max==Integer.MIN_VALUE ? 0 : max;
    }
}
