package leet;

public class N55_Jump_Game {
    public static void main(String[] args) {
        System.out.println(new N55_Jump_Game().canJump(new int[]{1,2}));
        System.out.println(new N55_Jump_Game().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new N55_Jump_Game().canJump(new int[]{3, 0, 8, 2, 0, 0, 1}));
        System.out.println(new N55_Jump_Game().canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));
    }


    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int position = nums.length - 2; position >= 0; position--) {
            if (position + nums[position] >= goal) {
                goal = position;
            }
        }

        return goal == 0;
    }
}
