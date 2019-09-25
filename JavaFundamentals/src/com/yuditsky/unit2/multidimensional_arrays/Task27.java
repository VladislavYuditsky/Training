// В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int[][] matrix;
        int rowNum, columnNum;
        int column1, column2;
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        rowNum = random.nextInt(4) + 1;
        columnNum = random.nextInt(4) + 2;
        matrix = new int[rowNum][columnNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }

        for (int i = 0; i < rowNum; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.print("Enter column1: ");
        do {
            column1 = in.nextInt();
        } while (column1 > columnNum - 1);
        System.out.print("Enter column2: ");
        do {
            column2 = in.nextInt();
        } while (column2 > columnNum - 1 || column1 == column2);

        for (int i = 0; i < rowNum; i++) {
            int tmp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = tmp;
        }

        for (int i = 0; i < rowNum; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
