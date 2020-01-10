import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] testData1 = {1, 2, 3, 0, 0, 0};
        int[] testData2 = {2,5,6};
        merge(testData1, 3, testData2 ,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        
    }
}
