class Solution {
     public TreeNode build(int[] inorder,int is,int ie ,int[] preorder,int ps,int pe,Map<Integer,Integer> map){
      if(is>ie || ps>pe) return null;
      TreeNode root=new TreeNode(preorder[ps]);
      int rootIdx=map.get(preorder[ps]);
      int numleft=rootIdx-is;
      root.left=build(inorder,is,rootIdx-1,preorder,ps+1,ps+numleft,map);
      root.right=build(inorder,rootIdx+1,ie,preorder,ps+numleft+1,pe,map);
      return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int  i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       return build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
    }
}