package leet;

import java.util.*;

public class N103_Binary_Tree_Zigzag_Level_Order_Traversal {
    public static void main(String[] args) {

        System.out.println(new N103_Binary_Tree_Zigzag_Level_Order_Traversal().zigzagLevelOrder(
                new TreeNode(3, new TreeNode(9),
                        new TreeNode(20, new TreeNode(15), new TreeNode(7))))
                + " ->[[3],[20,9],[15,7]]");

        System.out.println(new N103_Binary_Tree_Zigzag_Level_Order_Traversal().zigzagLevelOrder(
                new TreeNode(1, new TreeNode(2,
                        new TreeNode(4), null),
                        new TreeNode(3, null, new TreeNode(5))))
                + " ->[[1],[3,2],[4,5]]");
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

        @Override
        public String toString() {
            return "TreeNode:" + val;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if (root != null) deque.add(root);
        boolean reverse = true;

        while (!deque.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int length = deque.size();
            System.out.println(deque);

            for (int i = 0; i <length ; i++) {

                if (reverse) {
                    TreeNode node = deque.pollFirst();
                    level.add(node.val);
                    if (node.left != null) deque.addLast(node.left);
                    if (node.right != null) deque.addLast(node.right);

                } else {
                    TreeNode node = deque.pollLast();
                    level.add(node.val);

                    if (node.right != null) deque.addFirst(node.right);
                    if (node.left != null) deque.addFirst(node.left);
                }
            }

            reverse = !reverse;
            answer.add(level);
        }

        return answer;
    }

    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if (root != null) deque.add(root);
        boolean directOrder = false;

        while (!deque.isEmpty()) {
            int length = deque.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode temp = deque.poll();
                level.add(temp.val);

                if (temp.left != null) deque.add(temp.left);
                if (temp.right != null) deque.add(temp.right);
            }

            if (directOrder) {
                Collections.reverse(level);
            }

            answer.add(level);

            directOrder = !directOrder;
        }

        return answer;
    }
}
