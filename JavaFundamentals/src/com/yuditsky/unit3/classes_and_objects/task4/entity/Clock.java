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

    public void spinUp(int hour, int minute, int second) {
        secondUp(second);
        minuteUp(minute);
        hourUp(hour);
    }

    private void secondUp(int second) {
        int newValue;

        newValue = this.second + second;
        while (newValue > 60) {
            newValue -= 60;
            minuteUp(1);
        }

        this.second = newValue;
    }

    private void minuteUp(int minute) {
        int newValue;

        newValue = this.minute + minute;
        while (newValue > 60) {
            newValue -= 60;
            hourUp(1);
        }

        this.minute = newValue;
    }

    private void hourUp(int hour) {
        int newValue;

        newValue = this.hour + hour;
        while (hour > 24) {
            newValue -= 24;
        }

        this.hour = newValue;
    }

    public void spinDown(int hour, int minute, int second) {
        secondDown(second);
        minuteDown(minute);
        hourDown(hour);
    }

    private void secondDown(int second) {
        int newValue;

        newValue = this.second - second;
        while (newValue < 0) {
            newValue += 60;
            minuteDown(1);
        }

        this.second = newValue;
    }

    private void minuteDown(int minute) {
        int newValue;

        newValue = this.minute - minute;
        while (newValue < 0) {
            newValue += 60;
            hourDown(1);
        }

        this.minute = newValue;
    }

    private void hourDown(int hour) {
        int newValue;

        newValue = this.hour - hour;
        while (newValue < 0) {
            newValue += 24;
        }

        this.hour = newValue;
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

        Clock clock = (Clock) obj;
        if (second != clock.second) {
            return false;
        }

        if (minute != clock.minute) {
            return false;
        }

        if (hour != clock.hour) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 31 * second + 29 * minute + 17 * hour;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "hour: " + hour + ", minute: " + minute + ", second: " + second;
    }
}
