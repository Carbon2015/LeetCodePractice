//import sun.jvm.hotspot.memory.PlaceholderEntry;

import javax.print.attribute.standard.PresentationDirection;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] testData = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate_Method_2(testData, k);
        //reverseArray(testData, 0, 6);
    }
    public static void rotate_Method_2(int[] nums, int k) {
        int lenArray = nums.length;
        if (k > lenArray) {
            k = k % lenArray;
        }
        reverseArray(nums, 0, lenArray - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, lenArray - 1);
    }
    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public static void rotate_Method_1(int[] nums, int k) {
        int lenArray = nums.length;
        if (k > lenArray) {
            k = k % lenArray;
        }
        for (int i = 0; i < k; i++) {
            int moveItem = nums[lenArray - 1];
            for (int j = 0; j < lenArray - 1; j++) {
                nums[lenArray - 1 - j] = nums[lenArray - 2 - j];
            }
            nums[0] = moveItem;
        }
    }
}
