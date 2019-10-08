package com.yuditsky.unit3.classes_and_objects.task5.entity;

import java.util.ArrayList;

public class TradingFloor {
    private ArrayList<Customer> customers;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public TradingFloor() {
        customers = new ArrayList<>();
    }

    public TradingFloor(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public TradingFloor(Customer customer) {
        this();
        customers.add(customer);
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

        TradingFloor tradingFloor = (TradingFloor) obj;
        if(customers == null){
            return customers == tradingFloor.customers;
        } else{
            if(!customers.equals(tradingFloor.customers)){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        return (customers == null) ? 0 : customers.hashCode();
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "customers: " + customers;
    }
}
