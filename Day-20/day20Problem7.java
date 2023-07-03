public static void findPreSuc(Node root, int key)
{
  suc=inorderSuccessor(root,key);
 pre=inorderpredecessor(root,key);
 
}



   public static Node inorderSuccessor(Node root, int key) {
        
        Node successor = null;
        
        while (root != null) {
            
            if (key >= root.data) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        
        return successor;
    }
     public static Node inorderpredecessor(Node root, int key) {
        
        Node predecessor = null;
        
        while (root != null) {
            
            if (key <= root.data) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        
        return predecessor;
    }S