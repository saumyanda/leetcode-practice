//https://youtu.be/6wzOFeeIFKk
class Node
{
    int employee;
    int cumulativeTime;
    
    public Node(int e, int t)
    {
       employee=e;
       cumulativeTime=t;
    }
}
class Solution {
    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        int totalTime=Integer.MIN_VALUE;
        
        HashMap<Integer,List<Integer>> subordinates=new HashMap<>();
        
        for(int i=0;i<manager.length;i++)
        {
            if(!subordinates.containsKey(manager[i]))
            {
                subordinates.put(manager[i], new ArrayList<>());
            }
            subordinates.get(manager[i]).add(i);
        }
        
        Queue<Node> q=new LinkedList<>();
        
        q.offer(new Node(-1,0));
        
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            totalTime=Math.max(totalTime,curr.cumulativeTime);
            
            if(subordinates.containsKey(curr.employee))
            {
                for(Integer subord:subordinates.get(curr.employee))
                {
                q.offer(new Node(subord, curr.cumulativeTime+informTime[subord]));
                }
            }
        }
        
        return totalTime;
    }
}
