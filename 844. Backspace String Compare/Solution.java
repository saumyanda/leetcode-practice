class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> st1=new Stack<Character>();
        Stack<Character> st2=new Stack<Character>();
        
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)!='#')
            {
            st1.push(S.charAt(i));
            }
            else if(!st1.empty())
            {
                st1.pop();
            }
        }
    
        for(int j=0; j<T.length(); j++)
        {
             if(T.charAt(j)!='#')
            {
            st2.push(T.charAt(j));
            }
            else if(!st2.empty())
            {
                st2.pop();
            }
        }
        
        if(st1.toString().equals(st2.toString()))
            return true;
        
        return false;
        
    }
}
