class Solution {
    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        // Build the hierarchical tree
        Map<Integer, List<Integer>> map = new HashMap<>();  
        Queue<int[]> queue = new LinkedList<>();
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < manager.length; i++) {
            if(!map.containsKey(manager[i]))
                map.put(manager[i], new ArrayList<>());
            
            // Map of manager and its subordinates given by the index i
            map.get(manager[i]).add(i);     
        }
        
        // head of organizer and corresponding informing time.
        queue.offer(new int[]{headID, 0});      
        
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int managerAtGivenLevel = temp[0];
            int cumulativeTime = temp[1];
            
            result = Math.max(result, cumulativeTime);
            
            // if the manager has subordinates
            if(map.containsKey(managerAtGivenLevel)) {
                
                // get the list of subordinates
                List<Integer> subordinates = map.get(managerAtGivenLevel);  
            
                for(int i : subordinates) {
    // add the subordinates as manager and the time taken to inform each of these subordinates
            queue.offer(new int[]{i, informTime[managerAtGivenLevel] + cumulativeTime});    
                }
            }
        }
        return result;
    }
}
