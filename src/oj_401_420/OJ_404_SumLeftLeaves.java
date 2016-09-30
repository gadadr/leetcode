package oj_401_420;

import common.TreeNode;

public class OJ_404_SumLeftLeaves {
	int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.left.left == null && root.left.right == null) {
                count += root.left.val;
            }
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right);
        }
        return count;
    }
}
