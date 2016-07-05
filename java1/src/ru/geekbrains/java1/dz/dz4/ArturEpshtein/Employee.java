package ru.geekbrains.java1.dz.dz4.ArturEpshtein;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private String fullname;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String fullname, String post, String email, int phone, int salary, int age) {
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "ФИО: '" + fullname + '\'' +
                ", Должность: '" + post + '\'' +
                ", email: '" + email + '\'' +
                ", Телефон: " + phone +
                ", Зарплата: " + salary +
                ", Возраст: " + age +
                '}';
    }
}

