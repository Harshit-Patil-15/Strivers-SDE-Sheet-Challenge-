class Solution {
    public static boolean dfs(int [][] graph,int col,int node,int[] color){

        color[node]=col;
        for(int it : graph[node]) {
          if(color[it] == -1) {
                if(dfs(graph, 1 - col, it, color) == false) return false; 
            }      
            else if(color[it] == col) {
                return false; 
            }
        }
        
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int [] color=new int [n];
         Arrays.fill(color,-1);
          for(int i = 0;i<n;i++) {
	        if(color[i] == -1) {
	            if(dfs(graph,0,i,color) == false) return false; 
	        }
	    }
	    return true; 
    }
}