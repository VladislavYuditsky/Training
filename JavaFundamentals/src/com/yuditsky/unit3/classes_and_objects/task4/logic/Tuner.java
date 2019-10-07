package com.yuditsky.unit3.classes_and_objects.task4.logic;

import com.yuditsky.unit3.classes_and_objects.task4.entity.Clock;

public class Tuner {

    public void spinUp(Clock clock, int hour, int minute, int second) {
        clock.setSecond((clock.getSecond() + second) % 60);
        clock.setMinute(((clock.getSecond() + second) / 60 + clock.getMinute() + minute) % 60);
        clock.setHour(((((clock.getSecond() + second) / 60 + clock.getMinute() + minute) / 60 + clock.getHour() + hour) % 24));
    }

    public void spinDown(Clock clock, int hour, int minute, int second) {
        secondDown(clock, second);
        minuteDown(clock, minute);
        hourDown(clock, hour);
    }

    private void secondDown(Clock clock, int second) {
        int diff;

        diff = clock.getSecond() - second;
        while (diff < 0) {
            diff += 60;
            minuteDown(clock, 1);
        }

        clock.setSecond(diff);
    }

    private void minuteDown(Clock clock, int minute) {
        int diff;

        diff = clock.getMinute() - minute;
        while (diff < 0) {
            diff += 60;
            hourDown(clock, 1);
        }

        clock.setMinute(diff);
    }

    private void hourDown(Clock clock, int hour) {
        int diff;

        diff = clock.getHour() - hour;
        while (diff < 0) {
            diff += 24;
        }

        clock.setHour(diff);
    }
}
