// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

package com.yuditsky.unit1.branching;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int x1, y1;
        int x2, y2;
        int x3, y3;
        Scanner in = new Scanner(System.in);

        System.out.print("x1 = ");
        x1 = in.nextInt();
        System.out.print("y1 = ");
        y1 = in.nextInt();
        System.out.print("x2 = ");
        x2 = in.nextInt();
        System.out.print("y2 = ");
        y2 = in.nextInt();
        System.out.print("x3 = ");
        x3 = in.nextInt();
        System.out.print("y3 = ");
        y3 = in.nextInt();

        if((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
