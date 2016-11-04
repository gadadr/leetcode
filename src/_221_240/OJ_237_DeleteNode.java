package _221_240;

import common.ListNode;

public class OJ_237_DeleteNode {
	public void deleteNode(ListNode node) {
		if (node != null) {
			if (node.next == null) {
				node = null;
			} else {
				node.val = node.next.val;
				node.next = node.next.next;
			}
		}
	}
}
