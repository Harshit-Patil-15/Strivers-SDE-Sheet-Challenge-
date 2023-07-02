class Solution {
    boolean ans=true;
    public int helper(TreeNode root) {
          if(root==null) return 0;
         int lh=helper(root.left);
          int rh=helper(root.right);
          if(Math.abs(lh-rh)>1) ans=false;
          return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
          helper(root);
          return ans;
    }
}