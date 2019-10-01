package com.yuditsky.unit3.classes_and_objects.task2.entity;

public class Train {
    private Integer number;
    private String departureTime;
    private String destination;

    public Train(int number, String departureTime, String destination){
        this.number = number;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    @Override
    public String toString(){
        return "Number: " + this.getNumber() + " departure time: " +
                this.getDepartureTime() + " destination: " + this.getDestination();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
