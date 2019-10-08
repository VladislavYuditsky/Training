package com.yuditsky.unit3.classes_and_objects.task3.view;

import java.io.IOException;
import java.util.Scanner;

public class CounterView {

    public void print(String string) {
        System.out.println(string);
    }

    public void print(int num) {
        System.out.println(num);
    }

    public int getInt() {
        Scanner in = new Scanner(System.in);

        return in.nextInt();
    }

    public int menu() {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("Enter:");
        System.out.println("1.Initialize counter");
        System.out.println("2.Get counter information");
        System.out.println("3.Get start value");
        System.out.println("4.Set start value");
        System.out.println("5.Get limit value");
        System.out.println("6.Set limit value");
        System.out.println("7.Get current value");
        System.out.println("8.Set current value");
        System.out.println("9.Counter value up");
        System.out.println("10.Counter value down");
        System.out.println("0.Exit");

        choice = in.nextInt();

        return choice;
    }

    public int initializationMenu() {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("Enter:");
        System.out.println("1.Initialize counter");
        System.out.println("2.Initialize counter with limit");
        System.out.println("3.Initialize counter with initial value and limit");
        System.out.println("0.Exit");

        choice = in.nextInt();

        return choice;
    }

    public void pressEnterKey() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
