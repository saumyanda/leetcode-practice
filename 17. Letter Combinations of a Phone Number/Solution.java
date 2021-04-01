class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> result=new ArrayList<String>();
       if(digits==null || digits.length()==0)
       {
           return result;
       }
       String[] mappings={"0",
                          "1",
                          "abc",
                          "def",
                          "ghi",
                          "jkl",
                         "mno",
                         "pqrs",
                         "tuv",
                         "wxyz"};
        
        helper(result,mappings,digits,0,"");
            
        return result;   
    }
    
    public void helper(List<String> result,String[] mappings, String digits, int idx, String current)
    {
        if(idx==digits.length())
        {
            result.add(current);
            return;
        }
        
        String letters=mappings[digits.charAt(idx)-'0'];
        
        for(int i=0;i<letters.length();i++)
        {
      helper(result,mappings,digits,idx+1,current+letters.charAt(i));
        }
    }
}
