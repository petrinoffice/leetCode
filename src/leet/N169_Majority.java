package leet;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class N169_Majority {
    public static void main(String[] args) {
        print(new int[]{3, 2, 3});
    }

    static void print(int[] nums) {
        System.out.println(new N169_Majority().majorityElement(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majority = nums[i];
                count = 1;
            }
        }
        return majority;
    }
}
