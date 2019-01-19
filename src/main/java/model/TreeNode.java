package model;

import java.util.LinkedList;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer ... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException();
        }

        this.val = x[0];
        if (x.length > 1) {
            LinkedList<TreeNode> list = new LinkedList<>();
            list.add(this);
            for (int i = 1; i < x.length; i+=2) {
                if(list.isEmpty()) {
                    throw new IllegalStateException();
                }
                TreeNode node = list.pop();
                if (x[i] != null) {
                    node.left = new TreeNode(x[i]);
                    list.add(node.left);
                }
                if (i+1 < x.length && x[i+1] != null) {
                    node.right = new TreeNode(x[i+1]);
                    list.add(node.right);
                }
            }
        }
    }
}
