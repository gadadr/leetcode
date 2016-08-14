package oj_001_020;

import common.ListNode;

public class LinkedList {
	
	private static ListNode head;
	
	public static void main(String[] args) {		
		addNode(1);addNode(2);addNode(3);addNode(4);addNode(5);addNode(6);
		print();
		head = reverse(head,2);
		print();
	}
	
	private static void addNode(int x) {
		if (head == null) {
			head = new ListNode(x);
			return;
		}
		ListNode node = new ListNode(x);
		node.next = head;
		head = node;
	}
	
	private static void pairwiseSwap() {
		
	}
	
	private static void print() {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		System.out.println("\n");
	}
	
	private static void printReverse(ListNode current) {
		if (current.next != null) {
			printReverse(current.next);
		}
		System.out.println(current.val);
	}
	
	private static ListNode reverse(ListNode current) {
		if (current == null) {
			return null;
		}
		ListNode tempHead = current, prev = current;
		current = current.next;
		while (current != null) {
			prev.next = current.next;
			current.next = tempHead;
			tempHead = current;
			
			current = prev.next;
		}
		return tempHead;
	}
	
	private static ListNode reverse(ListNode current, int k) {
		if (current == null) {
			return null;
		}
		ListNode tempHead = current, prev = current;
		current = current.next;
		while (current != null) {
			prev.next = current.next;
			current.next = tempHead;
			tempHead = current;
			
			current = prev.next;
			k--;
			if (k==1) {
				tempHead = current;
				prev = current;
				current = current.next;
			}
		}
		return head;
	}
	
}
