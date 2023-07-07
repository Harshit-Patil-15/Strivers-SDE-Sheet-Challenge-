
class Solution {
    
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ls){
        ls.add(node);
        vis[node]=true;
        for(int it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,adj,vis,ls);
            }
        }
        
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> ls =new ArrayList<>();
       boolean [] vis =new boolean[V+1];
       dfs(0,adj,vis,ls);
       return ls;
       
       
    }
}