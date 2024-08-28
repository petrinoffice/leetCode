package leet;

import java.util.*;
import java.util.stream.Collectors;

public class N637_Average_of_Levels_in_Binary_Tree {
    public static void main(String[] args) {
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);

        TreeNode nine = new TreeNode(9);

        TreeNode root = new TreeNode(3, nine, twenty);
        System.out.println(new N637_Average_of_Levels_in_Binary_Tree().averageOfLevels(root));
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> average = new ArrayList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int length = queue.size();
            double sum = 0.0;

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if(node.left!= null)queue.offer(node.left);
                if(node.right!= null)queue.offer(node.right);
            }

            average.add(sum/length);
        }

        return average;
    }

    HashMap<Integer, Double> data = new HashMap<>();
    Map<Integer, Integer> counts = new HashMap<>();

    public List<Double> averageOfLevels2(TreeNode root) {

        count(root, 0);

        return data.entrySet().stream().map(entry -> {
            int count = counts.get(entry.getKey());

            return entry.getValue() / count;
        }).collect(Collectors.toList());
    }

    private void count(TreeNode node, int level) {
        if (node == null) {
            return;
        } else {
            Integer count = counts.getOrDefault(level, 0);
            counts.put(level, ++count);
        }

        Double value = data.getOrDefault(level, 0.0);
        data.put(level, value + node.val);

        count(node.left, level + 1);
        count(node.right, level + 1);

    }

}
