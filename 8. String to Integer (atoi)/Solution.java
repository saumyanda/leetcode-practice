class Solution {
    public int myAtoi(String str) {
      
        //remove whitespaces from beginning and end of string
        str=str.trim();
        
        //empty input string
        if(str.length()==0 || str==null){
            return 0;
        }
     
        //handle signs
        int start=0;
        boolean isNegative=false;
        
        if(str.charAt(0)=='+' || str.charAt(0)=='-')
        {
           start++; 
        }
        
        if(str.charAt(0)=='-')
        {
          isNegative=true;  
        }
        
        double num=0;
        for(int i=start;i<str.length();i++)
        {
            //non numeric characters
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
            {
                break;
            }
            //numeric characters
            num=num*10+(str.charAt(i)-'0');
        }
        
        //handle negative numbers
        if(isNegative==true)
            num=-num;
            
        //handle max and min values
        if(num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)num;
    }
}
