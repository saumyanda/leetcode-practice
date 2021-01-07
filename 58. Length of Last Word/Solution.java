class Solution {
    public int lengthOfLastWord(String s) {
       String[] words=s.split(" ");
       LinkedList<String> wordslist=new LinkedList<String>();
       
        for(int i=0;i<words.length;i++)
        {
            if(words[i]!=" "){
                wordslist.add(words[i]);
            } 
        }
        if(wordslist.size()==0)
            return 0;
        return (wordslist.get(wordslist.size()-1)).length();
    }
}
