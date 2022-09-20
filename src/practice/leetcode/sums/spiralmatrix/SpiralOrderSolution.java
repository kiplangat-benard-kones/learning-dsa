/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.leetcode.sums.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bkones
 */
public class SpiralOrderSolution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        /**
         * | 5 1 3 5
         * | 3 4 5 8
         * | 6 9 1 2
         *
         * 513582196345
         */
        System.out.println("Matrix length :" + matrix.length);
        System.out.println("Matrix row 1 length :" + matrix[0].length);
        if (matrix.length == 0) {
            return res;
        }
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
                for (int i = columnEnd; i >= columnBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 3, 5}, {3, 4, 5, 8}, {6, 9, 1, 2}};
        List<Integer> res = new SpiralOrderSolution().spiralOrder(matrix);
        System.out.println(res);
    }
}
