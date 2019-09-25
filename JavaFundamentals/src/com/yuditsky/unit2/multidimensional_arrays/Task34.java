// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

//P.s. Нумирация с нуля.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task34 {
    public static void main(String[] args) {
        int rowNum, columnNum;
        int[][] matrix;
        Random random = new Random();

        rowNum = random.nextInt(9) + 1;
        do {
            columnNum = random.nextInt(9) + 1;
        } while (rowNum < columnNum);

        matrix = new int[rowNum][columnNum];

        for (int i = 0; i < columnNum; i++) {
            int j = 0;
            while (j < i) {
                int randNum = random.nextInt(rowNum - 1);
                if (matrix[randNum][i] == 0) {
                    matrix[randNum][i] = 1;
                    j++;
                }
            }
        }

        for (int i = 0; i < rowNum; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
