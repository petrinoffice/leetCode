package leet;

import java.util.Arrays;

public class TwentySix {
    public static void main(String[] args) {
     print(new int[]{1,1,2});
     print(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public static void print(int[] nums) {
        System.out.println(new TwentySix().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
          while(i<nums.length-1 && nums[i] == nums[i+1]) {
              i++;
          }
          nums[count++] = nums[i];
        }
        return count;
    }
}
