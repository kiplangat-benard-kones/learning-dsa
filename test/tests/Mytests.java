package tests;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bkones
 *
 * 789 456 123
 *
 * 789632145
 */
public class Mytests {

    public List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> res = new ArrayList();
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
            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    res.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{7,8,9}, {4,5,6}, {1,2,3}};
        List<Integer> resp = new Mytests().spiralMatrix(matrix);
        System.out.println(resp);

    }
}
