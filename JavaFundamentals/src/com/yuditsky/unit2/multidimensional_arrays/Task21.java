// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        int matrix[][];
        int size;
        Random random = new Random();

        do {
            size = random.nextInt(9) + 1;
        } while (size % 2 != 0);
        matrix = new int[size][size];

        for (int j = 0; j < size; j++) {
            int tmp = size;
            for (int i = j; i < size; i++) {
                matrix[i][j] = tmp--;
            }
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
