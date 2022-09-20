/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.sums;

/**
 *
 * @author bkones
 */
class Solution {

    /**
     * Given an array of integers nums and an integer target, return indices of
     * the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you
     * may not use the same element twice.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int tempSum;

        while (left < right) {

            tempSum = nums[left] + nums[right];

            if (tempSum == target) {
                return new int[]{left, right};
            }
            if (tempSum > target) {
                right--;
            } else {
                left--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
      
    }
}
