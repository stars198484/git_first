package ru.geekbrains.java1.dz.dz4.ЭдуардГригорян;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    String FIO;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String _FIO, String _position, String _email, String _phone, int _salary, int _age) {
        FIO = _FIO;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    Employee() {
        FIO = "Jhon Jhonson";
        position = "Chief officer";
        email = "jhon.jhonson@mail.ru";
        phone = "89154801018";
        salary = 120000;
        age = 37;
    }

}