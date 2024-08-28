package leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N199_Binary_Tree_Right_Side_View {
    public static void main(String[] args) {
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2, null, five);

        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3, null, four);

        TreeNode root = new TreeNode(1, two, three);
        System.out.println(new N199_Binary_Tree_Right_Side_View().rightSideView(root) +" ->[1, 3, 4]");

        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);
        //System.out.println(new N199_Binary_Tree_Right_Side_View().rightSideView(root2));

        TreeNode root3 = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        //System.out.println(new N199_Binary_Tree_Right_Side_View().rightSideView(root3));

        TreeNode root4 = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        System.out.println(new N199_Binary_Tree_Right_Side_View().rightSideView(root4)+ " ->[1, 3, 6]");

        TreeNode root5 = new TreeNode(4,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null),
                new TreeNode(5));
        System.out.println(new N199_Binary_Tree_Right_Side_View().rightSideView(root5) + " ->[4,5,2,1]");
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
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int length = queue.size();

            TreeNode node = queue.peek();
            answer.add(node.val);

            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.poll();

                if(temp.right!= null) queue.offer(temp.right);
                if(temp.left!= null) queue.offer(temp.left);
            }
        }

        return answer;
    }
}
