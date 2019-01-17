package _101_120;

import model.TreeNode;

public class _104_MaximumDepthOfBinaryTree {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        maxDepth(root, 0);
        return maxDepth;
    }

    public void maxDepth(TreeNode root, int curHeight) {
        if (root != null) {
            curHeight++;
            maxDepth(root.left, curHeight);
            maxDepth(root.right, curHeight);
            if (curHeight > maxDepth) {
                maxDepth = curHeight;
            }
        }
    }
}
