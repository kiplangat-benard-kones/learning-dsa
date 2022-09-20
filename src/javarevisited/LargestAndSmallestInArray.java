/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarevisited;

/**
 *
 * @author bkones
 */
public class LargestAndSmallestInArray {

    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest:" + smallest);
        System.out.println("Larges:" + largest);
    }
    public static void main(String[] args) {
        int[]arr={-20, 34, 21, -87, 92};
        largestAndSmallest(arr);
    }
}
