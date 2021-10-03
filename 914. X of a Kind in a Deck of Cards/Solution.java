class Solution {
    
    //function to calculate gcd of 2 numbers
    private int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
    
    public boolean hasGroupsSizeX(int[] deck) {
        
        Map<Integer,Integer> counts=new HashMap<>();
        
        //Get the frequency counts of each number in the deck array
        for(int i=0;i<deck.length;i++)
        {
            counts.put(deck[i],counts.getOrDefault(deck[i],0)+1);
        }
        
    //Check if it's possible to get a gcd greater than 1 for the numbers
    //if yes-> they can be split in groups of equal sizes equal to the gcd -> return true
    //if no -> can't be split into groups of equal sizes -> return false
        int res=0;
        //this loop will find gcd of list of numbers in counts
        for(int i:counts.values())
        {
            res=gcd(res,i);
        }
        
        return res > 1 ? true : false;
    }
}
