//Дана последовательность целых чисел a1,...,an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,...,an).

package com.yuditsky.unit2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        int[] array, newArray;
        int diff = 0;
        int minNum;
        Random random = new Random();

        array = new int[random.nextInt(9) + 1];


        array[0] = random.nextInt(10);
        minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }

        System.out.println(Arrays.toString(array));

        int i = 0;
        do {
            if (array[i] == minNum) {
                diff++;
                leftShift(array, i);
            } else {
                i++;
            }
        } while (i < array.length);

        newArray = new int[array.length - diff];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        System.out.println(Arrays.toString(newArray));
    }

    public static void leftShift(int[] array, int startPosition) {
        int i;
        for (i = startPosition; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] += 1;
    }
}
