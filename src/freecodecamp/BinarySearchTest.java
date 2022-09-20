/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freecodecamp;

/**
 *
 * @author bkones
 */
public class BinarySearchTest {

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (int) (Math.floor((left + right)) / 2);

        while (left <= right) {

            if (arr[middle] == target) {
                System.out.println("Element is found in index :" + middle);
                break;
            }
            if (arr[middle] > target) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }
            middle = (int) (Math.floor((left + right)) / 2);
            
            
            if (left > right) {
                System.out.println("Element not found");
            }
        }

    }

    public static void main(String[] args) {
        int[] searchList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        BinarySearchTest.binarySearch(searchList, target);
    }
}
