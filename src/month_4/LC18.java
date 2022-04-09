package month_4;

import Utils.ListNode;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


//剑指 Offer 06. 从尾到头打印链表
public class LC18 {
    /*public static int[] reversePrint1(ListNode head) {
        //Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> stack = new ArrayList<>();
        dfs(head,stack);
        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i]=stack.get(i);
        }
        return res;
    }

    private static void dfs(ListNode head,ArrayList stack) {
        if(head==null) return;
        dfs(head.next,stack);
        stack.add(head.val);

    }*/
    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        int i = 0;
        while (!stack.isEmpty()) {
            print[i++] = stack.pop().val;
        }
        return print;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        int[] ints = reversePrint(l1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


}
