/*
 */
package freecodecamp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bkones
 */
public class BubbleSortExample {

    private void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { //-i because the largest element will be bubbled at the end so we don't have to compare.
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,8,2,7,5,3,1,4};
        int[] sortedArray = new BubbleSortExample().bubbleSort(arr);
         List<Integer> res = new ArrayList();
        for(int i=0;i<=sortedArray.length-1;i++){
            System.out.println(sortedArray[i]);
            res.add(sortedArray[i]);
        }
        System.out.println("SortedArray==="+res);
             
    }
}
