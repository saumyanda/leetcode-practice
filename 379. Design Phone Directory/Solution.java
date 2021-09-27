class PhoneDirectory {
    
    Queue<Integer> available;
    Set<Integer> taken;

    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        
        available=new LinkedList<Integer>();
        
        for(int i=0;i<maxNumbers;i++)
        {
            available.offer(i);
        }
        
        taken=new HashSet<Integer>();
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        
        if(available.isEmpty())
        {
            return -1;
        }
        
        int ret=available.poll();
        taken.add(ret);
        return ret;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        
        if(taken.contains(number))
            return false;
        
        return true;
        
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        
        if(taken.contains(number))
        {
            available.offer(number);
            taken.remove(number);
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */
