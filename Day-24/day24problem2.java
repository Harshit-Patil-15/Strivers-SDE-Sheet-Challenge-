
class Solution
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
       int[] dis = new int [V];
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.weight-b.weight));
       Arrays.fill(dis,Integer.MAX_VALUE);
       dis[s]=0;
      
       pq.offer(new Pair(0,s));
       while(!pq.isEmpty()){
           int distance=pq.peek().weight;
           int node=pq.peek().node;
           pq.poll();
              for(int i = 0;i<adj.get(node).size();i++) {
                int edgeWeight = adj.get(node).get(i).get(1); 
                int adjNode = adj.get(node).get(i).get(0); 
               
                if(distance + edgeWeight < dis[adjNode]) {
                    dis[adjNode] = distance + edgeWeight; 
                    pq.add(new Pair(dis[adjNode], adjNode)); 
                }
            }
       }
       
       return dis;
       
    }
}

class Pair
{
    int weight;
    int node;
    Pair(int weight,int node){
        this.weight=weight;
        this.node=node;
    }
}