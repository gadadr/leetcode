package _221_240;

import common.TreeNode;

public class OJ_226_InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		} else {
			traverseAndInvert(root);
			return root;
		}
	}
	
	private void traverseAndInvert(TreeNode node) {
		if (node != null) {
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			
			traverseAndInvert(node.left);
			traverseAndInvert(node.right);
		}
	}
}
