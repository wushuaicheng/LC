package month_4;

import Utils.ListNode;
import org.w3c.dom.ls.LSInput;

//234. 回文链表
public class LC10 {
    // 快慢指针 反转 验证
    public boolean isPalindrome1(ListNode head) {

        if(head==null||head.next==null) return true;

        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        slow.next=head;
        fast.next=head;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode begin = new ListNode();
        begin=slow.next;
        begin=reverseList(begin);

        while (begin!=null){
            if(begin.val!=head.val) return false;
            begin=begin.next;
            head=head.next;
        }
        return true;
    }
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    ListNode temp;

    //递归方法
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        return check(head);

    }

    private boolean check(ListNode head) {
        if(head==null) return true;
        boolean res = head.val==temp.val&&check(head.next);
        temp=temp.next;
        return res;
    }

    //逆序打印
    private void printListNode(ListNode head) {
        if(head==null) return;
        printListNode(head.next);
        System.out.println(head.val);
    }
}
