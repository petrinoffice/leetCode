package alex;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2, null, null);
        TreeNode treeNode3 = new TreeNode(2, null, null);
        TreeNode treeNode2 = new TreeNode(3, treeNode3, null);
        TreeNode treeNode4 = new TreeNode(4, treeNode1, treeNode2);

        TreeNode treeNode5 = new TreeNode(5, null, null);
        TreeNode treeNode6 = new TreeNode(4, null, null);
        TreeNode treeNode7 = new TreeNode(7, treeNode5, treeNode6);

        TreeNode root = new TreeNode(1,treeNode4, treeNode7);

        System.out.println(solution(root));
        System.out.println(solutionHard(root));
    }

    private static int solution(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }

        int left = solution(treeNode.left);
        int right = solution(treeNode.right);
        return Math.max(left, right) + treeNode.value;
    }

    static int max = 0;
    private static int solutionHard(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        int left = Math.max(solutionHard(treeNode.left), 0);
        int right = Math.max(solutionHard(treeNode.right), 0);

        int currentMax= left+ right + treeNode.value;
        if (max<currentMax) {
            max = currentMax;
        }
        return currentMax;
    }

    private static class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
