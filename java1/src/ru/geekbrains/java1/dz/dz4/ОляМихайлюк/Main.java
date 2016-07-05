package ru.geekbrains.java1.dz.dz4.ОляМихайлюк;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] emps = new Employee[5];
        emps[0] = new Employee("Ivanov Ivan Ivanych", "director1", "email1@email.com", 300000, 40);
        emps[1] = new Employee("Ivanov Ivan Ivanych", "director2", "email2@email.com", 200000, 45);
        emps[2] = new Employee("Ivanov Ivan Ivanych", "director3", "email3@email.com", 100000, 30);
        emps[3] = new Employee("Ivanov Ivan Ivanych", "director4", "email4@email.com", 50000, 25);
        emps[4] = new Employee("Ivanov Ivan Ivanych", "director5", "email5@email.com", 20000, 20);

        for (int i=0; i<emps.length; i++) {
            if (emps[i].age >40){
                System.out.println(emps[i]);
            }
        }
    }

}
