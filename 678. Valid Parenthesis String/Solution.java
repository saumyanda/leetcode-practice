class Solution {
    
    //https://youtu.be/KuE_Cn3xhxI
    public boolean checkValidString(String s) {
        
        Stack<Integer> open=new Stack<Integer>();
        Stack<Integer> star=new Stack<Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(c=='(')
            {
                open.push(i);
            }
            
            if(c=='*')
            {
                star.push(i);
            }
            
            if(c==')')
            {
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!star.isEmpty())
                {
                    star.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        //process remaining open parentheses
        while(!open.isEmpty())
        {
            if(star.isEmpty()) //string cannot be balanced
            {
                return false;
            }
            
            else if(open.peek()<star.peek())
            {
                open.pop();
                star.pop();
            }
            
            else //open.peek() > star.peek()
            {
                return false;
            }
        }
        
        return true; 
    }
}
