package ru.geekbrains.java1.lesson5;

/**
 * Created by Home-pc on 19.05.2016.
 */
public final class Boss extends Employee {


    @Override
    void work() {
        System.out.println("Boss work");
    }

    public Boss(String fullname, String post, String email, int phone, int salary, int age) {
        super(fullname, post, email, phone, salary, age);

    }

    public void metod(){
        getFullname();
    }

}
