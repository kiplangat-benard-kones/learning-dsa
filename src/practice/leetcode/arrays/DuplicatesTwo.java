/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.arrays;

import static java.lang.Math.abs;

/**
 *
 * @author bkones
 */
public class DuplicatesTwo {

    /**
     * Given an integer array nums and an integer k, return true if there are
     * two distinct indices i and j in the array such that nums[i] == nums[j]
     * and abs(i - j) <= k. Example 1: Input: nums = [1,2,3,1], k = 3 Output:
     * true Example 2: * Input: nums = [1,0,1,1], k = 1 Output: true Example 3:
     * Input: nums = [1,2,3,1,2,3], k = 2 Output: false 1 2 3 , 2 @param nums
     * @param k @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean hasDup = false;
        for (int i = 0; i <= nums.length - 1; i++) {

            for (int j = 0; j <= nums.length - 1; j++) {

                if (nums[i] == nums[j]) {

                    if (i != j && j > i) {

                        if (abs(i - j) <= k) {

                            hasDup = true;

                        }

                    }
                }
            }
        }
        return hasDup;
    }

    public static void main(String[] args) {
        System.out.println("START HERE.......");
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean res = new DuplicatesTwo().containsNearbyDuplicate(nums, 3);
        System.out.println("result:" + res);
    }
}
