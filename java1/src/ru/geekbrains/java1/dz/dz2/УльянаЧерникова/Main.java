package ru.geekbrains.java1.dz.dz2.УльянаЧерникова;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args)
            throws java.io.IOException {

        //Задание 1 и 2 Создание массива и замена 0 и 1
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.println(arr[i]);
        }
//Задание 3 Инициализация массива
        int[] arr2 = new int[8];
        arr2[0] = 1;

        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        for (int j = 0; j < arr2.length; j++)
            System.out.println(arr2[j]);
        //Задание №4 Элементы массива меньше 6 умножаются на 2 */
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] *= 2;
        }
        for (int item : mas)
            System.out.println(item);
        //Задание №5 Поиск максимального и минимального элементов массива
        int[] arr3 = {9, 8, 0, 1, -7};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < min) min = arr3[i];
            if (arr3[i] > max) max = arr3[i];
        }
        System.out.println("Минимальный элемент массива равен " + min + "\n" + "Максимальный элемент массива равен " + max);

        //Задание № 6 Калькулятор (Я пыталась сделать через методы, но никак у меня не получилось, пришлось пойти по более простому пути, хотя и не связанному с ООП).
        loop:
        for (; ; ) {
            System.out.println("Введите первое число ");
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            System.out.println("Введите второе число ");
            Scanner sc1 = new Scanner(System.in);
            double y = sc1.nextDouble();
            System.out.println("Введите математическую операцию");
            Scanner sc2 = new Scanner(System.in);
            String oper = sc2.nextLine();
            double res = 0;
            switch (oper) {
                case ("+"):
                    res = x + y;
                    break;
                case ("-"):
                    res = x - y;
                    break;
                case ("*"):
                    res = x * y;
                    break;
                case ("/"):
                    if (y != 0) res = x / y;
                    else System.out.println("На 0 делить нельзя!");
                    break;
                case ("%"):
                    res = x % y;
                    break;
                default:
                    System.out.println("Результат равен " + res);

            }
            System.out.println("Результат равен " + res);
            System.out.println("Введите 'q' для выхода из программы ");
            char choice = (char) System.in.read();
            if (choice == 'q') break;
            else continue loop;
        }
    }


}
