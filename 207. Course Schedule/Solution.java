class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> graph=buildGraph(prerequisites);

        Set<Integer> visited=new HashSet<>();
        Set<Integer> visiting=new HashSet<>();
        
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(graph,i,visited,visiting)) return false;
        }

        return true;
    }
    
    private static Map<Integer, List<Integer>> buildGraph(int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] dependency : prerequisites) {
            if (!graph.containsKey(dependency[0])) {
                graph.put(dependency[0], new ArrayList<>());
            }
            graph.get(dependency[0]).add(dependency[1]);
        }
        return graph;
    }

    private static boolean dfs(Map<Integer,List<Integer>> graph, int start, Set<Integer> visited, Set<Integer> visiting)
    {
        visiting.add(start);
        if(graph.get(start)!=null)
        {
                for(Integer neighbor:graph.get(start))
                {
                    if(visited.contains(neighbor)) continue;

                    if(visiting.contains(neighbor)) return false;

                    if(!dfs(graph,neighbor,visited,visiting)) return false;
                }
        }
        visited.add(start);
        return true;
    }
}
