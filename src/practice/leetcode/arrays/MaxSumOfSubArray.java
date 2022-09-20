/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.arrays;

/**
 *
 * @author bkones --- DIVIDE AND CONQUER ALGORITHM
 */
public class MaxSumOfSubArray {

    public static void main(String args[]) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }

    private static int helper(int i, int j, int[] nums) {
        int sum;
        if (i == j) {
            return nums[i];
        }
        int left_cross = Integer.MIN_VALUE;
        int right_cross = Integer.MIN_VALUE;

        int mid = (i + j) / 2;

        int cur = 0;

        for (int k = mid + 1; k <= j; k++) {
            cur += nums[k];
            right_cross = Math.max(right_cross, cur);
        }

        cur = 0;

        for (int k = mid; k >= i; k--) {
            cur += nums[k];
            left_cross = Math.max(left_cross, cur);
        }

        int cross_sum = left_cross + right_cross;
        int left_sum = helper(i, mid, nums);
        int right_sum = helper(mid + 1, j, nums);

        sum = Math.max(cross_sum, Math.max(left_sum, right_sum));
        return sum;
    }
}
