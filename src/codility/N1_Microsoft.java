package codility;

public class N1_Microsoft {
    public static void main(String[] args) {
        System.out.println(new N1_Microsoft().solution(new int[]{0, 4, -1, 0, 3}, new int[]{0, -2, 5, 0, 3}) + " 2");
        System.out.println(new N1_Microsoft().solution(new int[]{2, -2, -3, 3}, new int[]{0, 0, 4, -4}) + " 1");
        System.out.println(new N1_Microsoft().solution(new int[]{4, -1, 0, 3}, new int[]{-2, 6, 0, 4}) + " 0");
        System.out.println(new N1_Microsoft().solution(new int[]{1, 4, 2, -2, 5}, new int[]{7, -2, -2, 2, 5}) + " 2");
    }

    public int solution(int[] A, int[] B) {
        int sumA = 0, sumB = 0;

        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
            sumB += B[i];
        }

        int leftSumA = 0, leftSumB = 0;

        int answer = 0;
        for (int i = 0; i < A.length-1; i++) {
            leftSumA += A[i];
            leftSumB += B[i];

            int rightSumA = sumA - leftSumA;
            int rightSumB = sumB - leftSumB;

            if (leftSumA == rightSumA && leftSumA == leftSumB && leftSumA == rightSumB) {
                answer+=1;
            }
        }

        return answer;
    }
}
