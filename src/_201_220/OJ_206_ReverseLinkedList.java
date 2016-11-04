package _201_220;

import common.ListNode;

public class OJ_206_ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            ListNode temp = head;
            head = cur.next;
            cur.next = cur.next.next;
            head.next = temp; 
        }
        return head;
    }
}
