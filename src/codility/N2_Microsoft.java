package codility;

public class N2_Microsoft {
    public static void main(String[] args) {
        System.out.println(new N2_Microsoft().solution(new int[]{3, 4, 6}, new int[]{6, 5, 4}));
    }

    public int solution(int[] A, int[] B) {
        int i = 1;
        int j = B.length - 1;

        return 0;
    }
}


//        int[][] dp = new int[2][A.length];
//
//        dp[0][0] = A[0];
//        dp[1][0] = Integer.MAX_VALUE;
//
//        for (int j = 1; j < A.length; j++) {
//            int min = Math.min(dp[0][j - 1], dp[1][j - 1]);
//            dp[0][j] = Math.max(A[j], min);
//            dp[1][j] = Math.max(B[j], dp[0][j]);
//        }
//
//        return Math.min(dp[0][A.length - 1], dp[1][A.length - 1]);
//    }

