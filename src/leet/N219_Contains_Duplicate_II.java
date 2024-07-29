package leet;

import java.util.HashMap;

public class N219_Contains_Duplicate_II {
    public static void main(String[] args) {
        System.out.println(new N219_Contains_Duplicate_II().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(new N219_Contains_Duplicate_II().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(new N219_Contains_Duplicate_II().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            int l = nums[i];
            int j = i + 1;

            while (j < nums.length) {
                if (Math.abs(i - j) > k) {
                    break;
                }

                int r = nums[j];
                if (l == r) {
                    return true;
                }
                j++;
            }
        }

        return false;
    }
}
