package oj_101_120;

import common.TreeNode;

public class OJ_110_BalancedBT {
	public boolean isBalanced(TreeNode root) {
        if (root == null) {
        	return true;
        }
        int left = isBalanced(root.left, 0);
        int right = isBalanced(root.right, 0);
        
        if (Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
        	return true;
        } else {
        	return false;
        }
    }
	
	public int isBalanced(TreeNode root, int height) {
        if (root == null) {
        	return 0;
        } 
        return Math.max(isBalanced(root.left, ++height), isBalanced(root.right, ++height)) + 1;
    }
}
