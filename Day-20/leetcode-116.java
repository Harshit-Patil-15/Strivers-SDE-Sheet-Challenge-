
class Solution {
    public Node connect(Node root) {
   if(root==null) return root;
   Queue<Node> q=new LinkedList<>();
   q.add(root);
 
   while(!q.isEmpty()){
 
        Node prev=null;
        int size=q.size();
       while(size-- >0){
        Node curr=q.poll();  
         curr.next=prev;
         prev=curr;
        if(curr.right!=null){
             q.offer(curr.right);
         }
         if(curr.left!=null){
             q.offer(curr.left);
         }
        
         
       
       }

   } 
   return root;
        
    }
}














