package oj_381_400;

import java.util.Random;

import common.ListNode;

/**
 * This only passed 4/7 test cases. Not sure what leetcode expects since it says random.
 */
public class OJ_382_RandomNode {

	private int count;

	private ListNode node;

	private Random random;

	public OJ_382_RandomNode(ListNode head) {
		int count = 0;
		ListNode cur = head;
		while (cur != null) {
			cur = cur.next;
			count++;
		}
		this.node = head;
		this.count = count;
		this.random = new Random();
	}

	/** Returns a random node's value. */
	public int getRandom() {
		int x = random.nextInt();
		x %= count;

		ListNode cur = node;
		while (x > 0 && cur.next != null) {
			cur = cur.next;
			x--;
		}
		return cur == null ? 0 : cur.val;
	}
}
