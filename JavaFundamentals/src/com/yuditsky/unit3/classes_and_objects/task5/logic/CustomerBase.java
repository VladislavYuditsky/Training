package com.yuditsky.unit3.classes_and_objects.task5.logic;

import com.yuditsky.unit3.classes_and_objects.task5.entity.Customer;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerBase {
    private ArrayList<Customer> customers;

    public CustomerBase() {
        customers = new ArrayList<>();
    }

    public CustomerBase(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public CustomerBase(Customer customer) {
        this();
        customers.add(customer);
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void remove(int index) {
        customers.remove(index);
    }

    public void remove(Customer customer) {
        customers.remove(customer);
    }

    public void clear() {
        customers.clear();
    }

    public ArrayList<Customer> getListOfCustomers(int from, int to) {
        return pickOut(from, to);
    }

    private ArrayList<Customer> pickOut(int from, int to) {
        ArrayList<Customer> resList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCreditCard() >= from && customer.getCreditCard() <= to) {
                resList.add(customer);
            }
        }
        return resList;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return sortAlphabetically();
    }

    public ArrayList<Customer> sortAlphabetically() {
        ArrayList<Customer> customers = new ArrayList<>(this.customers);
        customers.sort(Comparator.comparing(Customer::getSurname).
                thenComparing(Customer::getName).thenComparing(Customer::getPatronymic));
        return customers;
    }


    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
