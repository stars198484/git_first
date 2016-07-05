package ru.geekbrains.java1.dz.dz4.РоманСоркин;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] office = new Employee[5];
        office[0] = new Employee("Анатолий", "менеджер", "anat@mail.ru", "+79211232314", 25000, 30);
        office[1] = new Employee("Василий", "директор", "vas_@mail.ru", "+79211233414", 75000, 56);
        office[2] = new Employee("Дмитрий", "завхоз", "dim@mail.ru", "+79219872314", 54000, 41);
        office[3] = new Employee("Анна", "секретарь", "annasekret@mail.ru", "+79211865714", 35000, 21);
        office[4] = new Employee("Валентин", "менеджер", "val@mail.ru", "+79114567314", 25000, 40);

        for (Employee i: office) {
            if (i.getAge()>=40) {
                System.out.println(i);
            }
        }
    }
}

