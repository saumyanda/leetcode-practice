public class Pair {
    char first;
    int second;
    Pair(char f, int s)
    {
        this.first=f;
        this.second=s;
    }  
}
class Solution {
    
    public String removeDuplicates(String s, int k) {
    int c=1;
        
Stack<Pair> st=new Stack<Pair>();
    
    Pair p;
        
    String rev="";
        
    String res="";
        
    for(int i=0;i<s.length();i++)
    {
        if(st.empty() || st.peek().first != s.charAt(i))
        {
            p=new Pair(s.charAt(i),1);
            st.push(p);
        }
        else
        {
            st.peek().second++;
            int count=st.peek().second;
            if(count==k)
            {
                st.pop();
            }    
            
        }
    }
       while(!st.empty())
       {
           Pair p1=st.pop();
           for(int j=0;j<p1.second;j++)
           {
               rev+=p1.first;
           }
       }
        
    for(int l=rev.length()-1;l>=0;l--)
        res+=rev.charAt(l);
        
    return res;
        
    }
}
