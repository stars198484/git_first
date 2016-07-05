package ru.geekbrains.java1.dz.dz4.АндрейС;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Persons per = new Persons("Fedya Petrov", "Director", "123@123.com", 791612345, 150000, 45);

        //System.out.println(per);

        Persons [] arrPersons = new Persons[5]; //Создаём массив
        arrPersons[0] = new Persons("ASD", "QWE", "12@12.com", 123456789, 123456, 28);
        arrPersons[1] = new Persons("QAZ", "XSW", "145@12.com", 123456789, 123456, 47);
        arrPersons[2] = new Persons("QWS", "ZXC", "1122@12.com", 123456789, 123456, 39);
        arrPersons[3] = new Persons("TGF", "CSF", "187@12.com", 123456789, 123456, 58);
        arrPersons[4] = new Persons("QHT", "TFC", "756@12.com", 123456789, 123456, 75);


        for (int i = 0; i < 5; i++) {//цикл для массива
            if (arrPersons[i].age>40) {//условие по отбору возраста в массиве
                System.out.println(arrPersons[i]);
            }
        }
    }

}

