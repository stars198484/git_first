package ru.geekbrains.java1.dz.dz4.ЮрийНиконоров;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    long salary;
    int age;


    public Employee() {
        this.age = 18;
    }

    public Employee(String fullName) {
        this.fullName = fullName;
    }

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    public Employee(String fullName, String position, String email) {
        this(fullName, position);
        this.email = email;
    }

    public Employee(String fullName, String position, String email, String phone) {
        this(fullName, position, email);
        this.phone = phone;
    }

    public Employee(String fullName, String position, String email, String phone, long salary) {
        this(fullName, position, email, phone);
        this.salary = salary;
    }

    public Employee(String fullName, String position, String email, String phone, long salary, int age) {
        this(fullName, position, email, phone, salary);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
