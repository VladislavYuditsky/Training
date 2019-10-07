package com.yuditsky.unit3.classes_and_objects.task4.entity;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour) {
        if (hour >= 0 && hour < 23)
            this.hour = hour;
    }

    public Clock(int hour, int minute) {
        this(hour);
        if (minute >= 0 && minute < 60)
            this.minute = minute;
    }

    public Clock(int hour, int minute, int second) {
        this(hour, minute);
        if (second >= 0 && second < 60)
            this.second = second;
    }

    public Clock() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 60 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 60 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return hour + " hour " + minute + " minute " + second + " second";
    }
}
