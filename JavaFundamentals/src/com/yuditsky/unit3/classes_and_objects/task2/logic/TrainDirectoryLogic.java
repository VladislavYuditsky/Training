package com.yuditsky.unit3.classes_and_objects.task2.logic;

import com.yuditsky.unit3.classes_and_objects.task2.entity.Train;
import com.yuditsky.unit3.classes_and_objects.task2.entity.TrainDirectory;

import java.util.Comparator;

public class TrainDirectoryLogic {

    public static void sortByDestination(TrainDirectory directory) {
        directory.trains().sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public static String takeInfo(TrainDirectory directory, Integer number) {
        for (Train train : directory.trains()) {
            if (train.getNumber() == number) return train.toString();
        }
        return "The train with the given number is missing";
    }

    public static void sortByNumber(TrainDirectory directory) {
        directory.trains().sort(Comparator.comparing(Train::getNumber));
    }
}
