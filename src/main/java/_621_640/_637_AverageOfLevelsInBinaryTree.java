package _621_640;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _637_AverageOfLevelsInBinaryTree {
    List<List<Integer>> numbersByLevel = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        averageOfLevels(root, 0);
        List<Double> averages = numbersByLevel
                .stream()
                .map(l -> l
                        .stream()
                        .mapToDouble(a -> a)
                        .average()
                        .getAsDouble())
                .collect(Collectors.toList());
        return averages;
    }

    private void averageOfLevels(TreeNode root, int height) {
        if (root != null) {
            if (numbersByLevel.size() == height) {
                numbersByLevel.add(new ArrayList<>());
            }
            List<Integer> level = numbersByLevel.get(height);
            level.add(root.val);

            height++;
            averageOfLevels(root.left, height);
            averageOfLevels(root.right, height);
        }
    }
}
