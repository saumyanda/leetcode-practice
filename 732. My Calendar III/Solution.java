//https://youtu.be/mnpZgPe4d7w
class MyCalendarThree {
    
    int maximum=Integer.MIN_VALUE;
    
    //TreeMap to maintain the events in sorted order and supports fast insertion
    //keys are the start of each interval, and the values are the ends of those intervals
    TreeMap<Integer,Integer> calendar;

    public MyCalendarThree() {
        calendar=new TreeMap<>();
    }
    
    public int book(int start, int end) {
          //every time a new start time of event is reached -> new event increment count
        calendar.put(start,calendar.getOrDefault(start,0)+1);
        
        //for every event end time, decrement count to remove the event
        calendar.put(end,calendar.getOrDefault(end,0)-1);
        
        //countActive is the count of active events till now
        int countActive=0;
        for(int val:calendar.values())
        {
            countActive+=val;
            
            if(countActive>maximum)
            {
                maximum=countActive;
            }
    }
        return maximum;
}
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
