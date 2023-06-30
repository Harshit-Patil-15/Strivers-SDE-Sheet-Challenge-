public class solution {
    static boolean getPath(Node root, ArrayList < Integer > arr, int x) {
     
        if (root == null)
            return false;
        arr.add(root.data);


        if (root.data == x)
            return true;

        if (getPath(root.left, arr, x) ||
            getPath(root.right, arr, x))
            return true;
   
        arr.remove(arr.size() - 1);
        return false;
    }

public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
       ArrayList < Integer > ans = new ArrayList < > ();
       getPath(root,ans,x);
       return ans;

    }
}