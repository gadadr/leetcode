package _081_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import common.TreeNode;

public class OJ_094_InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) stack.push(root);
		List<Integer> ans = new ArrayList<>();
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.left == null &&node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
			    TreeNode temp = node.left;
			    node.left = null;
			    stack.push(node);
				stack.push(temp);
				continue;
			}
			ans.add(node.val);
		}
		return ans;
	}
}
