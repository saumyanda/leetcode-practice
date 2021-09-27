class SeatManager {

    TreeSet<Integer> available;
    Set<Integer> reserved;
    
    public SeatManager(int n) {
        
        available=new TreeSet<Integer>();
        
        for(int i=1;i<=n;++i)
        {
            available.add(i);
        }
        
        reserved=new HashSet<Integer>();
    }
    
    public int reserve() {
        
        int ret=-1;
        
        if(available.size()!=0)
        {
           ret=available.pollFirst();
           reserved.add(ret);
        }
        
        return ret;
    }
    
    public void unreserve(int seatNumber) {
        if(reserved.contains(seatNumber))
        {
            reserved.remove(seatNumber);
            available.add(seatNumber);
        }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
