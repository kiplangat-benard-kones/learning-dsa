/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarevisited;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author bkones
 */
public class PairsInArraySumEqualsAgiveNumber {

    public static void getPairUsingBruteForce(int[] arr, int num) { // O(n^2)
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {

            for (int j = 0; j < arrLength; j++) {

                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " and " + arr[j]);
                    System.out.println();
                }

            }

        }

    }

    /**
     *
     *
     * Read more:
     * https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz7fJoGICLW
     *
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet(int[] numbers, int n) { // space o(n), time complexity O(n)
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);

        for (int value : numbers) {
            int target = n - value;

            // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    /**
     * Read more:
     * https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz7fJtqk3Zx
     *
     * @param numbers
     * @param k
     */
    public static void printPairsUsingTwoPointers(int[] numbers, int k) { // O(nlogn) -- quicksort
        if (numbers.length < 2) {
            return;
        }
        Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[left],
                        numbers[right]);
                left = left + 1;
                right = right - 1;

            } else if (sum < k) {
                left = left + 1;

            } else if (sum > k) {
                right = right - 1;
            }
        }

    }

    public static void main(String[] args) {
        int[] input = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        System.out.println("------------Brute force O(n^2)----------------------");
        getPairUsingBruteForce(input, 7);
        System.out.println("------------Set O(n)----------------------");
        printPairsUsingSet(input, 7);
        System.out.println("------------Quick sort O(nlogn)----------------------");
        printPairsUsingTwoPointers(input, 7);
    }
}
