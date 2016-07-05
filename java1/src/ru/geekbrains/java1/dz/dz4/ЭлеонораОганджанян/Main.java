package ru.geekbrains.java1.dz.dz4.ЭлеонораОганджанян;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int AGE = 40; //возраст, старше которого производится отбор
    private static Employee[] EmployeesArr = new Employee[5]; // массив сотрудников

    private static void fillEmployeesArr() {
        // заполнение массива сотрудников
        EmployeesArr[0] = new Employee("Шумина Алла Николаевна", "Глав. бух.", "sh@m.ru", "123-23-34", 75000, 52);
        EmployeesArr[1] = new Employee("Кузина Софья Игоревна", "Бух.", "k@m.ru", "234-34-45", 40000, 41);
        EmployeesArr[2] = new Employee("Мороз Галина Викторовна", "Бух.", "m@m.ru", "345-45-56", 38000, 35);
        EmployeesArr[3] = new Employee("Попова Мария Андреевна", "Зам. главбуха", "456-56-67", "p@m.ru", 57000, 46);
        EmployeesArr[4] = new Employee("Яшкина Анна Владимировна", "Помощник бух.", "567-67-78", "678-78-89", 27000, 24);

        // вывод массива сотрудников в консоль
        for (Employee i : EmployeesArr) {
            i.printEmployee(i);
        }

        System.out.println();
        return;
    }

    // вывод инфорации о сотрудниках старше ... лет в консоль
    private static void EmployeesOlder() {
        int j = 0;
        for (int i = 0; i < EmployeesArr.length; i++) {
            if (EmployeesArr[i].getAgeOlder(AGE)) {
                EmployeesArr[i].printEmployee(EmployeesArr[i]);
                j++;
            }
        }
        if (j == 0) System.out.println("Не найдено ни одного сотрудника старше " + AGE + " лет.");
        return;
    }

    public static void main(String[] args) {
        fillEmployeesArr();

        System.out.println("Сотрудники старше " + AGE + " лет:");
        EmployeesOlder();
    }
}