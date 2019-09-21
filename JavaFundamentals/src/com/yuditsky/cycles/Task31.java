//Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается угадать.
//Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
// а также ошибочные числа пользователя.

package com.yuditsky.cycles;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task31 {
    public static void main(String[] args){
        int[] randArray = new int[5];
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        int i;

        for(i = 0; i < 5; i++){
            randArray[i] = 1 + (int)(random()*15);
        }

        System.out.println("Enter 5 numbers ranging from 1 to 15: ");
        i = 0;
        do{
            array[i] = Integer.parseInt(in.next());
            if(array[i] >= 1 & array[i] <= 15) ++i;
        }while(i < 5 );

        for(i = 0; i < 5; i++){
            System.out.print("Number " + (i + 1) + " - " + randArray[i] + " you entered - " + array[i]);
            if(array[i] == randArray[i]){
                System.out.println(" Right!");
            } else {
                System.out.println(" Wrong.");
            }
        }
    }
}

