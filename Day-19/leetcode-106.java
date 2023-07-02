class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int  i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    public TreeNode build(int[] inorder,int is,int ie ,int[] postorder,int ps,int pe,Map<Integer,Integer> map){
      if(is>ie || ps>pe) return null;
      TreeNode root=new TreeNode(postorder[pe]);
      int rootIdx=map.get(postorder[pe]);
      int numleft=rootIdx-is;
      root.left=build(inorder,is,rootIdx-1,postorder,ps,ps+numleft-1,map);
      root.right=build(inorder,rootIdx+1,ie,postorder,ps+numleft,pe-1,map);
      return root;
    }
}