//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.

package com.yuditsky.unit3.classes_and_objects.task2;

import com.yuditsky.unit3.classes_and_objects.task2.entity.Train;
import com.yuditsky.unit3.classes_and_objects.task2.logic.TrainDirectory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TrainDirectory trainDirectory;
        trainDirectory = new TrainDirectory(new Train(1, "1:11", "Brest"));

        trainDirectory.addTrain(new Train(3, "3:33", "Grodno"));
        trainDirectory.addTrain(new Train(44, "5:15", "Gomel"));
        trainDirectory.addTrain(new Train(14, "0:33", "Brest"));
        trainDirectory.addTrain(new Train(7, "21:17", "Brest"));

        for(int i = 0; i < trainDirectory.numberOfTrains(); i++){
            System.out.println(trainDirectory.getTrain(i).toString());
        }

        trainDirectory.sortByNumber();
        System.out.println("Sort by number:");

        for(int i = 0; i < trainDirectory.numberOfTrains(); i++){
            System.out.println(trainDirectory.getTrain(i).toString());
        }

        System.out.println("Enter number of train: ");
        System.out.println(trainDirectory.getInfo(in.nextInt()));

        trainDirectory.sortByDestination();
        System.out.println("Sort by destination:");

        for(int i = 0; i < trainDirectory.numberOfTrains(); i++){
            System.out.println(trainDirectory.getTrain(i).toString());
        }
    }
}
