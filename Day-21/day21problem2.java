public class Solution {


    public  static int findCeil(TreeNode<Integer> root, int key) {
 int successor=-1;
  while (root != null) {
            
            if (key == root.data) return root.data;
            if (key > root.data) {
                root = root.right;
            } else {
                successor = root.data;
                root = root.left;
            }
        }
return successor;

    }
 



}