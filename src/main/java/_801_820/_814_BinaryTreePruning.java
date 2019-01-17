package _801_820;

import model.TreeNode;

public class _814_BinaryTreePruning {
    class Solution {
        public TreeNode pruneTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.val == 0 && root.left == null && root.right == null) {
                return pruneTree(null);
            } else if (root.val == 0) {
                root.left = pruneTree(root.left);
                root.right = pruneTree(root.right);
            }
            return root;
        }
    }
}
