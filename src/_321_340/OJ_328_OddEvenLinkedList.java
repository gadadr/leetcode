package _321_340;

import common.ListNode;

public class OJ_328_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return head;
		}
		
        ListNode ans = new ListNode(head.val), cur = head;
        ListNode x = ans;
        for (int i=0;i<2; i++) {
            while (cur != null && cur.next != null && cur.next.next != null) {
                ans.next = new ListNode(cur.next.next.val);
                ans = ans.next;
                cur = cur.next.next;
            }
            if (i==0) {
                cur = head.next;
                ans.next = new ListNode(cur.val);
                ans = ans.next;
            }
        }
        return x;
    }
}
