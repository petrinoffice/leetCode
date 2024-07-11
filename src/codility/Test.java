package codility;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    public int solution(int[] A) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        int answer = 1;
        for (Integer i : set) {
            if (!set.contains(answer)) {
                return answer;
            }
            answer++;
        }
        return answer;
    }
}
