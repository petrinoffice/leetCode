package algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(new BinarySearch().search(new int[]{1,2,3,4,5,6,7,8,9}, 6));
        System.out.println(new BinarySearch().search(new int[]{1,2,3,4,5,6,7,8,9}, 3));
        System.out.println(new BinarySearch().search(new int[]{1,2,3,4,5,6,7,8,9}, 9));
        System.out.println(new BinarySearch().search(new int[]{1,2,3,4,5,6,7,8,9}, 0));
    }

    private int search(int[] nums, int n){
        int left = 0;
        int right = nums.length;

        while(left<right){
            int median = (left+right)/2;

            int num = nums[median];
            if (num == n){
                return median;
            }

            if(num > n){
                right = median;
            }else {
                left = median;
            }
        }

        return -1;
    }
}
