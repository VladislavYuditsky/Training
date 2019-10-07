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
import com.yuditsky.unit3.classes_and_objects.task5.logic.CustomerBase;

public class Main {
    public static void main(String[] args) {
        CustomerBase customerBase = new CustomerBase(new Customer());

        customerBase.add(new Customer());
        customerBase.add(new Customer("Ivanov", "Ivan", "Ivanich"));
        customerBase.add(new Customer("Petrov", "Petr", "Petrovich",
                "Minsk, ul.Gikalo, d.9", 12345, 777));
        customerBase.add(new Customer(12346));
        customerBase.add(new Customer(12344));

        for (Customer customer : customerBase.getCustomers()) {
            System.out.println(customer.toString());
            System.out.println();
        }

        System.out.println("\n\nCustomer list in alphabetical order\n");
        for (Customer customer : customerBase.getListOfCustomers()) {
            System.out.println(customer);
            System.out.println();
        }


        System.out.println("\n\nList of customers whose credit card number is in the specified interval");
        int from = 12345;
        int to = 12355;
        System.out.println("from " + from + " to " + to);
        System.out.println();
        for (Customer customer : customerBase.getListOfCustomers(from, to)) {
            System.out.println(customer);
            System.out.println();
        }
    }
}
