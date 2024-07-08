package alex;

public class FindNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 11, 15, 16};
        int[] arr2 = {2, 5, 8, 12, 19, 22};
        int[] arr3 = {3, 6, 9, 16, 22, 24};
        int[] arr4 = {10, 13, 14, 17, 24, 27};
        int[] arr5 = {18, 21, 23, 26, 30, 36};

        int[][] arr6 = {arr1, arr2, arr3, arr4, arr5};

        System.out.println(solution(arr6, 14));
        System.out.println(solution(arr6, -14));
    }

    private static boolean solution(int[][] numbers, int target) {
        int i = 0, j = numbers[0].length - 1;

        while (i < numbers.length && j > 0) {
            if (numbers[i][j] == target) {
                return true;
            }
            if (numbers[i][j] > target) {
                j--;
            } else i++;
        }

        return false;
    }
}
