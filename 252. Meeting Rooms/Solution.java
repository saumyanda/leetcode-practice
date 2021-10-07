class Solution {
//This problem basically asks if there’s any overlap between adjacent intervals. We sort the intervals by start time and use the technique from the intro section to check overlap.
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        for(int i=0;i<intervals.length-1;i++)
        {
            if(intervals[i][1]>intervals[i+1][0])
                return false;
        }
        
        return true;
    }
}
