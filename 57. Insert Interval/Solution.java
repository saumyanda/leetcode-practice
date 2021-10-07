class Solution {
    //The only thing we need to do is to add the new interval to the end and copy-paste the code we had in the merge interval problem.
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n=intervals.length;
        
        int[][] intervals_new=new int[n+1][2];
        
        for(int i=0;i<n;i++)
        {
            intervals_new[i][0]=intervals[i][0];
            intervals_new[i][1]=intervals[i][1];
        }
        
        intervals_new[n][0]=newInterval[0];
        intervals_new[n][1]=newInterval[1];
        
        
        LinkedList<int[]> res=new LinkedList<>();
        
        Arrays.sort(intervals_new,(a,b)->Integer.compare(a[0],b[0]));
        
        for(int[] interval:intervals_new)
        {
            if(res.isEmpty() || res.getLast()[1]<interval[0])
            {
                res.add(interval);
            }
            else
            {
                res.getLast()[1]=Math.max(res.getLast()[1],interval[1]);
            }
        }
        
        return res.toArray(new int[res.size()][2]);
        
    }
}
