package leet;

import java.util.Objects;

public class N226_Invert_Binary_Tree {
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
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);

        TreeNode two = new TreeNode(2, one, three);

        System.out.println(new N226_Invert_Binary_Tree().invertTree(two));
    }

    public TreeNode invertTree(TreeNode root) {

        if (Objects.nonNull(root)) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}
