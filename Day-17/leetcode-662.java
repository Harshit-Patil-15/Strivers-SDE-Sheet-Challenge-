 class pair{
     TreeNode node;
     int num;
pair(TreeNode _node ,int _num){
     node=_node;
    num=_num;
 }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            // int mmin=q.peek().num;
            int first=0;int last=0;
            for(int i=0;i<size;i++){
               int currId=q.peek().num;
               TreeNode n1= q.peek().node;
               q.poll();
               if(i==0) first=currId;
               if(i==size-1) last=currId;
               if(n1.left!=null){
                   q.offer(new pair(n1.left,2*currId+1));
               }
                if(n1.right!=null){
                   q.offer(new pair(n1.right,2*currId+2));
               }
            }
            ans=Math.max(ans,last-first+1);

        }

        return ans;
    }
}