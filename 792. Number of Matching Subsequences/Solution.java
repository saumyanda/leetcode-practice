class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        //https://youtu.be/Vch3pFgmKD8
        
        int numSubSequence=0;
      /*  
    Keep a hashmap from characters in s to a list of words starting with that character
    a -> "a","acd","ace"
    b->"bb"
    For each character in s, 
        cancel out the maching starting charcter from both sides of the hashmap
    if after cancelling out the character(taking a substring starting from index 1)
    the word becomes empty -> means a subsequence is found so increment result by 1
    
    else
    take the remaining substrings after removing the 1st character and add them to the
    map again with starting charcter -> word format
    */
        HashMap<Character,Queue<String>> mappings=new HashMap<>();
        
        for(char c: s.toCharArray())
        {
            mappings.put(c,new LinkedList<>());
        }
        
        //search for words that start with each character in s
        for(String word: words)
        {
            char startCharacter=word.charAt(0);
            
            if(mappings.containsKey(startCharacter))
            {
                mappings.get(startCharacter).offer(word);
            }
        }
        
        for(int i=0; i<s.length(); i++)
        {
            Queue<String> q=mappings.get(s.charAt(i));
            int size=q.size();
            
            for(int j=0; j<size; j++)
            {
                String sub=q.poll();
                if(sub.substring(1).length()==0)
                {
                    numSubSequence++;
                }
                else
                {
                    if(mappings.containsKey(sub.charAt(1)))
                    {
                        mappings.get(sub.charAt(1)).offer(sub.substring(1));
                    }
                }
            }
        }
        
        return numSubSequence;
        
    }
}
