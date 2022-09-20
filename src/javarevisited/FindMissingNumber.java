/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javarevisited;

/**
 *
 * @author bkones
 */
public class FindMissingNumber {
    public static int getMissingNumber(int[] arr,int n){
        double part2 = ((double)(n+1)/2);
        double expectedSum = n * part2;
        int actualSum = 0;
        
        for(int num : arr ){
            actualSum +=num;
        }
        
        return (int)expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,6,7,8,9,10};
        int res = getMissingNumber(myArray, 10);
        System.out.println(res);
    }
}
