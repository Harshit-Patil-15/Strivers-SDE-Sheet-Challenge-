class Solution {
     static void helper(TreeNode root,List<Integer> l1){
         if(root==null) return;
          l1.add(root.val);
           helper(root.left,l1);
         helper(root.right,l1);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
          ArrayList<Integer> l1= new ArrayList<>();
      helper(root,l1);
        return l1;
    }
}