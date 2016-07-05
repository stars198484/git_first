package ru.geekbrains.java1.dz.dz4.МаксимСараев;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Person[] personArrays = new Person[5];
        personArrays[0] = new Person("Sidorov Sidor", "Director", "sidorov.s@mail.ru", "89180000001", 90000, 45);
        personArrays[1] = new Person("Sidorova Mariya", "Gl.buch", "sidorova.m@mail.ru", "89180000003", 50000, 35);
        personArrays[2] = new Person("Ivanov Ivan", "Master", "ivanov.i@mail.ru", "89180000003", 45000, 50);
        personArrays[3] = new Person("Ivanova Mariya", "Kassir", "ivanova.m@mail.ru", "89180000004", 30000, 30);
        personArrays[4] = new Person("Petrov Petr", "Voditely", "petrov.p@mail.ru", "89180000005", 30000, 25);

        for (Person currPerson: personArrays
                ) {if (currPerson.getAge() > 40)
            System.out.println(currPerson);
        }
    }
}