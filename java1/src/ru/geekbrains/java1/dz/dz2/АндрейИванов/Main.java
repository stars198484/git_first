package ru.geekbrains.java1.dz.dz2.АндрейИванов;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        /* Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
          В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0; */
        int[] arr = {0, 1, 1 ,0, 1, 0, 0, 0 ,1};
        for (int a : arr) {
            System.out.print(a+ " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }

        // Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
        System.out.println();
        int[] arr1 = new int[8];
        for (int i = 0 , j = 1; i < arr1.length; i++) {
            arr1[i] = j;
            j += 3;
            System.out.print(arr1[i]+ " ");
        }

        //Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа которые меньше 6 умножить на 2.
        System.out.println();
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < 6)
                mas[i] *= 2;
            System.out.print(mas[i] + " ");
        }

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        System.out.println();
        int[] mas1 = { 11, 22, 33, 44, -1, 21, 77, 122, 99, 111 };
        int min , max;
        min = mas1[0];
        max = mas1[0];

        for (int j = 1; j < mas1.length; j++) {
            if(mas1[j] < min)
                min = mas1[j];
            else if (mas1[j] > max)
                max = mas1[j];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        //  Написать простой консольный калькулятор. Пользователь вводит два числа и операцию которую хочет выполнить, программа вычисляет результат и выводит в консоль;
        int a, b;
        String operation;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Консольный калькулятор версии 1.0-----");

        while(true) {
            System.out.println("Введите первое целое число:");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                break;
            }
            else {
                System.out.println("Вы ввели неверное число");
                sc = new Scanner(System.in);
            }
        }
        while(true) {
            System.out.println("Введите второе целое число:");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                break;
            }
            else {
                System.out.println("Вы ввели неверное число");
                sc = new Scanner(System.in);
            }
        }
        while(true) {
            sc = new Scanner(System.in);
            System.out.println("Введите операцию:\n'+' - сложение;\n'-' - вычитание;\n'*' - умножение;\n'/' - деление;\n'%' - остаток от деления.");
            operation = sc.nextLine();
            if (operation.equals("+")) {
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            }
            else if (operation.equals("-")) {
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            }
            else if (operation.equals("*")) {
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            }
            else if (operation.equals("/")) {
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                } else
                    System.out.println(a + " / " + b + " = " + (a / b));
                break;
            }
            else if (operation.equals("%")) {
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                } else
                    System.out.println(a + " % " + b + " = " + (a % b));
                break;
            }
            else {
                System.out.println("Вы ввели неверную операцию!");
            }
        }

    }
}
