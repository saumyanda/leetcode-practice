class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
if((s.contains("(") && !s.contains(")")) || (s.contains(")") && !s.contains("(")))
return false;
            
if((s.contains("{") && !s.contains("}")) || (s.contains("}") && !s.contains("{")))
return false;
            
if((s.contains("[") && !s.contains("]")) || (s.contains("]") && !s.contains("[")))
return false;
            
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
                if(s.charAt(i)=='}' && !st.empty())
                {
                    if(st.peek()=='{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                
              if(s.charAt(i)==']' && !st.empty())
              {
                  if(st.peek()=='[')
                  {
                      st.pop();
                  }
                  else
                  {
                      return false;
                  }
              }
                
            
            if(s.charAt(i)==')' && !st.empty())
            {
                if(st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        
                
        }
        
        if(st.empty())
        {
            return true;
        }
        
        return false; 
    }
}
