class Solution {
   
    public String addStrings(String num1, String num2) {
        
        //Initialize an empty res structure. Start from carry = 0
        StringBuilder res=new StringBuilder();
        
    //Set a pointer at the end of each string: i = num1.length() - 1, j = num2.length() - 1
        int i=num1.length()-1;
        int j=num2.length()-1;
        
        int carry=0;

        //Loop over the strings from the end to the beginning using i and j 
        //Stop when both strings are used entirely.
        while(i>=0 || j>=0)
        {
            //Set x to be equal to a digit from string nums1 at index i. 
            //If i has reached the beginning of nums1, set x to 0
            int x= i>=0 ? num1.charAt(i)-'0' : 0;
            
            //Do the same for y. 
            //Set y to be equal to digit from string nums2 at index j. 
            //If j has reached the beginning of nums2, set y to 0.
            int y= j>=0 ? num2.charAt(j)-'0' : 0;
            
            
            //Compute the current value: value = (x1 + x2 + carry) % 10, 
            //and update the carry: carry = (x1 + x2 + carry) / 10
            int value=(x+y+carry)%10;
            carry=(x+y+carry)/10;
            
            //Append the current value to the result: res.append(value)
            res.append(""+value);
            i--;
            j--;
        }
       
        //Now both strings are done. 
        //If the carry is still non-zero, update the result: res.append(carry)
        if(carry>0)
        {
            res.append(carry);
        }
        
        //Reverse the result, convert it to a string, and return that string
        return res.reverse().toString();
    }
}
