class Solution {
    
    public String decimalToBinary(int n)
    {
        String result="";
        while(n>0)
        {
           result+=n%2;
           n=n/2;
        }
        return result;
    }
    
    public int hammingDistance(int x, int y) {
        
        int hammingdist=0;
        
        String s1=decimalToBinary(x);
        String s2=decimalToBinary(y);
        
        int lengthdifference=0;
        
        if(s1.length()>s2.length())
        {
            lengthdifference=s1.length()-s2.length();
            
            for(int i=0;i<lengthdifference;i++)
            {
                s2+="0";
            }
        }
        
        if(s2.length()>s1.length())
        {
            lengthdifference=s2.length()-s1.length();
            
            for(int i=0;i<lengthdifference;i++)
            {
                s1+="0";
            }
        }
        
        int j=0;
        
        while(j<s1.length())
        {
            if(s1.charAt(j)!=s2.charAt(j))
            {
                hammingdist++;
            }
            j++;
        }
        
       return hammingdist;
    }
}
