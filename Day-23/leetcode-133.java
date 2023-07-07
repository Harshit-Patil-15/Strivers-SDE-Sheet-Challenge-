class Solution {
 
    public Node cloneGraph(Node node) {
      if(node==null ) return null;
     Map<Node,Node> map=new HashMap<>();
         //originalNode,newNode
         Queue<Node> queue=new LinkedList<>();
         Node newNode=new Node();
         newNode.val=node.val ;
         map.put(node,newNode);
         queue.offer(node);
         while(!queue.isEmpty()){
             Node original=queue.poll();
             for(Node child:original.neighbors){
                 if(!map.containsKey(child)){
                     Node temp=new Node();
                     temp.val=child.val ;
                      queue.offer(child);
                     map.put(child,temp);
                 }
            map.get(original).neighbors.add(map.get(child));
           
             }
         } 
    return newNode;   
    }
}