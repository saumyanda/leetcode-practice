class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toUpperCase();
        
        String str="";
        String rev="";
        
        for(int i=0; i<s.length(); i++)
        {
            int ch = s.charAt(i);
            
            if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            {
                str += s.charAt(i);
            }
        }
        
        for(int j=str.length()-1; j>=0; j--)
        {
            rev += str.charAt(j);
        }
        
        if(str.equals(rev))
            return true;
        
        return false;
    }
}
