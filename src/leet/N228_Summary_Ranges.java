package leet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class N228_Summary_Ranges {
    public static void main(String[] args) {
        System.out.println(new N228_Summary_Ranges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}) + " [\"0->2\",\"4->5\",\"7\"]");
        System.out.println(new N228_Summary_Ranges().summaryRanges(new int[]{0,2,3,4,6,8,9})+" [\"0\",\"2->4\",\"6\",\"8->9\"]");
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int end = i;

            while (end++ < nums.length - 1) {
                if (nums[end] != nums[i] + 1) {
                    break;
                }
                i++;
            }

            if (start == i) {
                answer.add(""+nums[i]);
            } else {
                answer.add(nums[start] + "->" + nums[i]);

            }
        }

        return answer;
    }
}
