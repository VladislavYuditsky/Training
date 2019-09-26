// Операция сглаживания матрицы дает новую матрицу того же размера,
// каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
// Построить результат сглаживания заданной матрицы

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task36 {
    public static void main(String[] args) {
        int[][] matrix, newMatrix;
        int size;
        Random random = new Random();

        size = random.nextInt(9) + 1;
        matrix = new int[size][size];
        newMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));

        if (size > 1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int sum = 0, num = 0;
                    int cntr1, cntr2;

                    if (i - 1 >= 0) {
                        cntr1 = i - 1;
                    } else {
                        cntr1 = i;
                    }

                    if (j - 1 >= 0) {
                        cntr2 = j - 1;
                    } else {
                        cntr2 = j;
                    }

                    for (int k = cntr1; k <= i + 1 && k < size; k++) {
                        for (int q = cntr2; q <= j + 1 && q < size; q++) {
                            if (k != i || q != j) {
                                num++;
                                sum += matrix[k][q];
                            }
                        }
                    }
                    newMatrix[i][j] = sum / num;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(newMatrix[i]));
    }
}
