class Solution {
    public int compress(char[] chars) {
      
        int index=0;
        int i=0,j=0;
        
        while(i<chars.length)
        {
            while(j<chars.length && chars[j]==chars[i])
            {
                j++;
            }
            
            chars[index++]=chars[i];
            
            if(j-i>1)
            {
                String s=j-i+"";
                
                for(int k=0;k<s.length();k++)
                {
                    chars[index++]=s.charAt(k);
                }
            }
            
            i=j;
        }
        
        return index;
      
    }
}
