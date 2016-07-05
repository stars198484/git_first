package ru.geekbrains.java1.dz.dz4.ПавелМатвеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    //    public class MainClass {
    public static void main(String[] args) {
        Employee[] EmployeeArr = new Employee[5];
        EmployeeArr[0] = new Employee("Иванов Иван Иванович", "Директор", "director@test.ru", "+7 (000) 000-00-00", 150000, 45);
        EmployeeArr[1] = new Employee("Петров Петр Петрович", "Разнорабочий", "", "+7 (000) 000-00-01", 35000, 37);
        EmployeeArr[2] = new Employee("Максимов Виталий Генадьевич", "Руководитель отдела продаж", "marketing@test.ru", "+7 (000) 000-00-00", 90000, 27);
        EmployeeArr[3] = new Employee("Продавцов Продавец Продавесович", "Продавец", "u1@test.ru", "+7 (000) 000-00-00", 60000, 47);
        EmployeeArr[4] = new Employee("Купилов Купи Купилович", "Продавец", "u2@test.ru", "+7 (000) 000-00-00", 600000, 35);

        for (Employee i : EmployeeArr) {
            if (i.getAge() > 40) {
                System.out.println(i);
            }

        }
    }
}
