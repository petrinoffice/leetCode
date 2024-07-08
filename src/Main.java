import java.util.*;

class TestClass {
    public static void main(String args[]) {

        TestClass testClass = new TestClass();
//        int[] nums11 = {1, 2, 3, 0, 0, 0};
//        testClass.merge(nums11, 3, new int[]{2, 5, 6}, 3);
//        int[] nums12 = {1};
//        testClass.merge(nums12, 1, new int[]{}, 0);
//        int[] nums13 = {0};
//        testClass.merge(nums13, 0, new int[]{1}, 1);
//        int[] nums14 = {1, 0};
//        testClass.merge(nums14, 1, new int[]{2}, 1);
        int[] nums15 = {2, 0};
        testClass.merge(nums15, 1, new int[]{1}, 1);

//        System.out.println(Arrays.toString(nums11));
//        System.out.println(Arrays.toString(nums12));
//        System.out.println(Arrays.toString(nums13));
//        System.out.println(Arrays.toString(nums14));
        System.out.println(Arrays.toString(nums15));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;

        for (int i = nums1.length - 1; n >= 0; i--) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
        }




//        for (int i = nums1.length - 1; n >= 0; i--) {
//            if (m >= 0 && nums1[m] > nums2[n]) nums1[i] = nums1[m--];
//            else nums1[i] = nums2[n--];
//        }
    }
}

