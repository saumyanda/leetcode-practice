class MyCalendar {
    
    //TreeMap to maintain the events in sorted order and supports fast insertion
    //keys are the start of each interval, and the values are the ends of those intervals
    TreeMap<Integer,Integer> calendar;

    public MyCalendar() {
        calendar=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
        //get previous interval using the floorKey method of TreeMap
        Integer prev=calendar.floorKey(start);
        
        //get next interval using ceilingKey method of TreeMap
        Integer next=calendar.ceilingKey(start);
        
        /*
        check if there is a conflict on each side with neighboring intervals: 
        we would like calendar.get(prev)) <= start <= end <= next 
        for the booking to be valid (or for prev or next to be null respectively.)
        */
         if((prev==null || calendar.get(prev)<=start) &&
            (next==null || next>=end))
         {
             calendar.put(start,end);
             return true;
         }
        
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
