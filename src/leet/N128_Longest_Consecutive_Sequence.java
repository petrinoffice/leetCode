package leet;

import java.util.Arrays;

public class N128_Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        System.out.println(new N128_Longest_Consecutive_Sequence().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(new N128_Longest_Consecutive_Sequence().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(new N128_Longest_Consecutive_Sequence().longestConsecutive(new int[]{1,2,0,1}));
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int answer = 0;
        int current = 0;

        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(prev == nums[i]){
                continue;
            }

            if (++prev == nums[i]){
              current++;
              answer = Math.max(answer, current);
            } else {
                prev = nums[i];
                current=0;
            }

        }

        return answer + 1;
    }
}
