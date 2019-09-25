//Найти произведение цифр заданного четырёхзначного числа

package com.yuditsky.unit1.linear_programs;

public class Task16 {
    public static void main(String[] args) {
        int x = 1234;
        int y = 1;
        for (int i = 0; i < 3; i++) {
            y *= x % 10;
            x /= 10;
        }
        System.out.println(y);
    }
}
