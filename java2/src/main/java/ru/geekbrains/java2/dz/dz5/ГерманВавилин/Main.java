package ru.geekbrains.java2.dz.dz5.ГерманВавилин;

/**
 * Created by gta5 on 22.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        ThreadTester tester = new ThreadTester();
        tester.singleThreadCalculation(); //Считаем в 1 поток
        tester.multithreadCalculation(); //Считаем в 2 потока
    }

}
