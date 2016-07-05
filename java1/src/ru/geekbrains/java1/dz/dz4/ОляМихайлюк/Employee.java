package ru.geekbrains.java1.dz.dz4.ОляМихайлюк;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    String fio;
    String position;
    String email;
    float salary;
    int age;

    public Employee(String fio_, String position_, String email_, float salary_, int age_){
        fio = fio_;
        position = position_;
        email = email_;
        salary = salary_;
        age = age_;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}