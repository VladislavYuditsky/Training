// Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package com.yuditsky.unit3.classes_and_objects.task5;

import com.yuditsky.unit3.classes_and_objects.task5.entity.Customer;
import com.yuditsky.unit3.classes_and_objects.task5.entity.TradingFloor;
import com.yuditsky.unit3.classes_and_objects.task5.logic.TradingFloorLogic;

public class Main {
    public static void main(String[] args) {
        TradingFloor tradingFloor = new TradingFloor(new Customer());

        tradingFloor.getCustomers().add(new Customer());
        tradingFloor.getCustomers().add(new Customer("Ivanov", "Ivan", "Ivanich"));
        tradingFloor.getCustomers().add(new Customer("Petrov", "Petr", "Petrovich",
                "Minsk, ul.Gikalo, d.9", 12345, 777));
        tradingFloor.getCustomers().add(new Customer(12346));
        tradingFloor.getCustomers().add(new Customer(12344));

        for (Customer customer : tradingFloor.getCustomers()) {
            System.out.println("Id: " + customer.getId() + ", surname: " + customer.getSurname() + ", name: "
                    + customer.getName() + ", patronymics: " + customer.getPatronymic() + ",\naddress: "
                    + customer.getAddress() + ", credit card: " + customer.getCreditCard() + ", bank account: "
                    + customer.getBankAccount());
        }

        System.out.println("\nCustomer list in alphabetical order:");
        for (Customer customer : TradingFloorLogic.listOfCustomers(tradingFloor)) {
            System.out.println("Id: " + customer.getId() + ", surname: " + customer.getSurname() + ", name: "
                    + customer.getName() + ", patronymics: " + customer.getPatronymic() + ",\naddress: "
                    + customer.getAddress() + ", credit card: " + customer.getCreditCard() + ", bank account: "
                    + customer.getBankAccount());
        }


        System.out.println("\nList of customers whose credit card number is in the specified interval:");
        int from = 12345;
        int to = 12355;
        System.out.println("from " + from + " to " + to);
        for (Customer customer : TradingFloorLogic.listOfCustomers(tradingFloor, from, to)) {
            System.out.println("Id: " + customer.getId() + ", surname: " + customer.getSurname() + ", name: "
                    + customer.getName() + ", patronymics: " + customer.getPatronymic() + ",\naddress: "
                    + customer.getAddress() + ", credit card: " + customer.getCreditCard() + ", bank account: "
                    + customer.getBankAccount());
        }
    }
}
