{
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> ls =new ArrayList<>();
       Queue<Integer> qu=new LinkedList<>();
       boolean [] vis=new boolean [V];
       qu.add(0);
      
       vis[0]=true;
       while(!qu.isEmpty()){
           int node=qu.poll();
           ls.add(node);
           for(int x:adj.get(node) ){
               if(vis[x]==false){
                   
                   vis[x]=true;
                   qu.offer(x);
               }
           }
       }
       return ls;
    }
}