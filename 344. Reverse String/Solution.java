class Solution {
    public void reverseString(char[] s) {
      Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length;i++)
        {
            stack.push(s[i]);
        }
        
        int k=0;
        while(!stack.empty())
        {
            s[k]=stack.pop();
            k++;
        }
    }
}
