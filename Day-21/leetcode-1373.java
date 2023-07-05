class NodeValue {
    public int maxNode, minNode, maxSum;
    
    NodeValue(int minNode, int maxNode, int maxSum) {
        this.minNode = minNode;
        this.maxNode = maxNode;
        this.maxSum = maxSum;
    }
}
class Solution {
    int sum=0;
        private NodeValue helper(TreeNode root) {
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        
        NodeValue left = helper(root.left);
        NodeValue right = helper(root.right);
        
      
        if (left.maxNode < root.val && root.val < right.minNode) {
            // It is a BST.
             sum = Math.max(sum, left.maxSum + right.maxSum + root.val);
            return new NodeValue(Math.min(root.val, left.minNode), Math.max(root.val, right.maxNode), 
                        left.maxSum + right.maxSum + root.val);
        }
        
        // Otherwise, return [-inf, inf] so that parent can't be valid BST
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 
                            Math.max(left.maxSum, right.maxSum));
    }
    public int maxSumBST(TreeNode root) {
        helper(root);
        return sum;
    }
}
