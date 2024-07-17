package leet;

import java.util.Arrays;

public class N27 {
    public static void main(String[] args) {

        new N27().print(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        new N27().print(new int[]{3,2,2,3}, 3);
        new N27().print(new int[]{4,5}, 4);
    }

    public void print(int[] nums, int val) {
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));

        return index;
    }
}
