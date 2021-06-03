class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> result=new LinkedList<>();
        List<Integer> path=new LinkedList<>();
        int startvertex=0;
        
        dfs(graph, result, path, startvertex);
        
        return result;
    }
    
private void dfs(int[][] graph, List<List<Integer>> result, List<Integer> path, int startvertex)
{
    path.add(startvertex);
   if(startvertex==graph.length-1)
   {
       result.add(new LinkedList<>(path));
       
   }
    //do dfs for all neigbors of startvertex
    else
    {
        //neighbors of startvertex
        for(int v: graph[startvertex])
        {
           dfs(graph, result, path, v);
        }
    }
    path.remove(path.size()-1);
}
}
