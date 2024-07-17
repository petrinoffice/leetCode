package leet;

public class N11_Container_Water {
    public static void main(String[] args) {
        System.out.println(new N11_Container_Water().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(new N11_Container_Water().maxArea(new int[]{1, 1}));
        System.out.println(new N11_Container_Water().maxArea(new int[]{1, 2, 1}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }

        return max;
    }
}
