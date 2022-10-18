class Solution {
    
    public int countStudents(int[] students, int[] sandwiches) {
      
        Queue<Integer> q=new LinkedList<>();
        int top=0;
        
        for(int s:students)
        {
            q.add(s);
        }
        
        while(!q.isEmpty() && q.contains(sandwiches[top])){
            if(q.peek()==sandwiches[top])
            {
                q.poll();
                top++;
            }
            else
            {
                q.add(q.poll());
            }
        }
        
        return q.size();
    }
}
