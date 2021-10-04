//https://youtu.be/oBt53YbR9Kk
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        boolean[] target=new boolean[s.length()+1];
        
        target[0]=true;
        
        for(int i=0;i<=s.length();i++)
        {
            if(target[i]==true)
            {
                for(String word: wordDict)
                {
            if(i+word.length()<=s.length() && s.substring(i,i+word.length()).equals(word))
                    {
                        target[i+word.length()]=true;
                    }
                }
            }
        }
        
        return target[s.length()];
    }
}
