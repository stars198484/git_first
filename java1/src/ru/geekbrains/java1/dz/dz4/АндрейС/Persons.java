package ru.geekbrains.java1.dz.dz4.АндрейС;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Persons {
    String fio;
    String function;
    String mail;
    long phone;
    long pay;
    int age;

    public Persons(String fio, String function, String mail, long phone, long pay, int age) { //создаём конструктор со всеми значениями, которые мы указали для класса
        this.fio = fio;
        this.function = function;
        this.mail = mail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    @Override
    public String toString() { //выводим инфо об объекте
        return "Persons{" +
                "fio='" + fio + '\'' +
                ", function='" + function + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                ", pay=" + pay +
                ", age=" + age +
                '}';
    }
}


