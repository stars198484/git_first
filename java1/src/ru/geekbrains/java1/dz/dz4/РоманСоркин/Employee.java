package ru.geekbrains.java1.dz.dz4.РоманСоркин;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int cash;
    private int age;

    public Employee(String name, String position, String email, String phone, int cash, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cash=" + cash +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

}