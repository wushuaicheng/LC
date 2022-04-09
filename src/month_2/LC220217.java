package month_2;

import Utils.ListNode;

public class LC220217 {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode listNode = new ListNode(0);
        listNode.next=head;
        ListNode start=listNode,end=listNode;
        while(n!=0){
            start=start.next;
            n--;
        }
        while (start.next!=null){
            start=start.next;
            end=end.next;
        }
        end.next=end.next.next;
        return listNode.next;

    }
}
