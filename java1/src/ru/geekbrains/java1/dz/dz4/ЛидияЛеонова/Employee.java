package ru.geekbrains.java1.dz.dz4.ЛидияЛеонова;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int age;
    private long salary;

    public Employee(String fio, String position, String email, String phone, int age, long salary) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fio + '\n' +
                "должность: " + position +
                ", e-mail: " + email +
                ", телефон: " + phone +
                ", возраст: " + age +
                ", зарплата: " + salary;
    }

    // остальные геттеры и сеттеры не создавались из-за специфики задания
    public int getAge() {
        return age;
    }
}



