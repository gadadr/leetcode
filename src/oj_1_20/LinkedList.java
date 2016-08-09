package oj_1_20;

public class LinkedList {
	
	private static Node head;
	
	public static void main(String[] args) {		
		addNode(1);addNode(2);addNode(3);addNode(4);addNode(5);addNode(6);
		print();
		head = reverse(head,2);
		print();
	}
	
	private static void addNode(int x) {
		if (head == null) {
			head = new Node(x);
			return;
		}
		Node node = new Node(x);
		node.next = head;
		head = node;
	}
	
	private static void pairwiseSwap() {
		
	}
	
	private static void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		System.out.println("\n");
	}
	
	private static void printReverse(Node current) {
		if (current.next != null) {
			printReverse(current.next);
		}
		System.out.println(current.val);
	}
	
	private static Node reverse(Node current) {
		if (current == null) {
			return null;
		}
		Node tempHead = current, prev = current;
		current = current.next;
		while (current != null) {
			prev.next = current.next;
			current.next = tempHead;
			tempHead = current;
			
			current = prev.next;
		}
		return tempHead;
	}
	
	private static Node reverse(Node current, int k) {
		if (current == null) {
			return null;
		}
		Node tempHead = current, prev = current;
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
