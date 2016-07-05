package ru.geekbrains.java1.lesson5;

/**
 * Created by Home-pc on 16.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//Employee[] employees = new Employee[2];
//       employees[0] = new Manager("Незнайка Артур Болбесович", "Менеджер", "Менеджер@email.com", 371248543, 14000, 33, 10000);
//       employees[1] = new Boss("Незнайка Артур Болбесович", "Менеджер", "Менеджер@email.com", 371248543, 14000, 33);
//
//        for (Employee employee : employees) {
//            employee.work();
//        }

//-128  .. 127
        Integer a = new Integer(127);
        Integer b = new Integer(127);
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
