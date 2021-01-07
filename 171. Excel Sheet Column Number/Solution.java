class Solution {
    public int titleToNumber(String s) {
    int result=0;
    int k=0;
    for(int i=s.length()-1;i>=0;i--)
    {
        result += (int)(Math.pow(26,k))*(int)(s.charAt(i)-64);
        k++;
    }
    return result;
    }
}
