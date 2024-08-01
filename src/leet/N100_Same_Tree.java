package leet;

import com.sun.source.tree.Tree;

import java.util.Objects;

public class N100_Same_Tree {

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
        TreeNode two1 = new TreeNode(2);
        TreeNode two2 = new TreeNode(2);

        TreeNode three1 = new TreeNode(3);
        TreeNode three2 = new TreeNode(3);

        TreeNode one1 = new TreeNode(1, two1, three1);
        TreeNode one2 = new TreeNode(1, two2, three2);


        System.out.println(new N100_Same_Tree().isSameTree(one1, one2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }


        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
