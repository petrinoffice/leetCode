package leet;

import java.util.Arrays;

public class N80_Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        System.out.print(Arrays.toString(nums1) + "->");
        System.out.print(new N80_Remove_Duplicates_from_Sorted_Array_II().removeDuplicates(nums1));
        System.out.print(Arrays.toString(nums1) + "->");

        System.out.println();
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.print(Arrays.toString(nums2) + "->");
        System.out.print(new N80_Remove_Duplicates_from_Sorted_Array_II().removeDuplicates(nums2));
        System.out.print(Arrays.toString(nums2) + "->");
    }

    public int removeDuplicates(int[] nums) {
        int counter = 0;

        int current = 0;
        int repeat = 0;

        for (int i = 0; i < nums.length; i++) {
            if (current == nums[i]) {
                repeat++;
            } else {
                current = nums[i];
                repeat = 1;
            }

            if (repeat <= 2) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}
