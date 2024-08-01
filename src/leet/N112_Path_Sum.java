package leet;

import java.util.Objects;

public class N112_Path_Sum {
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
        TreeNode seven = new TreeNode(7);
        TreeNode one = new TreeNode(1);

        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode thirteen = new TreeNode(13);
        TreeNode four = new TreeNode(4, one, null);

        TreeNode four2 = new TreeNode(4, eleven, null);
        TreeNode eight = new TreeNode(8, thirteen, four);

        TreeNode root = new TreeNode(5, four2, eight);


        System.out.println(new N112_Path_Sum().hasPathSum(root, 22));

        TreeNode n2= new TreeNode(2);
        TreeNode n1= new TreeNode(1, n2, null);
        System.out.println(new N112_Path_Sum().hasPathSum(n1, 1));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if(root.val == targetSum && isLeaf(root)){
            return true;
        }

        int target = targetSum-root.val;
        boolean left = hasPathSum(root.left, target);
        boolean right = hasPathSum(root.right, target);

        return left || right;
    }

    private boolean isLeaf(TreeNode node){
        return Objects.isNull(node.left) && Objects.isNull(node.right);
    }
}
