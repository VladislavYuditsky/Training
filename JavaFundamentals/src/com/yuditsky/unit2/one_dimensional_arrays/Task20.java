//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

package com.yuditsky.unit2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of array: ");
        size = in.nextInt();

        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
