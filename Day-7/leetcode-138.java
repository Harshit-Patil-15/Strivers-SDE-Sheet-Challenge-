
class Solution {
    public Node copyRandomList(Node head) {
      Node temp=head;
      //step1
      while(temp!=null){
          Node copy =new Node(temp.val);
          copy.next=temp.next;
          temp.next=copy;
          temp=temp.next.next;
      }
// step2
 
 Node iter=head;
 while(iter!=null){
     if(iter.random!=null){
         iter.next.random=iter.random.next;
     }
      iter=iter.next.next;
 }

//  step3
Node dummy = new Node(0);
    iter = head;
    temp = dummy;
    Node fast;
    while(iter!=null){
        fast=iter.next.next;
        temp.next=iter.next;
        iter.next=fast;
        temp = temp.next;
        iter=fast;
    }
    
    return dummy.next;


    }
}