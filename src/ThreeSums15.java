import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSums15 {
    public static void main(String[] args) {
        int[] testData = {0, -4, -1, -4, -2, -3, 2};
        List<List<Integer>> result = threeSum1(testData);
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int numsLength = nums.length;
        if (numsLength < 3) {
            return result;
        }
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return result;
        }
        for (int k = 0; k < numsLength - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = numsLength - 1;
            while (i < j) {
                int tempTarget = nums[k] + nums[i] + nums[j];
                if (tempTarget == 0) {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    do {
                        j--;
                    } while (i < j && nums[j] == nums[j + 1]);
                    do {
                        i++;
                    } while (i < j && nums[i] == nums[i - 1]);
                } else if (tempTarget > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int numsLength = nums.length;
        for (int k = 0; k < numsLength - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = numsLength - 1;
            while (i < j) {
                if (nums[k] + nums[i] + nums[j] == 0) {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    j--;
                    while (nums[j] == nums[j + 1] && i < j) {
                        j--;
                    }
                    i++;
                    while (nums[i] == nums[i - 1] && i < j) {
                        i++;
                    }
                } else if (nums[k] + nums[i] + nums[j] > 0) {
                    j--;
                } else if (nums[k] + nums[i] + nums[j] < 0) {
                    i++;
                }
            }
        }
        return result;
    }
}
