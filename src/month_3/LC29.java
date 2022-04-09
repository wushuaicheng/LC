package month_3;

import Utils.ListNode;

//876. 链表的中间结点

public class LC29 {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int res = 0 ;
        while (slow.next!=null){
            slow = slow.next;
            res++;
        }
        int k = 0 ;
        while(k<res/2){
            fast=fast.next;
        }

        return fast;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        ListNode head5 = new ListNode(6);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=null;
        ListNode listNode = middleNode(head);
        System.out.println(listNode.val);



    }
}
