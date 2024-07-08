package alex;

public class FindWayOut {

    public static void main(String[] args) {
        int[][] map = new int[2][3];

        int i = path(3, 2);
        System.out.println(i);

        System.out.println(path(3, 2));
        System.out.println(path(2, 3));
    }

    static int path(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }

        return path(n-1, m) + path(n, m-1);

    }
}
