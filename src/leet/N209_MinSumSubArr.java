package leet;

public class N209_MinSumSubArr {
    public static void main(String[] args) {
        System.out.println(new N209_MinSumSubArr().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(new N209_MinSumSubArr().minSubArrayLen(1, new int[]{1,4,4}));
        System.out.println(new N209_MinSumSubArr().minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
        System.out.println(new N209_MinSumSubArr().minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int currentSum=0;
        int minlength=Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++){
            currentSum+=nums[right];
            while(currentSum>=target){
                minlength=Math.min(minlength,right-left+1);
                currentSum-=nums[left];
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }

    public int minSubArrayLen1(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while (right < nums.length || left < nums.length) {
            if(sum < target && right<nums.length){
                sum += nums[right];
                right++;
            }else {
                sum -= nums[left];
                left++;
            }

            if(sum > target){
                ans = Math.min(ans, right - left);
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}
