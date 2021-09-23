class Solution {
    public int[] plusOne(int[] digits) {

        //traverse the input array starting from the end 
        for(int i=digits.length-1;i>=0;i--)
        {
            //if a nine is found set it to zero
            if(digits[i]==9)
            {
                digits[i]=0;
            }
            //for numbers that are not nine, 
            //increment the last non-nine digit by 1 and return 
            else
            {
                digits[i]++;
                
                return digits;
            }
        }
        
        //for numbers with all nines
        //add a 1 at the beginning for the carry
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
