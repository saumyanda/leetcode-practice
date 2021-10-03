class Solution {
    //https://youtu.be/eyCj_u3PoJE
    public List<String> generateParenthesis(int n) {
        
        //variable to keep count of opening and closing parentheses remaining
        int open=n;
        int close=n;
        
        List<String> result=new LinkedList<String>();
        
        //starting from an empty string initially
        StringBuilder option=new StringBuilder();
        
        solve(open,close,option,result);
        
        return result;
    }
    
    private void solve(int open, int close, StringBuilder option, List<String> result)
    {
        //once all open and closed parentheses have been used up
        if(open==0 && close==0)
        {
            result.add(option.toString());
            return;
        }
        
        //We always have the option to choose an open parentheses
        //until the number of open parentheses gets to 0
        if(open > 0)
        {
           option.append("(");
           solve(open-1,close,option,result); //choose open parentheses
           option.deleteCharAt(option.length()-1);
        }
        
        //We only have the option to choose a closed parentheses
        //if there are extra open parentheses left in the string
        //meaning it requires closed parentheses to close the extra open parentheses
        //open < close -> extra open parentheses used so count of remaining open is less
        if(open < close)
        {
            option.append(")");
            solve(open,close-1,option,result);
            option.deleteCharAt(option.length()-1);
        }
    }
}
