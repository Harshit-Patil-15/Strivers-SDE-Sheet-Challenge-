
public class Solution {
    public static  TreeNode<Integer> predecessor = null;
    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
inorderpredecessor(root,X);
if(predecessor!=null) return predecessor.data;
else return -1;


    }
    public static void inorderpredecessor(TreeNode<Integer> root, int key) {
        
      
        
        while (root != null) {
            
            if (key < root.data) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
       
    }
}