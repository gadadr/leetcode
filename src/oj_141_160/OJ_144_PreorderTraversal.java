package oj_141_160;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import common.TreeNode;

public class OJ_144_PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) stack.push(root);
		List<Integer> ans = new ArrayList<>();
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			ans.add(node.val);
			if (node.right != null) stack.push(node.right);
			if (node.left != null) stack.push(node.left);
		}
		return ans;
    }
}
