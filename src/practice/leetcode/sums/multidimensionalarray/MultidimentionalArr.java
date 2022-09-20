/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.sums.multidimensionalarray;

/**
 *
 * @author bkones
 */
public class MultidimentionalArr {
    
    public static void main(String[] args) {
       int arr[][] = {{5,12,17,9,3},{13,4,8,14,1},{9,6,3,7,21}};
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println(arr1[j]);
            }
        }
    }
}
