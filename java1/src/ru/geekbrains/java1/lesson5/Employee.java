package ru.geekbrains.java1.lesson5;

/**
 * Created by Home-pc on 19.05.2016.
 */
public abstract class Employee extends Object{
    private final static int NOMER_1 = 10;
    private String fullname;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee() {
    }

    abstract void work();

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
        super();
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age= age;
    }

    @Override
    public String toString() {
        return                 "ФИО: '" + fullname + '\'' +
                ", Должность: '" + post + '\'' +
                ", email: '" + email + '\'' +
                ", Телефон: " + phone +
                ", Зарплата: " + salary +
                ", Возраст: " + age;
    }
}

