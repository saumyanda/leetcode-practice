class Solution {
    public String reverseWords(String s) {
       
        String res="";
        
        s=s.trim();
        
        //the plus sign at the end can check for multiple spaces
        //it treats multiple spaces as a single space
        //returns a string without any single or multiple whitespaces
    //https://stackoverflow.com/questions/13081527/splitting-string-on-multiple-spaces-in-java
        String[] words = s.split(" +");
        
        Stack<String> st = new Stack<String>();
        
        for(int i=0;i<words.length;i++)
        {
            st.push(words[i]);
        }
        
        while(st.size()>1)
        {
           res+=st.pop();
           res+=" ";
        }
        
        res+=st.pop();
        
        return res;
        
    }
}
