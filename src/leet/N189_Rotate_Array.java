package leet;

import java.util.Arrays;

public class N189_Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.print(Arrays.toString(nums) + " ");
        new N189_Rotate_Array().rotate(nums, 3);
        System.out.println(Arrays.toString(nums) + " answer:[5,6,7,1,2,3,4]");

        int[] nums1 = {-1, -100, 3, 99};
        System.out.print(Arrays.toString(nums1) + " ");
        new N189_Rotate_Array().rotate(nums1, 2);
        System.out.println(Arrays.toString(nums1) + " answer:[3,99,-1,-100]");


    }

    public void rotate(int[] nums, int k){
        k = k%nums.length;

        switchArr(nums, 0, nums.length-1);
        switchArr(nums, 0, k-1);
        switchArr(nums, k, nums.length-1);
    }

    private void switchArr(int[] nums, int start, int end){

        while(start<end){
            int temp = nums[start];

            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate3(int[] nums, int k){
        k= k%nums.length;
        if(k!=0) {
            int[] temp = new int[k];
            System.arraycopy(nums, nums.length-k, temp, 0, k);
            System.arraycopy(nums, 0, nums, k, nums.length-k);
            System.arraycopy(temp, 0, nums, 0, k);

        }
    }

    public void rotate2(int[] nums, int k) {
        if(nums.length <= 1){
            return;
        }

        k=k%nums.length;

        int[] temp = Arrays.copyOfRange(nums, nums.length-k, nums.length);

        for(int i = nums.length-1-k; i>=0; i--){
            nums[i+k] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate1(int[] nums, int k) { //just shift one by one
        k = k % nums.length;

        for (int i = 0; i < k; i++) {
            int next = nums[0];
            for (int j = 1; j < nums.length; j++) {
                int temp = nums[j];

                nums[j] = next;
                next = temp;

            }
            nums[0] = next;
        }
    }
}
