package ru.geekbrains.java1.dz.dz4.СтаниславЗемляков;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Person {
    static String FIO;
    static String RANK;
    static String MAIL;
    static String PHONE;
    static String SALARY;
    static int AGE;

    public String getPerson() {
        String s = FIO + " | " + RANK + " | " + MAIL + " | " + PHONE + " | "+ SALARY+ " | "+ AGE;
        return s;

    }

    public Person(String FIO, String RANK, String MAIL, String PHONE, String SALARY, int AGE) {
        this.FIO = FIO;
        this.RANK = RANK;
        this.MAIL = MAIL;
        this.PHONE = PHONE;
        this.SALARY = SALARY;
        this.AGE = AGE;
    }
}


