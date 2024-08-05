package leet;

import java.util.LinkedList;
import java.util.Queue;

public class N173_Binary_Search_Tree_Iterator {
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
        TreeNode tree = new TreeNode(3);

        TreeNode twenty = new TreeNode(20);
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15, nine, twenty);

        TreeNode seven = new TreeNode(7, tree, fifteen);

        BSTIterator iterator = new BSTIterator(seven);

        System.out.println(iterator.next());    // return 3
        System.out.println(iterator.next());    // return 7
        System.out.println(iterator.hasNext()); // return True
        System.out.println(iterator.next());    // return 9
        System.out.println(iterator.hasNext()); // return True
        System.out.println(iterator.next());    // return 15
        System.out.println(iterator.hasNext()); // return True
        System.out.println(iterator.next());    // return 20
        System.out.println(iterator.hasNext()); // return False
    }

    static class BSTIterator {
        Queue<Integer> queue = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            addStack(root);
        }

        private void addStack(TreeNode root) {
            if (root == null) {
                return;
            }

            addStack(root.left);
            queue.add(root.val);
            addStack(root.right);
        }

        public int next() {
            return queue.poll();
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }
    }
}

