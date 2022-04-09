package month_4;

import Utils.ListNode;
//203. 移除链表元素
public class LC08 {
    public ListNode removeElements1(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next=head;
        ListNode pre1 = pre;
        while(pre1.next!=null){
            if(pre1.next.val==val){
                pre1.next=pre1.next.next;
            }else {
                pre1=pre1.next;
            }
        }
        return pre.next;
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        head.next=removeElements(head.next,val);
        return head.val==val?head.next:head;
    }
}
