package _701_720;

import model.TreeNode;

public class _701_InsertIntoBinarySearchTree {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode current = root;
        while (current != null) {
            if (val > current.val) {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    break;
                } else {
                    current = current.left;
                }
            }
        }
        return root;
    }
}
