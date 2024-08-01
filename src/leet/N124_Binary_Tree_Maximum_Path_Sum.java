package leet;

import java.util.Objects;

public class N124_Binary_Tree_Maximum_Path_Sum {
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

    public static void main(String[] args) {
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1, two, three);

        System.out.println(new N124_Binary_Tree_Maximum_Path_Sum().maxPathSum(one));


        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);

        TreeNode n20 = new TreeNode(20, n7, n15);
        TreeNode n9 = new TreeNode(9);

        TreeNode root = new TreeNode(-10, n9, n20);
        System.out.println(new N124_Binary_Tree_Maximum_Path_Sum().maxPathSum(root));

        TreeNode negative = new TreeNode(-3);
        System.out.println(new N124_Binary_Tree_Maximum_Path_Sum().maxPathSum(negative));
    }

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        count(root);
        return max;
    }

    private int count(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        }

        int left = Math.max(0, count(root.left));
        int right = Math.max(0, count(root.right));

        int currentMax = left + right + root.val;

        if (currentMax > max) {
            max = currentMax;

        }
        return Math.max(left, right) + root.val;
    }
}
