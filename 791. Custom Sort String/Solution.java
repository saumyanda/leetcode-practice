class Solution {
    public String customSortString(String order, String s) {
        
        int[] counts=new int[26];
        
        //take counts of every character in s
        for(char c:s.toCharArray())
        {
            counts[c-'a']++;
        }
        
        StringBuilder res=new StringBuilder();
        
        //append characters from order to res
        for(char c:order.toCharArray())
        {
            while(counts[c-'a']-- >0)
            {
                res.append(c);
            }
        }
        
        //append remaining characters from s to res
        for(char i='a';i<='z';i++)
        {
            while(counts[i-'a']-- > 0)
            {
                res.append(i);
            }
        }
        
        return res.toString();
    }
}
