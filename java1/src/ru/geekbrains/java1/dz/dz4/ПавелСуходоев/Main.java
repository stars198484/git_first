package ru.geekbrains.java1.dz.dz4.ПавелСуходоев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] Employee = new Employee[5];
        Employee[0] = new Employee("Ivanov Ivan", "programmer", "ivan@ivanov.ru", "12345677545", 20000, 25);
        Employee[1] = new Employee("Petrov Ivan", "programmer", "ivan@petrov.ru", "1234567555", 30000, 55);
        Employee[2] = new Employee("Sidorov Ivan", "programmer", "ivan@sidorov.ru", "123456753", 35000, 41);
        Employee[3] = new Employee("Sokolov Ivan", "programmer", "ivan@sokolov.ru", "123456732", 25000, 34);
        Employee[4] = new Employee("Isupov Ivan", "programmer", "ivan@isupov.ru", "123456712", 20000, 28);

        for (Employee person:
                Employee) {
            if (person.age >= 40) {
                System.out.println(person.toString());
            }
        }
    }
}
