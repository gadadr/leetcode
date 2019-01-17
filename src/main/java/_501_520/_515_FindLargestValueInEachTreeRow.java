package _501_520;

import model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _515_FindLargestValueInEachTreeRow {
    Map<Integer, Integer> highest = new HashMap<>();

    public List<Integer> largestValues(TreeNode root) {
        largestValues(root, 0);
        return new ArrayList<>(highest.values());
    }

    public void largestValues(TreeNode root, int height) {
        if (root != null) {
            highest.put(height, Math.max(highest.getOrDefault(height, Integer.MIN_VALUE), root.val));
            height++;
            largestValues(root.left, height);
            largestValues(root.right, height);
        }
    }
}
