//Дано значение x. Получить значение -2х+3х^2-4x^3 и 1+2x+3x^2+4x^3. Позаботьтесь об экономии операций.

package com.yuditsky.unit1.linear_programs;

import static java.lang.Math.pow;

public class Task40 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(-2 * x + 3 * pow(x, 2) - 4 * pow(x, 3));
        System.out.println(1 + 2 * x + 3 * pow(x, 2) + 4 * pow(x, 3));
    }
}
