package leet;

import java.util.Arrays;

public class N167_Two_sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new N167_Two_sum().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new N167_Two_sum().twoSum(new int[]{2,3,4}, 6)));
        System.out.println(Arrays.toString(new N167_Two_sum().twoSum(new int[]{-1,0}, -1)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left != right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                break;
            }

            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }

        return new int[]{++left, ++right};
    }
}
