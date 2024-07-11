package codility;

import java.util.HashSet;
import java.util.Set;

public class N4_Microsoft {
    public static void main(String[] args) {
        Tree tree1 = new Tree(2, null, null);
        Tree tree2 = new Tree(9, null, null);
        Tree tree3 = new Tree(9, tree1, tree2);

        Tree tree4 = new Tree(9, null, null);
        Tree tree5 = new Tree(5, tree4, null);
        Tree tree6 = new Tree(9, null, null);
        Tree tree7 = new Tree(9, tree5, tree6);
        Tree tree8 = new Tree(9, null, null);
        Tree tree9 = new Tree(5, tree7, tree8);


        Tree root = new Tree(9, tree3, tree9);

        System.out.println(new N4_Microsoft().solution(root));

    }

    private Set<String> s = new HashSet<>();

    public int solution(Tree T) {
        s(T);
        return s.size();
    }

    private String s(Tree tree) {
        if (tree == null) {
            return "";
        }

        String left = s(tree.l);
        if (left.length() == 3) {
            s.add(left);
            if (tree.l != null) {
                s(tree.l);
            }
        }
        return left + tree.x;
    }

    static class Tree {
        public int x;
        public Tree l;
        public Tree r;

        public Tree(int x, Tree l, Tree r) {
            this.x = x;
            this.l = l;
            this.r = r;
        }
    }
}
