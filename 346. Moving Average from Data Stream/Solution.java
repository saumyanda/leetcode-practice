class MovingAverage {
    
    int size;
    List<Integer> stream=new LinkedList<>();
    
    public MovingAverage(int size) {
        this.size=size;
    }
    
    public double next(int val) {
        stream.add(val);
        
        //calculate sum of moving window
        double windowsum=0;
        for(int i=Math.max(0,stream.size()-size);i<stream.size();i++)
        {
           windowsum+=stream.get(i); 
        }
        
        return windowsum/Math.min(stream.size(),size);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
