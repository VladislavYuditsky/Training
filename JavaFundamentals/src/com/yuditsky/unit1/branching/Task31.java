//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

package com.yuditsky.unit1.branching;

import java.util.ArrayList;
import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int a, b;
        ArrayList<Integer> sides = new ArrayList<>();

        System.out.print("A = ");
        a = inputSide();
        System.out.print("B = ");
        b = inputSide();
        System.out.print("x = ");
        sides.add(inputSide());
        System.out.print("y = ");
        sides.add(inputSide());
        System.out.print("z = ");
        sides.add(inputSide());

        if (a <= b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (Integer firstSide : sides) {
            if (firstSide <= b) {
                sides.remove(firstSide);
                for (Integer secondSide : sides) {
                    if (secondSide <= a) {
                        System.out.println("Will pass.");
                        return;
                    }
                }
                break;
            }
        }
        System.out.println("Will not pass.");
    }

    public static int inputSide() {
        Scanner in = new Scanner(System.in);
        int result;

        do {
            result = in.nextInt();
        } while (result <= 0);

        return result;
    }
}
