package ru.geekbrains.java1.dz.dz4.НатальяТанина;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i=0;

        Employee firstPeson = new Employee();
        System.out.println(firstPeson.toString());

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Николай Сергеевич", " инженер", "ivanov@mail.ru", "+79012223344", 50000, 28);
        empArray[1] = new Employee("Федоров Евгений Викторович", "тестеровшик", "fedorov@yandex.ru", "+79012225544", 28000, 22);
        empArray[2] = new Employee("Калинина Елена Анатольевна", "бухгалтер", "kalinina@mail.ru", "+79012223366", 33000, 42);
        empArray[3] = new Employee("Афанасьева Екатерина Игоревна", "менеджер", "afanasieva@mail.ru", "+79017773344", 37000, 31);
        empArray[4] = new Employee("Соколова Виктория Константиновна", "менеджер", "sokolova@yandex.ru", "+79012223388", 39000, 43);

        for (i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge()>40) {
                System.out.println(empArray[i].toString());

            }
        }

    }
}