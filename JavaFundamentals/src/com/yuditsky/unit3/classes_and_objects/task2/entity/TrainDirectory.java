package com.yuditsky.unit3.classes_and_objects.task2.entity;

import java.util.ArrayList;

public class TrainDirectory {

    private ArrayList<Train> trains;

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

    public ArrayList<Train> trains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(getClass()!=obj.getClass()){
            return false;
        }

        TrainDirectory directory = (TrainDirectory) obj;
        if(trains == null){
            return trains == directory.trains;
        } else{
            if(!trains.equals(directory.trains)){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        return (trains == null) ? 0 : trains.hashCode();
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "trains: " + trains;
    }
}
