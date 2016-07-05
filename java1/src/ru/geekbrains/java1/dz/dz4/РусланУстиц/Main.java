package ru.geekbrains.java1.dz.dz4.РусланУстиц;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static int EMPLOYEE_COUNT = 5;

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_COUNT];
        employees[0] = new Employee();
        employees[1] = new Employee("Ivan", "Ivanovich", "Ivanov", 20);
        employees[2] = new Employee("Petr", "Petrovich", "Petrov", 41);
        employees[3] = new Employee("Semen", "Semenovich", "Semenov", 45, Employee.positionList.chiefSpecialist, "semen@company.ru", "+7(495)000-00-00", 100000);
        employees[4] = new Employee("Nikita", "Nikitovich", "Nikitov", 22, Employee.positionList.trainee, "nikita@company.ru", "+7(495)000-00-01", 30000);

        employees[2].setPosition(Employee.positionList.CEO);

        Employee.printOlderThan(40);
    }
}