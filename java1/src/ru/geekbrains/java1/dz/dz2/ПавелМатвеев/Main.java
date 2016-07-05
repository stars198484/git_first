package ru.geekbrains.java1.dz.dz2.ПавелМатвеев;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    private static int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    private static int[] minMaxArr = {1, 4, 6, 0, -1321, 423423};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Запускаем калькулятор?");
        int check = sc.nextInt();

        if (check == 1) {
            calculate();
        } else {
            System.out.println(Arrays.toString(coup(array, 1, 0)));
            System.out.println(Arrays.toString(incr(8, 3)));
            System.out.println(Arrays.toString(masReplace(mas)));
            minMax(minMaxArr);
        }


    }

    private static void calculate() {
        long res = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число");
            long a = sc.nextInt();
            System.out.println("Введите второе число");
            long b = sc.nextInt();
            System.out.println("Введите тип операции");
            String c = sc.next();

            if (c.equals("+")) {
                res = a + b;
            } else if (c.equals("-")) {
                res = a - b;
            } else if (c.equals("/")) {
                if (b == 0) {
                    System.out.println("На 0 делить нельзя!");
                    continue;
                } else {
                    res = a / b;
                }

            } else if (c.equals("*")) {
                res = a * b;
            } else if (c.equals("%")) {
                res = a % b;
            }


            System.out.println("Результат: " + res);
            System.out.println("Еще?");
            int reply = sc.nextInt();
            if (reply != 1) {
                break;
            }
        }

    }

    private static void minMax(int[] array) {
        int min = array[0], max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }


    /**
     * @param array массив для заполнения
     * @return измененный массив
     */
    private static int[] masReplace(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    /**
     * @param length длинна массива
     * @param factor число на которое будет произзводится инкремент
     * @return измененный массив
     */
    private static int[] incr(int length, int factor) {
        int[] array = new int[length];
        array[0] = 1;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] + factor;
        }
        return array;
    }

    /**
     * @param array масив для замены
     * @param a     первое значение
     * @param b     второе значение
     * @return измененный масссив
     */
    private static int[] coup(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                array[i] = b;
            } else if (array[i] == b) {
                array[i] = a;
            }
        }
        return array;
    }









    /*
    * Интересно было написать метод для замены данных в массиве
    * */

    /**
     * @param array   массив для замены
     * @param find    значение для поиска
     * @param replace значение для замены
     * @return исправленный массив
     */
    private static int[] replace(int[] array, int find, int replace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                array[i] = replace;
            }
        }
        return array;
    }
}
