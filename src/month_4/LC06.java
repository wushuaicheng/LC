package month_4;

import Utils.ListNode;

import java.util.ArrayList;
import java.util.List;
//143. 重排链表
public class LC06 {
    /*public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node!=null){
            list.add(node);
            node=node.next;
        }
        int i = 0 ;
        int j = list.size()-1;
        while (i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i==j) break;
            list.get(j).next=list.get(i);
            j--;
        }
        list.get(i).next=null;
    }*/
    public void reorderList(ListNode head){
        if(head.next==null) return;
        ListNode mid = findMid(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next=null;
        l2 = reverseMid(l2);
        mergeList(l1, l2);

    }

    private void mergeList(ListNode l1, ListNode l2) {
        ListNode temp1;
        ListNode temp2;
        while (l1!=null&&l2!=null){
            temp1 = l1.next;
            temp2 = l2.next;
            l1.next=l2;
            l2.next=temp1;
            l1=temp1;
            l2=temp2;
        }
    }


    private ListNode reverseMid(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }

    private ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
