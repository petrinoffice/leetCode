package leet;

public class N303_Range_Sum_Query_Immutable {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-2, 0, 3, -5, 2, -1};
        N303_Range_Sum_Query_Immutable task1 = new N303_Range_Sum_Query_Immutable();
        task1.NumArray(arr1);
        System.out.println(task1.sumRange(0,2) + " -> 1");
        System.out.println(task1.sumRange(2,5)+ " -> -1");
        System.out.println(task1.sumRange(0,5)+ " -> -3");
    }

    private int[] arr;

    public void NumArray(int[] nums) {
        arr = new int[nums.length];

        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return arr[right];
        return arr[right] - arr[left - 1];
    }
}
