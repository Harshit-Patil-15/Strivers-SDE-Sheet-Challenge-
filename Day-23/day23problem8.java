
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
      Queue<Integer> q=new LinkedList<>();
      int [] indegree = new int [V];
      for(ArrayList<Integer> x:adj){
          for(int i:x){
              indegree[i]++;
          }
      }
     int[] ans =new int [V];
     int idx=0;
      for(int i=0;i<V;i++){
          if(indegree[i]==0) q.offer(i);
         
      }
      
      while(!q.isEmpty()){
          int node=q.poll();
              ans[idx++]=node;
          for(int it:adj.get(node)){
              indegree[it]--;
              if(indegree[it]==0){
                  q.add(it);
             
              }
          }
      }
      
      
      return ans;
      
    }
}
