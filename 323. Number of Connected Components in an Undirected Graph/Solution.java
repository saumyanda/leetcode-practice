class Solution {
    
    private Map<Integer,List<Integer>> buildGraph(int[][] edges)
    {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        
        for(int[] edge:edges)
        {
            if(!graph.containsKey(edge[0]))
            {
               graph.put(edge[0],new ArrayList<>());
            }
            
            if(!graph.containsKey(edge[1]))
            {
               graph.put(edge[1],new ArrayList<>());
            }
            
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        return graph;
    }
    
    public int countComponents(int n, int[][] edges) {
        
        Map<Integer,List<Integer>> graph=buildGraph(edges);
        
        System.out.print(graph);
        
        Set<Integer> visited=new HashSet<>();
        
        int count=0;
       
        for(int startNode:graph.keySet())
        {
            if(explore(graph,visited,startNode)==true)
            {
                count++;
            }       
        }
        
       if(n>graph.size())
       {
           count+=n-graph.size();
       }
           
        
       return count;
    }
    
private boolean explore(Map<Integer,List<Integer>> graph,Set<Integer> visited,int start)
    {
        if(visited.contains(start))
        {
            return false;
        }
    
        visited.add(start);
    
        if(graph.get(start)!=null)
        for(int neighbor: graph.get(start))
        {
            explore(graph,visited,neighbor);
        }
    
        return true;
    }
}
