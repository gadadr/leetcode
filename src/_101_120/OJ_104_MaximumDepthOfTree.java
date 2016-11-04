package _101_120;

import common.TreeNode;

public class OJ_104_MaximumDepthOfTree {

	public int maxDepth(TreeNode root) {
		int ans = maxDepth(root, 0);
		return ans;
	}

	public int maxDepth(TreeNode curr, int depth) {
		if (curr == null) {
			return 0;
		}

		return Math.max(maxDepth(curr.left, ++depth), maxDepth(curr.right, ++depth));
	}
}
