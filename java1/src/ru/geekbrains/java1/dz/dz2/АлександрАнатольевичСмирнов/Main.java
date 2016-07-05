package ru.geekbrains.java1.dz.dz2.АлександрАнатольевичСмирнов;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("=== Задание 1 ===");
        int[] arr1 = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(arr1));

        // Task 2
        System.out.println("=== Задание 2 ===");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];
        } // for
        System.out.println(Arrays.toString(arr1));

        // Task 3
        System.out.println("=== Задание 3 ===");
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            switch (i) {
                case 0:
                    arr2[i] = 1;
                    break;
                case 1:
                    arr2[i] = 4;
                    break;
                case 2:
                    arr2[i] = 7;
                    break;
                case 3:
                    arr2[i] = 10;
                    break;
                case 4:
                    arr2[i] = 13;
                    break;
                case 5:
                    arr2[i] = 16;
                    break;
                case 6:
                    arr2[i] = 19;
                    break;
                case 7:
                    arr2[i] = 22;
                    break;
            } // switch
        } // for
        System.out.println(Arrays.toString(arr2));

        // Task 4
        System.out.println("=== Задание 4 ===");
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        } // for
        System.out.println(Arrays.toString(mas));

        // Task 5
        System.out.println("=== Задание 5 ===");
        int[] arr3 = {37, -95, 94, 17, -75, -72, 34, -89, -8, -5, 66, 63, -18, -19, 97, 83};
        System.out.println(Arrays.toString(arr3));
        int max = 0, min = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i == 0) {
                max = arr3[i];
                min = arr3[i];
            } // if
            if (max < arr3[i]) max = arr3[i];
            if (min > arr3[i]) min = arr3[i];
        } // for
        System.out.println("Min = " + min + ", max = " + max);


        // Task 6
        System.out.println("=== Задание 6 ===");

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        float a = scanner.nextFloat();
        System.out.println("введите второе число");
        float b = scanner.nextFloat();
        System.out.println("введите знак действия");
        String s = scanner.next();
        float result = 0;
        switch (s) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } // if
                else {
                    System.out.println("Err Деление на 0!");
                }
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Err Данное действие не реализовано. Ждите и устанавливайте обновления!");
        } // switch

        System.out.println("" + a + " " + s + " " + b + " = " + result);

    } // public static void main()
} // public class Main
