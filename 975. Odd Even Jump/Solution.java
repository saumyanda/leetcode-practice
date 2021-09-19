class Solution {
    public int oddEvenJumps(int[] arr) {
  
        //https://youtu.be/r2I7KIqHTPU
//https://leetcode.com/problems/odd-even-jump/discuss/217981/JavaC%2B%2BPython-DP-using-Map-or-Stack
        
        int good_starting_indices=1;
        
        int n=arr.length;
        
        boolean[] higher=new boolean[n];
        boolean[] lower=new boolean[n];
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        higher[n-1]=true;
        lower[n-1]=true;
        
        map.put(arr[n-1],n-1);
        
        for(int i=n-2;i>=0;i--)
        {
            Map.Entry<Integer,Integer> hi=map.ceilingEntry(arr[i]);
            Map.Entry<Integer,Integer> low=map.floorEntry(arr[i]);
            
            if(hi!=null)
            higher[i]=lower[hi.getValue()];
            
            if(low!=null)
            lower[i]=higher[low.getValue()];
            
            if(higher[i])
                good_starting_indices++;
            
            map.put(arr[i],i);
        }
        
        
        return good_starting_indices;
    }
}
