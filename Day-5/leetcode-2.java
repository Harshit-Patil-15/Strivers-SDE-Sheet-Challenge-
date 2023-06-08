


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry =0;
    ListNode newNode=new ListNode();
    ListNode head=newNode;
    while(l1!=null || l2!= null || carry==1){
          int currSum=carry;
            if(l1!=null){
                currSum+=l1.val;
                l1=l1.next;
            }
             if(l2!=null){
                currSum+=l2.val;
                l2=l2.next;
            }
        if(currSum<10){
            ListNode temp=new ListNode(currSum);
            newNode.next=temp;
            newNode=temp;
            carry=0;
        }else{
             ListNode temp=new ListNode(currSum%10);
            newNode.next=temp;
            newNode=temp;
            carry=1;
        }
    }
    return head.next;
    }
    }



















