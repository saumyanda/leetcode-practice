class Solution {
    int resultStart=0;
    int resultLength=0;
    
    public String longestPalindrome(String s) {
        
        //for string of length 0 or 1 => already a palindrome
      if(s.length()<2)
      {
          return s;
      }
        
        for(int start=0; start<s.length(); start++)
        {
            expandRange(s,start,start); //string has even length, there is a clear midpoint
            expandRange(s,start,start+1); //string has odd length, there are 2 midpoints
        }
        
        return s.substring(resultStart, resultStart+resultLength);
    }
    
    private void expandRange(String s, int begin, int end)
    {
        //start from the middle and expand outwards comparing 2 elements every time
       while(begin>=0 && end<s.length() && s.charAt(begin)==s.charAt(end))
       {
           begin--;
           end++;
       }
        
    //if resultLength is smaller than the current found substring's length, update resultLength
        if(resultLength < end-begin-1)
        {
            //update member variables
            resultStart=begin+1;
            resultLength=end-begin-1;
        }
    }
}
