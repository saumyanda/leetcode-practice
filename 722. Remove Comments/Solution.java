class Solution {
    public List<String> removeComments(String[] source) {
        
//                  Explaination of regex
//                  //.*     # matches single line comments
//                  |        # 'or' operator
//                  /\*      # matches '/*'
//                   (.|\n)*? # matches everything(including '\n') inside block comment
//                   # question mark will make regex '(.|\n)*' non-greedy or lazy
//                  \*/      # matches '*/'
        
 //https://leetcode.com/problems/remove-comments/discuss/109195/1-liners  
        
    String[] str=String.join("\n",source).replaceAll("//.*|/\\*(.|\n)*?\\*/", "").split("\n");
    
    List<String> result=new LinkedList<>();
        
        for(String s:str)
        {
            if(!s.equals(""))
            {
                result.add(s);
            }
        }
        
        return result;
        
    }
}
