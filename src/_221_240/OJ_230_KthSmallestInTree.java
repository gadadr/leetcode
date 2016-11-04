package _221_240;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class OJ_230_KthSmallestInTree {
	List<Integer> list = new ArrayList<>();

	public int kthSmallest(TreeNode root, int k) {
		inorder(root, k);
		return list.get(k - 1);
	}

	private void inorder(TreeNode root, int k) {
		if (list.size() != k) {
			if (root != null) {
				inorder(root.left, k);
				list.add(root.val);
				inorder(root.right, k);
			}
		}
	}
}
