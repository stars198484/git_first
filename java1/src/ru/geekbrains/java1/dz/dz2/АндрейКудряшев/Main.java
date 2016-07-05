package ru.geekbrains.java1.dz.dz2.АндрейКудряшев;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
// Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(arr));

        // В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0

        // Вариант 1

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Вариант 2 - не работает???

        for (int item : arr) {
            if (item == 0) {
                item = 1;
            } else {
                item = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22

        int[] arr2 = new int[8];
        arr2[0] = 1;
        for (int j = 1; j < 8; j++)
            arr2[j] = arr2[j - 1] + 3;
        System.out.println(Arrays.toString(arr2));

        // Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        // пройти по нему циклом, и числа которые меньше 6 умножить на 2

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int h = 0; h < 12; h++)
            if (arr3[h] < 6) {
                arr3[h] = arr3[h] * 2;
            }
        System.out.println(Arrays.toString(arr3));

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] arr4 = {3, 5, 7, 9, 75, 64, 32, 23, 1, 45, 67, 88, 54, 34, 55};
        System.out.println(Arrays.toString(arr4));
        int max = arr4[0], min = arr4[0];
        for (int k = 1; k < arr4.length; k++) {
            if (arr4[k] < min) {min = arr4[k];
                continue;}
            if (arr4[k] > max) max = arr4[k];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        // Написать простой консольный калькулятор.
        // Пользователь вводит два числа и операцию которую хочет выполнить, программа вычисляет результат и выводит в консоль

        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Строчный калькулятор для простых чисел");
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите операцию (доступны +, -, *, /):");
        String operation = scanner.next();
        switch (operation){
            case "+":
                result = a + b;
                System.out.println("Результат сложения: " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Результат вычитания: " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Результат умножения: " + result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Ошибка: Деление на 0!");
                }
                else {
                    result = a / b;
                    System.out.println("Результат деления: " + result);
                }
                break;
            default:
                System.out.println("Введены недопустимые оперции или числа");
        }
    }
}
