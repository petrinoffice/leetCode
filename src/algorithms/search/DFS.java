package algorithms.search;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    private static final List<TreeNode> preorderList = new ArrayList<>();
    private static final List<TreeNode> inorderList = new ArrayList<>();
    private static final List<TreeNode> postorderList = new ArrayList<>();


    public static void main(String[] args) {
        TreeNode two = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode root = new TreeNode(1, two, new TreeNode(5, null, new TreeNode(6)));
//          1
//         / \
//        2   5
//       / \    \
//      3   4    6
        preorderTraversal(root);
        System.out.println(preorderList);

        inorderTraversal(root);
        System.out.println(inorderList);

        postorderTraversal(root);
        System.out.println(postorderList);
    }

    public static void preorderTraversal(TreeNode root) {
        if (root == null) return;

        preorderList.add(root);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(TreeNode root){
        if (root == null) return;

        inorderTraversal(root.left);
        inorderList.add(root);
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(TreeNode root){
        if (root == null) return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorderList.add(root);
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
            return "" + val;
        }
    }
}
