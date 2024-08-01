package leet;

import java.util.Objects;

public class N104_Maximum_Depth_Binary_Tree {
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

        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        TreeNode treeNode9 = new TreeNode(9);

        TreeNode treeNode20 = new TreeNode(20, treeNode15, treeNode7);

        TreeNode treeNode3 = new TreeNode(3, treeNode9, treeNode20);
        System.out.println(new N104_Maximum_Depth_Binary_Tree().maxDepth(treeNode3));
    }


    public int maxDepth(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        }

        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);

        return Math.max(leftDeep, rightDeep) + 1;
    }


}
