package oj_101_120;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import common.TreeNode;

public class OJ_107_BT_LevelOrderTraversal2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> outer = new ArrayList<>();
		if (root != null) { 
			Deque<TreeNode> mainq = new ArrayDeque<>();
			mainq.addLast(root);
			while (!mainq.isEmpty()) {
				List<Integer> inner = new ArrayList<>();
				int mainqSize = mainq.size();
				for (int i=0; i< mainqSize; i++) {
					TreeNode node = mainq.removeFirst();
					inner.add(node.val);
					if (node.left != null) {
						mainq.addLast(node.left);
					}
					if (node.right != null) {
						mainq.addLast(node.right);
					}
				}
				outer.add(0, inner);
			}
		}
		return outer;
	}
}
