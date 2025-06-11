package dsa;


import java.util.Arrays;

public class Target_Pointer {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        if (findTwoSum(arr, target)) {
            System.out.println("Pair found that sums to " + target);
        } else {
            System.out.println("No pair found that sums to " + target);
        }
    }

    public static boolean findTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("Pair: (" + nums[left] + ", " + nums[right] + ")");
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
