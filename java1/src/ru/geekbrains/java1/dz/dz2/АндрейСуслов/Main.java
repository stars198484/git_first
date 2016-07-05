package ru.geekbrains.java1.dz.dz2.АндрейСуслов;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        int[] arr1 = new int[8];
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            ;
        }

        System.out.println(Arrays.toString(arr));
        int j = 1;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = j;
            j += 3;
        }

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
            ;
        }
        System.out.println(Arrays.toString(mas));

        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
            ;
            if (min > mas[i]) {
                min = mas[i];
            }
            ;
        }
        ;
        System.out.println("Максимум = "+ max +" Минимум = " + min);

        System.out.println("Введите выражение для вычисления в формате [число1] [пробел] [действие] [пробел] [число2]");
        int a = sc.nextInt();
        String d = sc.next();
        int b = sc.nextInt();
        System.out.print(a +" " +d+" " + b);

        switch (d) {
            case "+": System.out.println(" = " + (a + b)); break;
            case "-": System.out.println(" = " +(a - b)); break;
            case "*": System.out.println(" = " +(a * b)); break;
            case "/": if(b != 0) { System.out.println(" = " +(a / b));} else {
                System.out.println(" Делить на 0 нельзя");
            }  break;
            default:
                System.out.println(" Вы ввели выражени в невернои формате");
        }
    }
}
