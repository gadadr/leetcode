package oj_021_040;

import common.ListNode;

public class _024_Swap_Nodes {
	public ListNode swapPairs(ListNode head) {
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			int temp = cur.val;
			cur.val = cur.next.val;
			cur.next.val = temp;
			cur = cur.next.next;
		}
		return head;
	}
}
