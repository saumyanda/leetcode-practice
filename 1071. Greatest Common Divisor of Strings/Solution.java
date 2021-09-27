class Solution {
    /*
    Explanation - s1+s2 == s2+s1 if & only if s1 is a multiple of s2 or vice-versa
e.g. s1=abcabc, s2=abc, then s1+s2 = abcabcabc = s2+s1
This is a requirement for the strings to have a gcd. If one of them is NOT a multiple of other, gcd is ''

Since they are multiples, next step is simply to find the gcd of the lengths of 2 strings e.g. gcd(6,3) = 3, and get the substring of length 3 from either s1 or s2.
which is what s1.substr(0, gcd) does
*/
    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        
        return str1.substring(0, gcd(str1.length(),str2.length()));
        
    }
    
    public static int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        
        return gcd(b, a%b);
    }
}
