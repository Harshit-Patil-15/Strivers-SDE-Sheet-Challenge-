class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next==null || k==0) return head;
     ListNode curr=head;
       int  count=1;
    while(curr.next!=null) {
         curr=curr.next;count++;
           }
      k=k%count;
curr.next=head;
int end=count-k;
while(end--!=0) curr=curr.next;
head=curr.next;
curr.next=null;

     return head;
    }
}