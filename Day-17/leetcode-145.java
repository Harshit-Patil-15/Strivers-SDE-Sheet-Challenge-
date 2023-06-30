class Solution {
       static void helper(TreeNode root,List<Integer> l1){
         if(root==null) return;
          
           helper(root.left,l1);
         helper(root.right,l1);
           l1.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> l1= new ArrayList<>();
      helper(root,l1);
        return l1;
    }
}