package ru.geekbrains.java1.lesson5;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Manager extends Employee {

    public Manager() {
    }

    private int bonus;

    @Override
    final void work() {
        System.out.println("Manager work");
    }

    public int getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus: " + bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String fullname, String post, String email, int phone, int salary, int age, int bonus) {
        super(fullname, post, email, phone, salary, age);
        this.bonus = bonus;
    }
}
