// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        int matrix[][];
        int size;
        Random random = new Random();

        do {
            size = random.nextInt(9) + 1;
        } while (size % 2 != 0);
        matrix = new int[size][size];

        for (int j = 0; j < size / 2; j++) {
            for (int i = j; i < size - j; i++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                matrix[i][size - 1 - j] = matrix[i][j];
            }
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
