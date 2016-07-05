package ru.geekbrains.java1.dz.dz4.ЮрийНиконоров;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        Employee emp1 = new Employee();

        // Конструктор класса должен заполнять эти поля при создании объекта;
        Employee emp2 = new Employee("Иванов Иван Иванович", "Менеджер", "manager@vrs.com", "8-900-000-11-22", 12000, 18);

        // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
        System.out.println(emp1);
        System.out.println(emp2);

        emp2.age = 32;

        System.out.println(emp2);
        Employee emp3 = new Employee("Петрович");
        System.out.println(emp3);

        // Создать массив из 5 сотрудников
        System.out.println("Массив из 5 сотрудников:");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivanov@mailbox.com", "892312312", 30000, 30);
        System.out.println(employees[0]);
        employees[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312312", 30000, 26);
        System.out.println(employees[1]);
        employees[2] = new Employee("Prohorova Anna", "Office manager", "prohorova@mailbox.com", "892312312", 20000, 22);
        System.out.println(employees[2]);
        employees[3] = new Employee("Dzagoev Artur", "Buisness trener", "dzagoev@mailbox.com", "892312312", 25000, 41);
        System.out.println(employees[3]);
        employees[4] = new Employee("Popandopalos", "Manager", "popandopalos@mailbox.com", "892312312", 35000, 28);
        System.out.println(employees[4]);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        System.out.println("Cотрудники старше 40 лет:");
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].age >= 40) System.out.println(employees[i]);
        }

    }

}