//Даны натуральные числа M и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

package com.yuditsky.unit1.linear_programs;

public class Task35 {
    public static void main(String[] args) {
        double M = 1397.9;
        double N = 4.56;
        int i = 0;
        String str = String.valueOf(M / N);
        do {
            i++;
        } while (str.charAt(i) != '.');
        System.out.println(str);
        System.out.println(str.charAt(i - 1));
        System.out.println(str.charAt(i + 1));
    }
}
