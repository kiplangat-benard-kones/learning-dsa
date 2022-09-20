/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bkones
 */
public class MatrixCircular {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;

        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

            for (int i = columnBegin; i <= columnEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if (rowBegin <= rowEnd) {
                for(int i = columnEnd; i>=columnBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][columnBegin]);
                }
                columnBegin++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{8,9,4},{7,6,5}};
      List<Integer> res =  spiralOrder(matrix);
      
        System.out.println("Response" + res);
        
    }
}
