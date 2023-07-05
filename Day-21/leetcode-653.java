class Solution {
    HashSet<Integer> hs = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        if(hs.contains(k-root.val)){
            return true;
        }
        hs.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}