//Получить все числа, не превышающие заданного числа N, которые делятся без остатка не все свои цифры.

package com.yuditsky.unit1.cycles;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N;
        int number;
        int numLength;
        boolean isWrong;

        System.out.println("Enter your number: ");
        N = in.nextInt();

        for(int i = 1; i <= N; i++) {
            number = i;
            numLength = (int) Math.log10(i) + 1;
            isWrong = false;
            for (int j = 0; j < numLength; j++) {
                if(number%10 == 0){
                    isWrong = true;
                    break;
                } else {
                    if (i % (number % 10) != 0) {
                        isWrong = true;
                        break;
                    }
                }
                number /= 10;
            }
            if(!isWrong){
                System.out.println(i);
            }
        }
    }
}

