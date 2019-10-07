package com.yuditsky.unit3.classes_and_objects.task2.logic;

import com.yuditsky.unit3.classes_and_objects.task2.entity.Train;

import java.util.ArrayList;
import java.util.Comparator;

public class TrainDirectory {
    private ArrayList<Train> trains;

    public void sortByDestination() {
        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public String getInfo(Integer number) {
        for (Train train : trains) {
            if (train.getNumber() == number) return train.toString();
        }
        return "The train with the given number is missing";
    }

    public void sortByNumber() {
        trains.sort(Comparator.comparing(Train::getNumber));
    }

    public Train getTrain(int index) {
        return trains.get(index);
    }

    public int numberOfTrains() {
        return trains.size();
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public TrainDirectory() {
        trains = new ArrayList<>();
    }

    public TrainDirectory(Train train) {
        this();
        trains.add(train);
    }

    public TrainDirectory(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
}
