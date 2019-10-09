package com.yuditsky.unit3.classes_and_objects.task5.logic;

import com.yuditsky.unit3.classes_and_objects.task5.entity.Customer;
import com.yuditsky.unit3.classes_and_objects.task5.entity.TradingFloor;

import java.util.ArrayList;
import java.util.Comparator;

public class TradingFloorLogic {

    public static ArrayList<Customer> listOfCustomers(TradingFloor tradingFloor, int from, int to) {
        return pickOut(tradingFloor, from, to);
    }

    private static ArrayList<Customer> pickOut(TradingFloor tradingFloor, int from, int to) {
        ArrayList<Customer> resList = new ArrayList<>();
        for (Customer customer : tradingFloor.getCustomers()) {
            if (customer.getCreditCard() >= from && customer.getCreditCard() <= to) {
                resList.add(customer);
            }
        }
        return resList;
    }

    public static ArrayList<Customer> listOfCustomers(TradingFloor tradingFloor) {
        return sortAlphabetically(tradingFloor);
    }

    private static ArrayList<Customer> sortAlphabetically(TradingFloor tradingFloor) {
        ArrayList<Customer> customers = new ArrayList<>(tradingFloor.getCustomers());
        customers.sort(Comparator.comparing(Customer::getSurname).
                thenComparing(Customer::getName).thenComparing(Customer::getPatronymic));
        return customers;
    }
}
