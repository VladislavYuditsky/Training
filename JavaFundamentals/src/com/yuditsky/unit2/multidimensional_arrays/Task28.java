//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        int[][] matrix;
        int rowNum, columnNum;
        int maxSum = 0, columnId = 0;
        Random random = new Random();

        rowNum = random.nextInt(4) + 1;
        columnNum = random.nextInt(4) + 1;

        matrix = new int[rowNum][columnNum];

        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < columnNum; j++){
                matrix[i][j] = random.nextInt(10);
            }
        }

        for(int i = 0; i < rowNum; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        for(int j = 0; j < columnNum; j++){
            int curSum = 0;
            for(int i = 0; i < rowNum; i++){
                curSum += matrix[i][j];
            }
            if(curSum >= maxSum) {
                maxSum = curSum;
                columnId = j;
            }
        }

        System.out.println(columnId);

    }
}
