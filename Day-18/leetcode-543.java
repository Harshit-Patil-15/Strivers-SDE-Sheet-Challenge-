class Solution {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
         height(root);
        return ans;
        
    }
    int height(TreeNode root){
         if (root==null) return 0;
        int ld=height(root.left);
        int rd=height(root.right);
         ans=Math.max(ans,ld+rd);
        return Math.max(ld,rd)+1;
    }
}