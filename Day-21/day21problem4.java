class Solution
{
    int i =1;    
    int ans = 0; // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int k)
    {
        inorder(root, k);
        return ans;
        //Your code here
    }
   
    public void inorder(Node root, int k) {
        if(root == null) {
            return;
        }
        
        inorder(root.right, k);
        
        if(i==k){
            ans = root.data;   
        }
        i++;       
        inorder(root.left, k);
    }
    
    
}