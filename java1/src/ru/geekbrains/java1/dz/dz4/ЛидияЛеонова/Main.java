package ru.geekbrains.java1.dz.dz4.ЛидияЛеонова;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Сотрудники, чей возраст превышает 40 лет:");

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Пушкин Александр Сергеевич", "Генеральный директор", "a.s.pushkin@company.com",
                "+78121230001", 30, 100000);
        employees[1] = new Employee("Лермонтов Михаил Юрьевич", "Главный бухгалтер", "m.u.lermontov@company.com",
                "+78121230002", 28, 90000);
        employees[2] = new Employee("Николай Алексеевич Некрасов", "Главный инженер", "n.a.nekrasov@company.com",
                "+78121230003", 42, 90000);
        employees[3] = new Employee("Сергей Александрович Есенин", "Главный дизайнер", "s.e.esenin@company.com",
                "+78121230004", 31, 80000);
        employees[4] = new Employee("Даниил Иванович Хармс", "Руководитель по связям с общественностью", "d.i.harms@company.com",
                "+78121230005", 43, 70000);

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("" + (++counter) + " " + employees[i]);
            }
        }


    }

}
