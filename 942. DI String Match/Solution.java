class Solution {
    public int[] diStringMatch(String s) {
        //Keep track of the smallest and largest element we haven't placed. 
        //If we see an 'I', place the small element; otherwise place the large element.
        
        int n=s.length();
        
        int lo=0;
        int high=n;
        
        int[] result=new int[n+1];
        
        for(int i=0; i<s.length(); i++)
        {
           if(s.charAt(i)=='I')
           {
               result[i]=lo;
               lo++;
           }
            else
            {
                result[i]=high;
                high--;
            }
        }
        
        result[n]=high; //could be either lo or high for the last element
        
        return result;
    }
}
