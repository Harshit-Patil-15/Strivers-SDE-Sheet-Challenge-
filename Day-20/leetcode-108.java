class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1);
    }
    private TreeNode helper(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode newNode= new TreeNode(nums[mid]);
        newNode.left=helper(nums,start,mid-1);
        newNode.right=helper(nums,mid+1,end);
        return newNode;

    }
}