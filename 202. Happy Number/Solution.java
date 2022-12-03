class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<Integer>();

        String number=Integer.toString(n);
        
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n=getNextNumber(n);
        }
        return n==1;
    }

    private int getNextNumber(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit = n%10;
            n=n/10;
            sum += digit*digit;
        }
        return sum;
    }
}
