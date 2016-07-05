package ru.geekbrains.java1.dz.dz2.ИгорьМамаев;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1}; //Задание 1
        System.out.println("Задание 1: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) { //Задание 2
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Задание 2: " + Arrays.toString(arr));

        int[] arr2 = new int[8]; //Задание 3
        for (int i = 0, j = 1; i < arr2.length; i++, j += 3) {
            arr2[i] = j;
        }
        System.out.println("Задание 3: " + Arrays.toString(arr2));

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Задание 4
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] *= 2;
        }
        System.out.println("Задание 4: " + Arrays.toString(mas));

        int[] arr3 = {1, 5, 3, 2, 11, 24, 5, 2, 4, 8, 9, 1, -4, 18, 28, -100, -5}; //Задание 5
        int max = arr3[1], min = arr3[1];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < min) min = arr3[i];
            if (arr3[i] > max) max = arr3[i];
        }
        System.out.println("Задание 5. Min: " + min + " Max: " + max);
        System.out.println();
        calc();
    }

    static void calc() { // Задание 6
        System.out.println("Калькулятор.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число.");
        double a = scanner.nextDouble();
        System.out.println("Введите знак операции. Доступно: +, -, *, /");
        String operation = scanner.next();
        System.out.println("Введите второе число.");
        double b = scanner.nextDouble();

        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.println(a + operation + b + "=" + result);
                break;
            case "-":
                result = a - b;
                System.out.println(a + operation + b + "=" + result);
                break;
            case "*":
                result = a * b;
                System.out.println(a + operation + b + "=" + result);
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + operation + b + "=" + result);
                } else System.out.println("Делить на 0 нельзя!");
                break;
            default:
                System.out.println("Неверно введен знак операции!");
                break;
        }
    }
}
