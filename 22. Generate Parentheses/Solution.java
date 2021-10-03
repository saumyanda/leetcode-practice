class Solution {
    //https://youtu.be/eyCj_u3PoJE
    public List<String> generateParenthesis(int n) {
        
        //variable to keep count of opening and closing parentheses in string
        int open=0;
        int close=0;
        
        //maximum number of open and closed parentheses
        //we can have n open and n closed parentheses so 2*n
        int max=n;
        
        List<String> result=new LinkedList<String>();
        
        //starting from an empty string initially
        StringBuilder option=new StringBuilder();
        
        solve(open,close,option,result,max);
        
        return result;
    }
    
  private void solve(int open, int close, StringBuilder op, List<String> result, int max)
    {
        //once all open and closed parentheses have been used up
        if(open==max && close==max)
        {
            result.add(op.toString());
            return;
        }
        
        //We always have the option to choose an open parentheses
        //until the number of open parentheses selected gets to max
        if(open < max)
        {
           op.append("(");
           solve(open+1,close,op,result,max); //choose open parentheses
           op.deleteCharAt(op.length()-1);
        }
        
        //We only have the option to choose a closed parentheses
        //if there are extra open parentheses left in the string
        //meaning it requires closed parentheses to close the extra open parentheses
        //open > close -> extra open parentheses used so count of remaining open is less
        if(close < open)
        {
            op.append(")");
            solve(open,close+1,op,result,max);
            op.deleteCharAt(op.length()-1);
        }
    }
}
