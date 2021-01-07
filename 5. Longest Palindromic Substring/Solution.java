class Solution {
    
    public String longestPalindrome(String s) {
        
     if(s==null || s.length()==0)
     {
         return "";
     }
    
    boolean isPalindrome[][]=new boolean[s.length()][s.length()];    
    
    //substrings of size 1
    for(int i=0;i<s.length();i++)
    {
      isPalindrome[i][i]=true;  
    }
        
    //substrings of size 2 and above 
        
    for(int len=2; len<=s.length(); len++)
    {
        for(int start=0; start+len-1<s.length(); start++)
        {
            int end=start+len-1;
            
            if(len==2)
            {
               if(s.charAt(start)==s.charAt(end))
               {
                  isPalindrome[start][end]=true;
               }     
            }
            
            else
            {
            if(s.charAt(start)==s.charAt(end) && 
               isPalindrome[start+1][end-1]==true)
               {
                  isPalindrome[start][end]=true;          
               }
            }   
        }
    }
        
        //Find max length palindrome
        int maxlength=Integer.MIN_VALUE;
        int start=-1;
        int end=-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome[i][j]==true && (j-i+1)>maxlength)
                {
                    maxlength=j-i+1;
                    start=i;
                    end=j;
                }
            }
        }
        
        return s.substring(start,end+1);
        
}
      
}
