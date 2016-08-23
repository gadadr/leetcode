package oj_381_400;

import java.util.Random;

import common.ListNode;

/**
 * This only passed 4/7 test cases. Not sure what leetcode expects since it says random.
 */
public class OJ_382_RandomNode {

	private ListNode head;
	private Random random;

	public OJ_382_RandomNode(ListNode head) {
		this.head = head;
		this.random = new Random();
	}

	/** Returns a random node's value. */
	public int getRandom() {
		ListNode cur = head, ans = null;
		
		for (int i=1; cur != null; i++) {
			if (random.nextInt(i) == 0) {
				ans = cur;
			}
			cur = cur.next;
		}
		return ans.val;
	}
}
