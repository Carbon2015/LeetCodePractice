import java.util.Arrays;

public class TwoSum01 {
    public static void main(String[] args) {
        int[] testData = {3, 2, 4};
        int target = 6;
        int[] result = {0, 0};
        result = twoSum(testData, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no such two items in array");
    }

//    public static int[] twoSum1(int[] nums, int target) {
//        Arrays.sort(nums);
//        for (int prevPointer = 0, rearPointer = nums.length - 1; prevPointer < rearPointer; ) {
//            int tempSum = nums[prevPointer] + nums[rearPointer];
//            if (tempSum == target) {
//                return new int[]{prevPointer, rearPointer};
//            } else if (tempSum > target) {
//                rearPointer--;
//            } else {
//                prevPointer++;
//            }
//        }
//        throw new IllegalArgumentException("no such two items in array");
//    }
}
