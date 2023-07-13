class Node {
    Node links[] = new Node[2]; 
    
    public Node() {
    }
    boolean containsKey(int ind) {
        return (links[ind] != null); 
    }
    Node get(int ind) {
        return links[ind]; 
    }
    void put(int ind, Node node) {
        links[ind] = node; 
    }
};
class Trie {
    private static Node root; 

    Trie() {
        root = new Node(); 
    }
  
    public static void insert(int num) {
        Node node = root;
        for(int i = 31;i>=0;i--) {
            int bit = (num >> i) & 1; 
            if(!node.containsKey(bit)) {
                node.put(bit, new Node()); 
            }
            node = node.get(bit); 
        }
    }
    
    public int getMax(int num) {
        Node node = root; 
        int maxNum = 0; 
        for(int i = 31;i>=0;i--) {
            int bit = (num >> i) & 1; 
            if(node.containsKey(1 - bit)) {
                maxNum = maxNum | (1<<i);
                node = node.get( 1 - bit); 
            }
            else {
                node = node.get(bit); 
            }
        }
        return maxNum; 
    }
};
class Pair{
    int xi;
    int mi;
    int idx;
    Pair(int xi,int mi,int idx){
        this.xi=xi;
        this.mi=mi;
        this.idx=idx;
    }
}
class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int m=queries.length;
        Arrays.sort(nums);
       ArrayList<Pair> arr=new ArrayList<>();
       for(int i=0;i<m;i++){
           int xi=queries[i][0];
           int mi=queries[i][1];
           arr.add(new Pair(xi,mi,i));
       }
     Collections.sort(arr,(a,b) ->(a.mi-b.mi));
   
        int ind = 0;
    int n = nums.length;
    Trie trie = new Trie();
    int[] ans = new int [m];
    for (int i = 0; i < m; i++) ans[i]=-1;

    for (int i = 0; i < m; i++) {
        Pair curr=arr.get(i);
      while (ind < n && nums[ind] <= curr.mi) {
        trie.insert(nums[ind]);
        ind++;
      }
      int queryInd = curr.idx;
      if (ind != 0) ans[queryInd] =trie.getMax(curr.xi);
      else ans[queryInd]=-1;
    }
    return ans;
 
    }
}




