class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        int val1=0,val2=0;
        int result=0;
        
        for(int i=0;i<tokens.length;i++)
        {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*"))
            {
                st.push(Integer.parseInt(tokens[i]));
            }
            
            if(tokens[i].equals("+"))
            {
                val2=st.pop();
                val1=st.pop();
                result=val1+val2;
                st.push(result);
            }
            
           if(tokens[i].equals("-"))
            {
                val2=st.pop();
                val1=st.pop();
                result=val1-val2;
                st.push(result);
            }
            
            if(tokens[i].equals("/"))
            {
                val2=st.pop();
                val1=st.pop();
                result=val1/val2;
                st.push(result);
            }
            
            if(tokens[i].equals("*"))
            {
                val2=st.pop();
                val1=st.pop();
                result=val1*val2;
                st.push(result);
            }
        }
       
        return st.peek();
        
    }
}
