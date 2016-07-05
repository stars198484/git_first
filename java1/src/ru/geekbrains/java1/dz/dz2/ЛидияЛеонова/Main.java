package ru.geekbrains.java1.dz.dz2.ЛидияЛеонова;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        arrays();
        findMinAndMaxInArray();
        calculator();
    }

    private static void arrays() {
        System.out.println("Создание массивов в коде");

        // Создать массив из элементов 0 и 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArr(arr1, "Исходный массив1   ");


        // В массиве с помощью цикла заменить 0 на 1, 1 на 0
        for (int i = 0; i < arr1.length; i++) {
            if (0 == arr1[i]) {
                arr1[i] = 1;
            } else if (1 == arr1[i]) {
                arr1[i] = 0;
            }
        }
        printArr(arr1, "Опрокинутый массив1");


        // Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22
        int[] arr2 = new int[8];
        for (int i = 0, j = 1; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        printArr(arr2, "Массив2, заполненный в цикле");


        // Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        // пройти по нему циклом, и числа, которые меньше 6, умножить на 2
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr(mas, "Массив mas до умножения на 2   ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] *= 2;
            }
        }
        printArr(mas, "Массив mas после умножения на 2");
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */
    private static void findMinAndMaxInArray() {
        System.out.println('\n');
        System.out.println("Создание массива из консоли");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте желаемую размерность массива (целое положительное число)");
        int arrLenth = scanner.nextInt();
        float[] arr = new float[arrLenth];
        System.out.println("Задайте элементы массива (" + arrLenth + " шт)");
        for (int i = 0; i < arrLenth; i++) {
            arr[i] = scanner.nextFloat(); // TODO задать маску ввода, проверять формат введенных данных или отлавливать InputMismatchException
        }

        float min = arr[0];
        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);
    }

    private static void calculator() {
        System.out.println('\n');
        System.out.println("КАЛЬКУЛЯТОР");

        System.out.println("Посчитаем? (введите y для ввода данных или любой другой символ - для завершения работы)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while ("y".equals(s)) {
            System.out.println("Задайте первый операнд");
            float op1 = scanner.nextFloat();
            System.out.println("Задайте второй операнд");
            float op2 = scanner.nextFloat();
            char operation;
            do {
                System.out.println("Задайте бинарную операцию (+, -, *, /, %) или введите q для выхода");
                operation = scanner.next().charAt(0);
            }
            while (operation != '+' & operation != '-' & operation != '*' & operation != '/' & operation != '%' & operation != 'q');

            if ('q' == operation)
                return;

            calculation(op1, op2, operation);

            System.out.println("Посчитаем еще? (введите y для ввода данных, любой другой символ - для завершения работы)");
            s = scanner.next();
        }
    }

    private static void calculation(float op1, float op2, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Результат вычислений: " + (op1 + op2));
                break;
            case '-':
                System.out.println("Результат вычислений: " + (op1 - op2));
                break;
            case '*':
                System.out.println("Результат вычислений: " + (op1 * op2));
                break;
            case '/': {
                if (op2 == 0) {
                    System.out.println("Попытка деления на ноль - ошибка! (ну или \u221E)");
                } else {
                    System.out.println("Результат вычислений: " + (op1 / op2));
                }
                break;
            }
            case '%':
                if (op2 == 0) {
                    System.out.println("Попытка деления на ноль - ошибка! (ну или \u221E)");
                } else {
                    System.out.println("Результат вычислений: " + (op1 % op2));
                }
                break;
            default:
                System.out.println("Недопустимый тип операции");
                break;
        }
    }


    private static void printArr(int[] arr, String arrName) {
        System.out.println("");
        System.out.print(arrName + " = [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}