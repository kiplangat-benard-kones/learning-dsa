/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bkones
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */
class Solution {

    public static boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashMap<Integer, Integer> myInt = new HashMap<>();
        int count = 1;
        for (int num : nums) {
            if (myInt.containsKey(num)) {
                myInt.put(num, myInt.get(num) + 1);
            } else {
                myInt.put(num, count);
            }
        }
        System.out.println(""+myInt);
        //Iterate the map
        for (Map.Entry<Integer, Integer> entry : myInt.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        System.out.println(a.length);
        System.out.println("Has duplicates: " + Solution.containsDuplicate(a));

    }
}
