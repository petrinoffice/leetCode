package leet;

public class N101_Symmetric_Tree {

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
        TreeNode three1 = new TreeNode(3);
        TreeNode three2 = new TreeNode(3);

        TreeNode four1 = new TreeNode(4);
        TreeNode four2 = new TreeNode(4);

        TreeNode two1 = new TreeNode(2, three1, four1);
        TreeNode two2 = new TreeNode(2, four2, three2);

        TreeNode one = new TreeNode(1, two1, two2);
        System.out.println(new N101_Symmetric_Tree().isSymmetric(one));
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
