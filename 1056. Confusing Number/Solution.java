class Solution {
    public boolean confusingNumber(int n) {
       //https://leetcode.com/problems/confusing-number/discuss/398574/Java-0ms-12-line-solution-with-two-pointers
        int[] rotate={0,1,-1,-1,-1,-1,9,-1,8,6};
        
        int num=n;
        
        int rotatedNum=0;
        
        while(num>0)
        {
            int digit=num%10;
            if(rotate[digit]<0)
            {
                return false;
            }
            rotatedNum = rotatedNum*10 + rotate[digit];
            num=num/10;
        }
        
        return n!=rotatedNum;
    }
}
