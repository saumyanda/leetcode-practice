class Solution {
    public int addDigits(int num) {
        int result=0;
        if(num==0)
        {
            result=0;
        }
        if(num!=0 && num % 9 == 0)
        {
            result=9;
        }
        else
        {
            result=num%9;
        }
        return result;
    }
}
