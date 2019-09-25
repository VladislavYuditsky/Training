//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task32 {
    public static void main(String[] args) {
        Integer[][] matrix;
        int rowNum, columnNum;
        Random random = new Random();

        rowNum = random.nextInt(9) + 1;
        columnNum = random.nextInt(9) + 1;
        matrix = new Integer[rowNum][columnNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < rowNum; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        System.out.println("Sorted");

        for (int i = 0; i < rowNum; i++) {
            Arrays.sort(matrix[i]);
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Sorted reverse");

        for (int i = 0; i < rowNum; i++) {
            Arrays.sort(matrix[i], Collections.reverseOrder());
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
