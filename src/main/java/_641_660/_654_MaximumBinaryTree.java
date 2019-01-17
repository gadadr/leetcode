package _641_660;

import model.TreeNode;

public class _654_MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int m = max(nums, 0, nums.length);
        TreeNode root = new TreeNode(nums[m]);
        return createTree(nums, root, 0, m, nums.length);
    }

    public TreeNode createTree(int[] nums, TreeNode root, int l, int m, int r) {
        if (l < m) {
            int lmiddle = max(nums, l, m);
            root.left = new TreeNode(nums[lmiddle]);
            root.left = createTree(nums, root.left, l, lmiddle, m);
        }
        if (m+1 < r) {
            int rmiddle = max(nums, m+1, r);
            root.right = new TreeNode(nums[rmiddle]);
            root.right = createTree(nums, root.right, m+1, rmiddle, r);
        }
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int index = l;
        for (int i=l+1; i<r; i++) {
            index = nums[i] > nums[index] ? i : index;
        }
        return index;
    }
}
