class LRUCache {
    HashMap<Integer,Node>  hm=new HashMap<>();
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int capacity;

    public LRUCache(int capacity) {
       
        head.next=tail;
        tail.prev=head;
       this.capacity = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node tempNode= hm.get(key);
             remove(tempNode);
             insert(tempNode);
             return tempNode.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
      if (hm.containsKey(key)) {
            remove(hm.get(key));
        }
        if (hm.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    private void remove(Node node) {
        hm.remove(node.key);
       node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node) {
        hm.put(node.key,node);
         node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

 
}
   public class Node{
        Node next,prev;
        int key,value;
        Node(int key1,int value1){
            key=key1;
            value=value1;
        }
    }
