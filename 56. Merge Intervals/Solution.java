class Solution {
    public int[][] merge(int[][] intervals) {
        
       ArrayList<int[]> list=new ArrayList<>(); 
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
            
        for(int i=0;i<intervals.length;i++)
        {
            int s=intervals[i][0];
            int e=intervals[i][1];
            
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]>=s && intervals[j][0]<=e)
                {
                    if(intervals[j][1]>e)
                    {
                        e=intervals[j][1];
                    }
                    i++;
                }
                
            }
            list.add(new int[]{s,e});
        }
        
        return list.toArray(new int[list.size()][2]);
       
    }
}
