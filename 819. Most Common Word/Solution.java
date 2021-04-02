class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> banWords=new HashSet<String>();
       
        for(String s:banned)
        {
            banWords.add(s.toLowerCase());
        } 
        
        paragraph=paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().trim();
        
        String[] words=paragraph.split(" ");
        
        Map<String,Integer> wordsCount=new HashMap<String,Integer>();
        
        for(int i=0;i<words.length;i++)
        {
            if(!banWords.contains(words[i]))
            {
               if(!wordsCount.containsKey(words[i]))
               {
                   wordsCount.put(words[i],1);
               }
                else
                {
                    wordsCount.replace(words[i],wordsCount.get(words[i])+1);
                }
            }
        }
        
       String result="";
        
        for(String s: wordsCount.keySet())
        {
            if(result.equals("") || 
               wordsCount.get(s) > wordsCount.get(result))
            {
                result=s;
            }
        }
        
        return result;
    }
}
