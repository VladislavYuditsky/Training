//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

package com.yuditsky.unit2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Random random = new Random();
        int num, quantity = 1;
        int curNum, curQuantity;

        size = random.nextInt(14) + 1;
        System.out.println("Size of array: " + size);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array: " + Arrays.toString(array));

        num = array[0];
        for (int i = 0; i < array.length; i++) {
            curNum = array[i];
            curQuantity = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (curNum == array[j]) {
                    curQuantity++;
                }
            }
            if (curQuantity > quantity) {
                num = curNum;
                quantity = curQuantity;
            }
            if (curQuantity == quantity && curNum < num) {
                num = curNum;
            }
        }
        System.out.println(num);
    }
}
