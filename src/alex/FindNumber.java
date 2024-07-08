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

    private static boolean solution(int[][] numbers, int target){
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = numbers[i].length - 1; j >= 0; j--) {
                if (numbers[i][j] == target) {
                    return true;
                }

                if (numbers[i][j]>target){
                    continue;
                }

                if (numbers[i][j]<target){
                    break;
                }
            }
        }
        return false;
    }
}
