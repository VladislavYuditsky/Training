//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
// на единицу в заданном диапазоне.Предусмотрите инициализацию счетчика значениями по умолчанию
// и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

package com.yuditsky.unit3.classes_and_objects.task3;

import com.yuditsky.unit3.classes_and_objects.task3.entity.Counter;
import com.yuditsky.unit3.classes_and_objects.task3.logic.CounterLogic;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterLogic counterLogic = new CounterLogic(counter);
        Scanner in = new Scanner(System.in);
        int choice;

        while ((choice = menu()) != 0) {
            switch (choice) {
                case 1:
                    switch (initializationMenu()) {
                        case 1:
                            counter = new Counter();
                            break;
                        case 2:
                            System.out.print("Enter limit: ");
                            int limit = in.nextInt();
                            counter = new Counter(limit);
                            break;
                        case 3:
                            System.out.print("Enter initial value and limit:");
                            int start = in.nextInt();
                            limit = in.nextInt();
                            counter = new Counter(start, limit);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Incorrect input");
                            break;
                    }
                    counterLogic = new CounterLogic(counter);
                    pressEnterKey();
                    break;
                case 2:
                    System.out.println(counter.toString());
                    pressEnterKey();
                    break;
                case 3:
                    System.out.println(counter.getStart());
                    pressEnterKey();
                    break;
                case 4:
                    System.out.print("Enter start value:");
                    counter.setStart(in.nextInt());
                    pressEnterKey();
                    break;
                case 5:
                    System.out.println(counter.getLimit());
                    pressEnterKey();
                    break;
                case 6:
                    System.out.println("Enter limit value:");
                    counter.setLimit(in.nextInt());
                    pressEnterKey();
                    break;
                case 7:
                    System.out.println(counter.getCurrent());
                    pressEnterKey();
                    break;
                case 8:
                    System.out.println("Enter current value:");
                    counter.setCurrent(in.nextInt());
                    pressEnterKey();
                    break;
                case 9:
                    counterLogic.up();
                    pressEnterKey();
                    break;
                case 10:
                    counterLogic.down();
                    pressEnterKey();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Incorrect input");
                    pressEnterKey();
                    break;
            }
        }
    }

    public static int menu() {
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

    public static int initializationMenu() {
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

    public static void pressEnterKey()
    {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
