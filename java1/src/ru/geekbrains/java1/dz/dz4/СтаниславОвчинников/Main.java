package ru.geekbrains.java1.dz.dz4.СтаниславОвчинников;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee c = new Employee("Иванов Иван", "Директор", "ivanov_ivan@mail.ru", "89197000729", 100000, 45);
        Employee c1 = new Employee("Петрова Мария", "Бугалтер", "mari_petrova@mail.ru", "89197000730", 50000, 40);
        Employee c2 = new Employee("Сидорова Екатерина", "Продавец", "katya_sidorova@mail.ru", "89197000745", 30000, 31);
        Employee c3 = new Employee("Петрова Светлана", "Продавец", "sveta_petrova@mail.ru", "89197000749", 30000, 27);
        Employee c4 = new Employee("Путина Елена", "Уборщица", "elena_putina@mail.ru", "89197000751", 10000, 60);

        c.printPerson();c1.printPerson();c2.printPerson();c3.printPerson();c4.printPerson();


        Employee[] persArrey = new Employee[5];
        persArrey[0] = c;
        persArrey[1] = c1;
        persArrey[2] = c2;
        persArrey[3] = c3;
        persArrey[4] = c4;

        for (int i = 0; i < persArrey.length ; i++) {
            if (persArrey[i].getAge()>=40) {
                System.out.println(persArrey[i]);
            }
        }
    }

}