import java.util.Arrays;

import static java.util.Objects.hash;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println("One" + Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(int[] nums, int target) {
        int j = 1;
        while (j < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] == target - nums[i] && j != i) {
                    return new int[]{i, j};
                }
            }
            j++;
        }

        return null;
    }



}
