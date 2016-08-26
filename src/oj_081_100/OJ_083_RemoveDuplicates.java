package oj_081_100;

import common.ListNode;

public class OJ_083_RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        } 
        return head;
    }
}
