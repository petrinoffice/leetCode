package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class N1_Two_Sum {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new N1_Two_Sum().twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(new N1_Two_Sum().twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new N1_Two_Sum().twoSum(new int[]{0,4,3,0}, 0)));
        System.out.println(Arrays.toString(new N1_Two_Sum().twoSum(new int[]{-1, -2, -3, -4, -5}, -8)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> value = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target || target < 0) {
                value.put(nums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            Integer j = value.get(target - nums[i]);
            if (Objects.nonNull(j) && j != i) {
                return new int[]{i, j};
            }
        }

        return null;
    }

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            int j = i + 1;
//
//            while (j < nums.length) {
//                if (nums[i] + nums[j] == target) {
//                   return new int[]{i, j};
//                }
//                j++;
//            }
//        }
//
//        return new int[]{0, 0};
//    }
}
