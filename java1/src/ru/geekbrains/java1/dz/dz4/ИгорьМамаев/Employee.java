package ru.geekbrains.java1.dz.dz4.ИгорьМамаев;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    //ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee: " + fullName +
                ", position: " + position +
                ", email: " + email +
                ", phone: " + phone +
                ", salary: " + salary +
                ", age: " + age;
    }

    public int getAge() {
        return age;
    }
}