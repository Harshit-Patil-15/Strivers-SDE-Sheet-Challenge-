class Solution {
  public static ListNode middleNode(ListNode head) {
        ListNode slow =head,fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
  }
      public ListNode reverseList(ListNode head) {
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head==null) return true;
        ListNode mid=middleNode(head);
        ListNode dummy=reverseList(mid);
        while(dummy!=null){
            if(dummy.val!=head.val){
                return false;
            }
            head=head.next;
            dummy=dummy.next;
            
        }
        return true;
    }
}