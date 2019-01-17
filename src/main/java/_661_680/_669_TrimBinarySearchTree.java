package _661_680;

import model.TreeNode;

public class _669_TrimBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        inOrderTraverse(root, L, R);
        while(root != null && (root.val < L || root.val > R)) {
            root = findSuccessor(root);
        }
        return root;
    }

    public void inOrderTraverse(TreeNode node, int L, int R) {
        if (node != null) {
            inOrderTraverse(node.left, L, R);
            inOrderTraverse(node.right, L, R);
            while (node.left != null && (node.left.val < L || node.left.val > R)) {
                node.left = findSuccessor(node.left);
            }
            while (node.right != null && (node.right.val < L || node.right.val > R)) {
                node.right = findSuccessor(node.right);
            }
        }
    }

    private TreeNode findSuccessor(TreeNode node) {
        if (node.left == null && node.right == null) {
            return null;
        } else if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        } else {
            TreeNode successor = null;
            TreeNode right = node.right;
            if (right.left == null) {
                successor = right;
                successor.right = right.right;
                node.right = null;
            } else {
                while (right.left.left != null) {
                    right = right.left;
                }
                successor = right.left;
                right.left = right.left.right;
                successor.right = node.right;
            }
            successor.left = node.left;

            return successor;
        }
    }
}
