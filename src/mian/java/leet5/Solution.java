package leet5;

import java.util.Arrays;

/**
 * Given an array of integers nums and a positive integer k, find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.
 * <p>
 * Example 1:
 * Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 * Output: True
 * Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
 * Note:
 * <p>
 * 1 <= k <= len(nums) <= 16.
 * 0 < nums[i] < 10000.
 */
public class Solution {
    public static boolean search(int[] groups, int row, int[] nums, int target) {
        if (row < 0) {
            return true;
        }
        int v = nums[row--];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;
                if (search(groups, row, nums, target)) {
                    return true;
                }
                groups[i] -= v;
            }
            if (groups[i] == 0) {
                break;
            }
        }
        return false;
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;
        int target = sum / k;

        Arrays.sort(nums);
        int row = nums.length - 1;
        if (nums[row] > target) return false;
        while (row >= 0 && nums[row] == target) {
            row--;
            k--;
        }
        return search(new int[k], row, nums, target);
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        canPartitionKSubsets(nums, 4);
    }
}
