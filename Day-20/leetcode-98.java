class Solution {
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
     public boolean isValid(TreeNode root,long minValue,long maxValue) {
         if(root==null) return true;
        if(root.val<=minValue ||root.val>=maxValue) return false;
            return isValid(root.left,minValue,root.val) && isValid(root.right,root.val,maxValue) ;
    }
}
