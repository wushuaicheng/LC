package month_4;





import Utils.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2058. 找出临界点之间的最小和最大距离
public class LC01 {
    public static  int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode last = head;
        head=head.next;
        int x = 1 ;
        ArrayList<Integer> list = new ArrayList<>();
        while(head.next!=null){
            if(last.val<head.val&&head.val>head.next.val||last.val>head.val&&head.val<head.next.val){
                list.add(x);
            }
            x++;
            head=head.next;
            last=last.next;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int max = list.get(list.size()-1)-list.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int num =list.get(i)-list.get(i-1);
            min=min>num?num:min;
        }
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(5);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(1);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(1);
        ListNode head7 = new ListNode(2);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=head6;
        head6.next=head7;
        head7.next=null;
        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(head1)));


    }
}

/*
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = null;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(head!=null){
            if(pre!=null && head.next!=null){
                if(pre.val > head.val && head.next.val>head.val || pre.val< head.val && head.next.val< head.val){
                    list.add(i);
                }
            }
            ++i;
            pre = head;
            head = head.next;
        }

        if(list.size() < 2) return new int[]{-1,-1};

        int maxDistance = list.get(list.size()-1) - list.get(0);
        int minDistance = Integer.MAX_VALUE;

        for(int j=1; j<list.size(); j++){
            minDistance = Math.min(minDistance, list.get(j)-list.get(j-1));
        }

        return new int[]{minDistance, maxDistance};

    }*/

