package _501_520;

import model.TreeNode;

public class _513_FindBottomLeftTreeValue {
    int maxHeight = 0;

    public int findBottomLeftValue(TreeNode root) {
        return findBottomLeftValue(root, root.val, 0);
    }

    private int findBottomLeftValue(TreeNode root, int max, int curHeight) {
        if (root != null) {
            curHeight++;
            max = findBottomLeftValue(root.left, max, curHeight);
            if (curHeight > maxHeight) {
                maxHeight = curHeight;
                max = root.val;
            }
            max = findBottomLeftValue(root.right, max, curHeight);
        }
        return max;
    }
}
