package com.yuditsky.unit3.classes_and_objects.task4.logic;

import com.yuditsky.unit3.classes_and_objects.task4.entity.Clock;

public class Tuner {
    private Clock clock;

    public Tuner(Clock clock) {
        this.clock = clock;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    /*System.out.println(m + " ч " + n + " мин " + k + " c + " + p + " ч " + q + " мин " + r + " c = ");
        System.out.print(((((k + r) / 60 + n + q) / 60 + m + p) % 24) + " ч ");
        System.out.print(((k + r) / 60 + n + q) % 60 + " мин ");
        System.out.print((k + r) % 60 + " c");*/

    //public void setTime(int hour, int minute, int )
}
