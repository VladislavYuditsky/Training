//Дано значение а. Не используя никаких функций и никаких операций, кроме умножения,
// получить значение а^8 за три операции и а^10 за четыре операции.

package com.yuditsky.unit1.linear_programs;

public class Task27 {
    public static void main(String[] args) {
        int a = 2;
        int tmp, squared;
        System.out.println("а = " + a);
        squared = a * a;
        tmp = squared * squared;
        tmp *= tmp;
        System.out.println("a^8 = " + tmp);
        tmp *= squared;
        System.out.println("a^10 = " + tmp);
    }
}
