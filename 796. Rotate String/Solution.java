class Solution {
    public boolean rotateString(String s, String goal) {
        //Concatenate the string with itself
        //then take substrings from length 0 to n-1
        Set<String> shiftedStrings=new HashSet<>();
        
        String str=s+""+s;
        
        for(int i=0;i<s.length();i++)
        {
            shiftedStrings.add(str.substring(i,i+s.length()));
        }
        
        System.out.println(shiftedStrings);
        
        return shiftedStrings.contains(goal);
    }
}
