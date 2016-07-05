package ru.geekbrains.java1.dz.dz4.АлександрАнатольевичСмирнов;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private String fullName; // ФИО
    private String position; // Должность
    private String eMail; // Адрес электронной почты
    private String phoneNumber; // Номер телефона +7(9ХХ)ХХХ-ХХ-ХХ или ХХХ-ХХ-ХХ (ххх)
    private int salary; // Целая часть оклада
    private byte age; // Полных лет

    public Employee() {
        this.fullName = "<Не заполнено>";
        this.position = "<Не заполнено>";
        this.eMail = "<Не заполнено>";
        this.phoneNumber = "<Не заполнено>";
        this.salary = 9000; // Мин. ЗП
        this.age = 18; // Мин. возраст
    } // Employee()

    public Employee(String fullName) {
        this();
        this.fullName = fullName;
    } // Employee(name)

    public Employee(String fullName, String position, String eMail, String phoneNumber, int salary, byte age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    } // Employee(all)

    @Override
    public String toString() {
        return "{" +
                "ФИО: " + fullName +
                ", должность: " + position +
                ", eMail: " + eMail +
                ", тел.: " + phoneNumber +
                ", оклад: " + salary +
                ", возраст: " + age +
                "}";
    } // toString()

    public boolean isSuitableForAge(byte min, byte max){
        if (this.age >= min & this.age <= max) return true;
        return false;
    } // isSuitableForAge ()

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public byte getAge() {
        return age;
    }
}
