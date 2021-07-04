class Solution {
    
    private Map<Character, char[]> KEYBOARD=new HashMap<>();
    
    public List<String> letterCombinations(String digits) {
        
        KEYBOARD.put('2', "abc".toCharArray());
        KEYBOARD.put('3', "def".toCharArray());
        KEYBOARD.put('4', "ghi".toCharArray());
        KEYBOARD.put('5', "jkl".toCharArray());
        KEYBOARD.put('6', "mno".toCharArray());
        KEYBOARD.put('7', "pqrs".toCharArray());
        KEYBOARD.put('8', "tuv".toCharArray());
        KEYBOARD.put('9', "wxyz".toCharArray());
        
        List<String> res=new LinkedList<>();
        
        if(digits.length()==0)
            return res;
        
        StringBuilder path=new StringBuilder();
        
        dfs(path,res,digits.toCharArray());
        
        return res;
    }
    
    private void dfs(StringBuilder path, List<String> res, char[] digits)
    {
        if(path.length()==digits.length)
        {
            res.add(path.toString());
            return;
        }
        
        char[] letters=KEYBOARD.get(digits[path.length()]);
        
        for(int i=0;i<letters.length;i++)
        {
            path.append(letters[i]);
            dfs(path,res,digits);
            path.deleteCharAt(path.length()-1);
        }
    }
}
