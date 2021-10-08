//https://youtu.be/mnpZgPe4d7w
class MyCalendarTwo {
    //TreeMap to store: start/end time as key and frequency as values
    //start time -> frequency + 1 (add the new active event)
    //end time -> frequency - 1(remove the event after it ends)
    TreeMap<Integer,Integer> calendar;

    public MyCalendarTwo() {
        calendar=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
        //every time a new start time of event is reached -> new event increment count
        calendar.put(start,calendar.getOrDefault(start,0)+1);
        
        //for every event end time, decrement count to remove the event
        calendar.put(end,calendar.getOrDefault(end,0)-1);
        
        //countActive is the count of active events till now
        int countActive=0;
        for(int val:calendar.values())
        {
            countActive+=val;
            
            //if the number of active events is 3 or more -> triply booked
            //don't add the current event to calendar
            if(countActive>=3)
            {
                calendar.put(start,calendar.get(start)-1);
                calendar.put(end,calendar.get(end)+1);
                if(calendar.get(start)==0)
                {
                    calendar.remove(start);
                }
                
                return false;
            }
        }
        
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
