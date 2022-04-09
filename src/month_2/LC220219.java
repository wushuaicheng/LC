package month_2;

import Utils.ListNode;

import java.util.Stack;

public class LC220219 {
/*public ListNode swapPairs(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		//用stack保存每次迭代的两个节点
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode p = new ListNode(-1);
		ListNode cur = head;
		//head指向新的p节点，函数结束时返回head.next即可
		head = p;
		while(cur!=null && cur.next!=null) {
			//将两个节点放入stack中
			stack.add(cur);
			stack.add(cur.next);
			//当前节点往前走两步
			cur = cur.next.next;
			//从stack中弹出两个节点，然后用p节点指向新弹出的两个节点
			p.next = stack.pop();
			p = p.next;
			p.next = stack.pop();
			p = p.next;
		}
		//注意边界条件，当链表长度是奇数时，cur就不为空
		if(cur!=null) {
			p.next = cur;
		} else {
			p.next = null;
		}
		return head.next;
	}
}
*/
/*public ListNode swapPairs(ListNode head) {
    if(head==null||head.next==null){
        return head;
    }
    Stack<ListNode> listNodes = new Stack<ListNode>();
    ListNode p = new ListNode(-1);
    ListNode c = head;
    head=p;
    while(c!=null&&c.next!=null){
        listNodes.add(c);
        listNodes.add(c.next);
        c=c.next.next;
        p.next=listNodes.pop();
        p=p.next;
        p.next=listNodes.pop();
        p=p.next;
    }if(c!=null){
        p.next=c;

    }else {
        p.next=null;
    }
    return head.next;



}*/

/*    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }*/

    public ListNode swapPairs(ListNode head){
      if(head==null||head.next==null){
          return head;
      }
      ListNode p = head.next;
      head.next=swapPairs(p.next);
      p.next=head;
      return p;
    }

}
