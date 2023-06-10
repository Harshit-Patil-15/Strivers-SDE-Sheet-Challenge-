public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
        return null; 
    }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(head!=fast){
                    head=head.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}

