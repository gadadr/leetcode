package _141_160;

import common.ListNode;

public class OJ_141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        ListNode fut = head;
        while (fut != null && fut.next != null) {
            cur = cur.next;
            fut = fut.next.next;
            if (fut != null && cur.val == fut.val) return true;
        }
        return false;
    }
}
