package _081_100;

import common.TreeNode;

public class OJ_100_SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
            return true;
        }
    	if (p == null || q == null) {
    		return false;
    	}
    	if (p.val != q.val) {
    		return false;
    	} else {
	    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    	}
    }
}
