class Solution {
    public int compress(char[] chars) {
        
        int i=0, j=0;
        int index=0;
       
        //2 pointer i and j
        //i for each group of chars
        //j for counting occurence of each character
        //count of each character = j-i
        //Move j ahead till the next character is different from chars[i]
//If number of occurences of character is (j-i) > 1: then add the count after the character e.g. a 12 would be a "1" "2"
        //Move i ahead to the next character group i=j
        while(i<chars.length)
        {
            while(j<chars.length && chars[j]==chars[i])
            {
                j++;
            }
            
            //modify the array inplace to show the result
            chars[index]=chars[i];
            index++;
            
            if(j-i > 1)
            {
                String count=j-i+"";
                for(int k=0;k<count.length();k++)
                {
                    chars[index]=count.charAt(k);
                    index++;
                }
            }
            
            i=j;  
        }
        
        return index;
    }
}
