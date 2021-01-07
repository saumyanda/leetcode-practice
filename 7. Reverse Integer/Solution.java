class Solution {
    public int reverse(int x){
    try{
      String reversed="";
      int n=x;
      int rev=0;
      while(x!=0)
      {
          reversed+=Math.abs(x%10);
          x=x/10;
      }
        
        
        if(n<0){
        rev=Integer.parseInt(reversed);
        rev=-1*rev;
        }
        
        else
        {
        rev=Integer.parseInt(reversed);
        }
        
        return rev;
    }
    catch(Exception e)
    {
        return 0;
    }
}
}
