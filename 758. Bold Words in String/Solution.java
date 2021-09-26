class Solution {
    //https://leetcode.com/problems/add-bold-tag-in-string/discuss/104263/Java-solution-Same-as-Merge-Interval
    /*
    Consider you have string
s = "aaabbcc"
dict = ["aaa","aab","bc"]

   you find the index of each string in dict, conver to an interval, you will get
   
   [[0, 3], [1, 4], [4, 6]]
     aaa     aab      bc
   then combine these intervals
   
   Ater merged, we got [0,6], so we know "aaabbc" needs to be surrounded by tag.
   
   Time Complexity:
   Parsing S based on dict -> O( len(S) * size of word(dict) * dict.length) and is likely the most expensive operation.
Merge -> Sorting intervals, when there are N intervals , (N = len(S)) -> O(n* log n)
Reading S back -> O(N)
    */
    public String boldWords(String[] words, String s) {
        StringBuilder result=new StringBuilder();
        LinkedList<int[]> intervals=new LinkedList<>();
        
        //For each of the strings in words:
        //get index of each string in s
        //save interval from index to index+str.length in the intervals list
        for(String str: words)
        {
            int index=-1;
            index=s.indexOf(str,index);
            
            while(index!=-1)
            {
                intervals.add(new int[]{index,index+str.length()});
                index+=1;
                index=s.indexOf(str,index);
            }
        }
        
        //run merge intervals to merge the list of overlapping intervals
        intervals=mergeIntervals(intervals);
        
        //append bold tags
        int prev=0;
        for(int[] interval:intervals)
        {
            //append all characters before interval start
            //e.g. when initial characters of string are a mismatch
            result.append(s.substring(prev,interval[0]));
            
            result.append("<b>");
            
            //append the matched word in the interval
            result.append(s.substring(interval[0],interval[1]));
            result.append("</b>");
            
            //move prev to the next interval
            prev=interval[1];
        }
        
        //append remaining characters to result
        if(prev<s.length())
        {
            result.append(s.substring(prev));
        }
        
        return result.toString();
    }
    
    private LinkedList<int[]> mergeIntervals(List<int[]> intervals)
    {
        int[][] interval_array=intervals.toArray(new int[intervals.size()][]);
        Arrays.sort(interval_array, (a,b) -> Integer.compare(a[0],b[0]));
        
        LinkedList<int[]> result=new LinkedList<>();
        
        for(int[] interval:interval_array)
        {
            if(result.size()==0 || result.getLast()[1]<interval[0])
            {
                result.add(interval);
            }
            else
            {
                result.getLast()[1]=Math.max(result.getLast()[1],interval[1]);
            }
        }
        
        return result;
    }
}
