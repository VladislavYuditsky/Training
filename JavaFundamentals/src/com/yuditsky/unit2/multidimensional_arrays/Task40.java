//Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
// каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.

package com.yuditsky.unit2.multidimensional_arrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.sqrt;

public class Task40 {
    public static void main(String[] args) {
        int size;
        int[] buffer;
        Random random = new Random();

        size = random.nextInt(3) + 1;
        buffer = new int[size * size];

        for (int i = 0; i < size * size; i++)
            buffer[i] = i + 1;

        System.out.println(Arrays.toString(buffer));

        permute(0, buffer);
    }

    public static void permute(int i, int[] array) {
        if (i == array.length) {
            int[][] matrix = parseMatrix(array);
            if (isMagical(matrix)) {
                System.out.println();
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.println(Arrays.toString(matrix[j]));
                }
            }
            return;
        }
        for (int j = i; j < array.length; j++) {
            swap(array, i, j);
            permute(i + 1, array);
            swap(array, i, j);
        }
    }

    static boolean isMagical(int[][] matrix) {
        int sum = rowSum(matrix[0]);

        for (int i = 1; i < matrix[0].length; i++)
            if (rowSum(matrix[i]) != sum)
                return false;

        for (int j = 0; j < matrix[0].length; j++)
            if (columnSum(matrix, j) != sum)
                return false;

        int diaSum1 = 0, diaSum2 = 0;
        for(int i = 0; i < matrix[0].length; i++){
            diaSum1 += matrix[i][i];
            diaSum2 += matrix[matrix[0].length - 1 - i][i];
        }
        if(diaSum1 != sum || diaSum2 != sum)
            return false;

        return true;
    }

    static int columnSum(int[][] matrix, int j){
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++)
            sum += matrix[i][j];
        return sum;
    }

    static int rowSum(int[] row) {
        int sum = 0;
        for (int j = 0; j < row.length; j++)
            sum += row[j];
        return sum;
    }

    static int[][] parseMatrix(int[] array) {
        int size = (int) sqrt(array.length);
        int[][] matrix = new int[size][size];
        int k = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = array[k];
                ++k;
            }
        }

        return matrix;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}

/*String string = "1234";
        int[] factorials = new int[string.length() + 1];
        factorials[0] = 1;
        for (int i = 1; i <= string.length(); i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        for (int i = 0; i < factorials[string.length()]; i++) {
            String onePermutation = "";
            String temp = string;
            int positionCode = i;
            for (int position = string.length(); position > 0; position--) {
                int selected = positionCode / factorials[position - 1];
                onePermutation += temp.charAt(selected);
                positionCode = positionCode % factorials[position - 1];
                temp = temp.substring(0, selected) + temp.substring(selected + 1);
            }
            System.out.println(onePermutation);
        }*/

