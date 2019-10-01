package com.yuditsky.unit3.classes_and_objects.task3.logic;

import com.yuditsky.unit3.classes_and_objects.task3.entity.Counter;

public class CounterLogic {
    private Counter counter;

    public CounterLogic(Counter counter) {
        this.counter = counter;
    }

    public void up() {
        if (counter.getCurrent() != counter.getLimit())
            counter.setCurrent(counter.getCurrent() + 1);
    }

    public void down() {
        if(counter.getCurrent() != counter.getStart())
            counter.setCurrent(counter.getCurrent() - 1);
    }

    @Override
    public String toString(){
        return counter.toString();
    }
}
