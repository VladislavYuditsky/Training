// Получить квадратную матрицу порядка n: (смотреть в задании)

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task25 {
    public static void main(String[] args) {
        int[][] matrix;
        int size;
        Random random = new Random();

        size = random.nextInt(9) + 1;

        matrix = new int[size][size];

        int tmp = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = tmp++;
            }
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
