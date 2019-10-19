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
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Customer customer = (Customer) obj;
        if (id != customer.id) {
            return false;
        }

        if (surname == null) {
            return surname == customer.surname;
        } else {
            if (!surname.equals(customer.surname)) {
                return false;
            }
        }

        if (name == null) {
            return name == customer.name;
        } else {
            if (!name.equals(customer.name)) {
                return false;
            }
        }

        if (patronymic == null) {
            return patronymic == customer.patronymic;
        } else {
            if (!patronymic.equals(customer.patronymic)) {
                return false;
            }
        }

        if (address == null) {
            return address == customer.address;
        } else {
            if (!address.equals(customer.address)) {
                return false;
            }
        }

        if (creditCard != customer.creditCard) {
            return false;
        }

        if (bankAccount != customer.bankAccount) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 31 * id + ((surname == null) ? 0 : surname.hashCode()) + ((name == null) ? 0 : name.hashCode() +
                ((patronymic == null) ? 0 : patronymic.hashCode()) + ((address == null) ? 0 : address.hashCode()) +
                29 * creditCard + 17 * bankAccount);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "id: " + id + ", surname: " + surname + ", name: " +
                name + ", patronymics: " + patronymic + ", address: " + address + ", credit card: " +
                creditCard + ", bank account: " + bankAccount;
    }
}