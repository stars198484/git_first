package ru.geekbrains.java1.dz.dz2.ЭдуардГригорян;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }

        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0, 1};

        // В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16
        // 19 22;В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;

        int[] arr1 = new int[8];
        arr1[0] = 1;

        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = arr1[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr1));

        // Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа
        // которые меньше 6 умножить на 2.

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mas));

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы;

        int[] mas1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = mas1[0];
        int min = mas1[0];
        for (int i = 1; i < mas1.length; i++) {
            if (max < mas1[i]) {
                max = mas1[i];
            }
            if (min > mas1[i]) {
                min = mas1[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // Написать простой консольный калькулятор. Пользователь вводит два числа и операцию
        // которую хочет выполнить, программа вычисляет результат и выводит в консоль;

        System.out.println("Доступные операции: / * - + cos sqrt abs log pow");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        double a = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите операцию ");
        String s = sc1.nextLine();

        double k;

        if ("*".equals(s)| "/".equals(s) | "+".equals(s) | "-".equals(s) | "pow".equals(s)) {

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите число ");
            double z = sc.nextDouble();

            switch (s) {
                case "*":
                    k = a * z;
                    System.out.println("Значение равно " + k);
                    break;
                case "/":
                    if (z == 0) {
                        System.out.println("Значение равно Ошибка. На ноль делить нельзя!");
                        break;
                    } else {
                        k = a / z;
                        System.out.println("Значение равно " + k);
                    }
                    break;
                case "+":
                    k = a + z;
                    System.out.println("Значение равно " + k);
                    break;
                case "-":
                    k = a - z;
                    System.out.println("Значение равно " + k);
                    break;
                case "pow":
                    k = Math.pow(a, z);
                    System.out.println("Значение равно " + k);
                    break;
                default:
                    System.out.println("Команда не распознана");
            }
        } else {
            switch (s) {
                case "log":
                    k = Math.log(a);
                    System.out.println("Значение равно " + k);
                    break;
                case "sqrt":
                    k = Math.sqrt(a);
                    System.out.println("Значение равно " + k);
                    break;
                case "abs":
                    k = Math.abs(a);
                    System.out.println("Значение равно " + k);
                    break;
                case "cos":
                    k = Math.cos(a);
                    System.out.println("Значение равно " + k);
                    break;
                default:
                    System.out.println("Команда не распознана");


            }


        }

    }
}
