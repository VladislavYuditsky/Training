//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

package com.yuditsky.unit3.classes_and_objects.task5.entity;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditCard;
    private int bankAccount;
    private static int counter = 1;

    public Customer(String surname, String name, String patronymic, String address, int creditCard, int bankAccount) {
        this();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public Customer() {
        id = counter++;
        surname = "noname";
        name = "noname";
        patronymic = "noname";
        address = "without a specific residence";
    }

    public Customer(String surname, String name, String patronymic) {
        this();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Customer(int creditCard) {
        this();
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "id: " + id + "; surname " + surname + "; name " + name + "; patronymic " + patronymic + "; " +
                "\naddress " + address + "; credit card " + creditCard + "; bank account " + bankAccount + ";";
    }
}