package _101_120;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class OJ_101_SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		List<TreeNode> list = new ArrayList<>();
		list.add(root);
		while (!list.isEmpty()) {
			int size = list.size();
			if (size == 1) {
				TreeNode node = list.remove(0);
				if (node.left == null && node.right == null) {
					return true;
				} else if (node.left == null || node.right == null) {
					return false;
				} else {
					list.add(node.left);
					list.add(node.right);
				} 
			} else {
				if (size % 2 == 1) {
					return false;
				}
				for (int i=0; i<size/2; i+=2) {
					TreeNode first = list.remove(i);
					TreeNode last = list.remove(i);
					
					if (first.val == last.val) {
						if (first.left == null && last.right == null) {
							
						} else if (first.left == null || last.right == null) {
							return false;
						} else {
							list.add(first.left);
							list.add(last.right);
						}
						if (first.right == null && last.right == null) {
							
						} else if (first.right == null || last.right == null) {
							return false;
						} else {
							list.add(first.right);
							list.add(last.left);
						}
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
}
