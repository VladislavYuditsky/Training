//Переставить строки матрицы случайным образом.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task37 {
    public static void main(String[] args) {
        int[][] matrix;
        int size;
        int permutationsNum;
        int firstRow, secondRow;
        Random random = new Random();

        size = random.nextInt(9) + 1;
        matrix = new int[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(9);
            }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));

        permutationsNum = random.nextInt(9) + 1;

        for (int i = 0; i < permutationsNum; i++) {
            firstRow = random.nextInt(size - 1);
            do {
                secondRow = random.nextInt(size - 1);
            } while (firstRow == secondRow);

            for(int j = 0; j < size; j++){
                int tmp = matrix[firstRow][j];
                matrix[firstRow][j] = matrix[secondRow][j];
                matrix[secondRow][j] = tmp;
            }
        }

        System.out.println();
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
