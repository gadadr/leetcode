package _921_940;

import model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _938_RangeSumOfBST {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            rangeSumBST(root.left, L, R);
            rangeSumBST(root.right, L, R);
        }
        return sum;
    }

    @Test
    public void test() {
        TreeNode node = new TreeNode(10,5,15,3,7,null,18);
        int ans = rangeSumBST(node, 7, 15);
        Assertions.assertEquals(ans, 32);
    }
}
