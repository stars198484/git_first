package ru.geekbrains.java1.dz.dz2.ЭлеонораОганджанян;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Задания 1 и 2
        System.out.println("Задание 1");
        byte[] arr = {0, 0, 1, 1, 1, 0, 1, 0, 0, 0};
        for (int i: arr) {
            System.out.print(i + " ");
        }
        Arrays.toString(arr);
        System.out.println();

        System.out.println("Задание 2");
        for (int i: arr) {
            if(i == 0) i = 1;
            else if(i == 1) i = 0;
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int[] arr1 = new int[8];
//        arr1[0] = 1;
        System.out.print(arr1[0] + " ");
        for (int i = 0, j=1; i < arr1.length; i++, j+= 3) {
            arr1[i] = j;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i: arr2) {
            if (i < 6) i *= 2;
            System.out.print(i + " ");
        }
//        Arrays.toString(Arrays.stream(arr2).
//                filter(item -> item<6).
//                map(item -> item*2).
//                toArray());

        System.out.println("!!!!");

        // Задание 5
        System.out.println("Задание 5");
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr2.length; i++){
            if (i == 0){
                min = arr2[i];
                max = arr2[i];
            } else {
                if (min > arr2[i]) min = arr2[i];
                if (max < arr2[i]) max = arr2[i];
            }
        }
//        System.out.println(Arrays.stream(arr2).max().getAsInt());
//        System.out.println(Arrays.stream(arr2).min().getAsInt());
        System.out.println(min + " " + max);

        // Задание 6
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        float a = scanner.nextFloat();

        System.out.println("Введите операцию (+, -, *, /):");
        String c = scanner.next();

        System.out.println("Введите число:");
        float b = scanner.nextFloat();

        double ans = 0;
        switch (c) {
            case "+": ans = a + b; System.out.println(ans); break;
            case "-": ans = a - b; System.out.println(ans); break;
            case "*": ans = a * b; System.out.println(ans); break;
            case "/":
                if (b != 0) ans = a / b;
                else System.out.println("На ноль делить нельзя!");
                break;
            default:
                System.out.println("Такой операции не существует!");
        }
    }
}