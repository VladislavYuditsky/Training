package com.yuditsky.unit3.classes_and_objects.task3.logic;

import com.yuditsky.unit3.classes_and_objects.task3.entity.Counter;

public class CounterLogic {

    public CounterLogic() {
    }

    public void up(Counter counter) {
        if (counter.getCurrent() != counter.getLimit())
            counter.setCurrent(counter.getCurrent() + 1);
    }

    public void down(Counter counter) {
        if (counter.getCurrent() != counter.getStart())
            counter.setCurrent(counter.getCurrent() - 1);
    }
}
