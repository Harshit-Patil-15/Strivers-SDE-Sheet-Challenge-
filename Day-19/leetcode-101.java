class Solution {

    public boolean isSymmetric(TreeNode root) {

        return checkBT(root.left, root.right);
    }

    private boolean checkBT(TreeNode l, TreeNode r){

        if(l == null && r == null)
            return true;
        if(l == null || r ==null)
            return false;
        if(l.val != r.val)
            return false;
        return checkBT(l.left, r.right) && checkBT(l.right, r.left);
    }
}







