package oj_001_020;

import common.ListNode;

public class OJ_019_RemoveNthNode {
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		removeNthFromEnd(node, 1);
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;   
        }
        ListNode cur = head, prev = head;
        for (int i=0; i<n; i++) {
        	cur = cur.next;
        }
        if (cur == null) {
        	head = head.next;
        	return head;
        }
        
        while (cur.next != null) {
        	cur = cur.next;
        	prev = prev.next;
        }
    	prev.next = prev.next.next;
        return head;
    }
}
