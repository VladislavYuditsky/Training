package com.yuditsky.unit3.classes_and_objects.task3.entity;

public class Counter {
    private int start;
    private int limit;
    private int current;

    public Counter() {
        current = start = 0;
        limit = 10;
    }

    public Counter(int start, int limit) {
        if(limit < 0 || start < 0){
            this.limit = this.start = current = 0;
        } else {
            if (limit < start) {
                current = this.start = limit;
                this.limit = start;
            } else {
                current = this.start = start;
                this.limit = limit;
            }
        }
    }

    public Counter(int limit) {
        current = start = 0;
        if(limit < 0){
            this.limit = 0;
        } else {
            this.limit = limit;
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
       this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    public String toString(){
        return "Start: " + start + " limit: " + limit + " current: " + current;
    }
}
