//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
// Предполагается, что в числе не менее трёх цифр.

package com.yuditsky.cycles;

import java.util.Scanner;

public class Task38{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int delta = 0;
        String num;

        System.out.println("Enter your number: ");
        num = in.next();

        for(int i = num.length() - 1; i > 0; i--){
            if(delta == 0) {
                delta = num.charAt(i) - num.charAt(i - 1);
            } else {
                if(delta != num.charAt(i) - num.charAt(i - 1)){
                    System.out.println("Wrong!");
                    return;
                }
            }
        }
        System.out.println("Right!");
    }
}

