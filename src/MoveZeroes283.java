public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] testData = {0, 1, 0, 3, 12};
        moveZeroes(testData);
    }

    public static void moveZeroes(int[] nums) {
        int firstZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[firstZero++] = nums[i];
            }
        }
        for (int i = firstZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
