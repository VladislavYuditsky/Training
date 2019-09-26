//Найдите произведение двух матриц.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task39 {
    public static void main(String[] args) {
        int[][] matrix1, matrix2, resMatrix;
        int rowNum1, columnNum1, rowNum2, columnNum2;
        Random random = new Random();

        rowNum1 = random.nextInt(4) + 1;
        rowNum2 = random.nextInt(4) + 1;
        columnNum1 = random.nextInt(4) + 1;
        columnNum2 = random.nextInt(4) + 1;

        matrix1 = new int[rowNum1][columnNum1];
        matrix2 = new int[rowNum2][columnNum2];

        for (int i = 0; i < rowNum1; i++)
            for (int j = 0; j < columnNum1; j++) {
                matrix1[i][j] = random.nextInt(9);
            }

        for (int i = 0; i < rowNum2; i++)
            for (int j = 0; j < columnNum2; j++) {
                matrix2[i][j] = random.nextInt(9);
            }

        for (int i = 0; i < rowNum1; i++)
            System.out.println(Arrays.toString(matrix1[i]));
        System.out.println();
        for (int i = 0; i < rowNum2; i++)
            System.out.println(Arrays.toString(matrix2[i]));

        if(columnNum1 == rowNum2){
            resMatrix = new int[rowNum1][columnNum2];

            for(int i = 0; i < rowNum1; i++){
                for(int j = 0; j < columnNum2; j++){
                    for(int k = 0; k < columnNum1; k++){
                        resMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println();
            for (int i = 0; i < rowNum1; i++)
                System.out.println(Arrays.toString(resMatrix[i]));
        } else{
            System.out.println();
            System.out.println("Multiplication impossible");
        }
    }
}
