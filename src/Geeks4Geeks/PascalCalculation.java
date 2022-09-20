/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geeks4Geeks;

/**
 *
 * @author bkones
 */
public class PascalCalculation {
    //Pascal function 

    public static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {

            int C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

// Driver code
    public static void main(String[] args) {
        int n = 8;
        printPascal(n);
    }
}
