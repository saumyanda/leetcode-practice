class Solution {
    public int[][] merge(int[][] intervals) {
        
        //Sort the intervals based on the start time
        Arrays.sort(intervals, (a,b) -> (Integer.compare(a[0],b[0])));
        
        LinkedList<int[]> result=new LinkedList<>();
        
        //iterate over the intervals
        for(int[] interval: intervals)
        {
            
            //if result is empty or non-overlapping interval
            //add interval to result
            if(result.size()==0 || result.getLast()[1] < interval[0])
            {
                result.add(interval);
            }
            //overlapping interval
            //merge the current and last intervals
            else
            {
                result.getLast()[1]=Math.max(result.getLast()[1], interval[1]);
            }
                
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
