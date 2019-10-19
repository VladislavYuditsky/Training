package com.yuditsky.unit3.classes_and_objects.task2.entity;

public class Train {

    private Integer number;
    private String departureTime;
    private String destination;

    public Train() {
    }

    public Train(int number, String departureTime, String destination) {
        this.number = number;
        this.departureTime = departureTime;
        this.destination = destination;
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

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Train train = (Train) obj;
        if (number != train.number) {
            return false;
        }

        if (departureTime == null) {
            return departureTime == train.departureTime;
        } else {
            if (!departureTime.equals(train.departureTime)) {
                return false;
            }
        }

        if (destination == null) {
            return destination == train.destination;
        } else {
            if (!destination.equals(train.destination)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 31 * number + ((destination == null) ? 0 : destination.hashCode()) +
                ((departureTime == null) ? 0 : departureTime.hashCode());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "number: " + number + ", departure time: " + departureTime +
                ", destination: " + destination;
    }
}
