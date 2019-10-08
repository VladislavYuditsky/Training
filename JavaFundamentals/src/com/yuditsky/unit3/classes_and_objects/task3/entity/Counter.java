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
        if (limit < 0 || start < 0) {
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
        if (limit < 0) {
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

    public void up() {
        if (current != limit) {
            current += 1;
        }
    }

    public void down() {
        if (current != start) {
            current -= 1;
        }
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

        Counter counter = (Counter) obj;
        if(start != counter.start){
            return false;
        }

        if(current != counter.current){
            return false;
        }

        if(limit != counter.limit){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        return 31 * start + 29 * limit + 17 * current;
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "start: " + start + ", current: " + current + ", limit: " + limit;
    }
}
