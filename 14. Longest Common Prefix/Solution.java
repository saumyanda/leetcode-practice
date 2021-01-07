class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        
        if(strs.length==0)
            return res;
        
        //Arrays.sort(strs);
        
        String s=strs[0];
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || s.charAt(i)!=strs[j].charAt(i))
                {
                    return res;
                }
            }
            res+=s.charAt(i);
        }
        return res;
    }
}
