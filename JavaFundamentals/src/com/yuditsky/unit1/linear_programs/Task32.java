//Текущее показание электронных часов: m ч(0<=m<=23) n мин (0<=n<=59) k с (0<=k<=59).
// Какое время будут показывать часы через p ч q мин r c?

package com.yuditsky.unit1.linear_programs;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int m, n, k;
        int p, q, r;
        System.out.println("Enter time: ");
        m = inputHours();
        n = inputMinutes();
        k = inputSeconds();
        System.out.println("Enter difference: ");
        p = inputHours();
        q = inputMinutes();
        r = inputSeconds();
        System.out.println(m + " ч " + n + " мин " + k + " c + " + p + " ч " + q + " мин " + r + " c = ");
        System.out.print(((((k + r) / 60 + n + q) / 60 + m + p) % 24) + " ч ");
        System.out.print(((k + r) / 60 + n + q) % 60 + " мин ");
        System.out.print((k + r) % 60 + " c");
    }

    public static int inputHours() {
        Scanner in = new Scanner(System.in);
        int hours;
        do {
            hours = in.nextInt();
        } while (hours > 23 || hours < 0);
        return hours;
    }

    public static int inputMinutes() {
        Scanner in = new Scanner(System.in);
        int minutes;
        do {
            minutes = in.nextInt();
        } while (minutes > 60 || minutes < 0);
        return minutes;
    }

    public static int inputSeconds() {
        Scanner in = new Scanner(System.in);
        int seconds;
        do {
            seconds = in.nextInt();
        } while (seconds > 60 || seconds < 0);
        return seconds;
    }

}
