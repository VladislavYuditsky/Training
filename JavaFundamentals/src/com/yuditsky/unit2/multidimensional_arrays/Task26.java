//С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
// а) вычислить сумму отрицательных элементов в каждой строке;
// б) определить максимальный элемент в каждой строке;
// в) переставить местами максимальный и минимальный элементы матрицы

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        int[][] matrix;
        int rowNum, columnNum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        rowNum = in.nextInt();
        System.out.print("Enter m: ");
        columnNum = in.nextInt();
        matrix = new int[rowNum][columnNum];

        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < columnNum; j++){
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < rowNum; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Negative sum: ");
        for(int i = 0; i < rowNum; i++){
            int sum = 0;
            for(int j = 0; j < columnNum; j++){
                if(matrix[i][j] < 0) {
                    sum += matrix[i][j];
                }
            }
            System.out.println("Row " + i + ": " + sum);
        }

        System.out.println("Max element: ");
        for(int i = 0; i < rowNum; i++){
            int max = matrix[i][0];
            for(int j = 1; j < columnNum; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            System.out.println("Row " + i + ": " + max);
        }

        int max = matrix[0][0];
        int min = matrix[0][0];
        int iMax = 0, jMax = 0, iMin = 0, jMin = 0;
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < columnNum; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    iMax = i;
                    jMax = j;
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    iMin = i;
                    jMin = j;
                }
            }
        }
        int tmp = matrix[iMax][jMax];
        matrix[iMax][jMax] = matrix[iMin][jMin];
        matrix[iMin][jMin] = tmp;

        for(int i = 0; i < rowNum; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
