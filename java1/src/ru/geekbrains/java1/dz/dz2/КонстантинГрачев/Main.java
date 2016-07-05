package ru.geekbrains.java1.dz.dz2.КонстантинГрачев;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /** создаем массив и заменяем 1на 0 и обратно
         *
         */
        int[] mas = {1, 0, 1, 1, 0, 0, 0, 0};
        int i = 0;
        for (int item : mas) {
            if (item == 0) mas[i] = 1;
            else mas[i] = 0;
            System.out.println("item " + i + "=" + mas[i]);
            i++;
        }
/** создаем массив из 8 целых чисел и заполняем значениями
 *
 */
        System.out.println("создаем массив из 8 целых чисел и заполняем значениями: ");
        int[] mas1 = new int[8];
        mas1[0] = 1;
        for(int ii=0; ii<8;ii++) {
            mas1[ii] = ii * 3+1;
            System.out.println("item= " + ii + "="+ mas1[ii]);
        }

        /** если числов массиве меньше 6 то умножаем его на2
         *
         */
        System.out.println("если число в массиве меньше 6 то умножаем его на2: ");
        int[] mas2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i1 = 0;
        for (int item2 : mas2) {
            if (item2 < 6) mas2[i1] = item2 * 2;
            System.out.println("item" + i1 + "=" + mas2[i1]);
            i1++;

        }

        /** минимальное и максимальные значения в массиве - НЕ СМОГ РАЗОБРАТЬСЯ ПИШЕТ ОШИБКУ
         *
         */
//        System.out.println("минимальное и максимальные значения в массиве: ");
//        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        int max = 0;
//        int min=0;
//
//        for (int count = 0; i < 12; count++) {
//
//            if (mas3[max] < mas3[count]) {
//                max = count;
//            }
//
//            if (mas3[min] > mas3[count]) {
//                min = count;
//            }
//        }
//        System.out.println("max=" + mas3[max] + "min=" +mas3[min]);


/** консольный калькулятор
 *
 */
        int res = 0;
        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        System.out.println("Введите знак операции:");
        String op = sc.next();
        sc.close();
        switch(op)
        {
            case "+": res = n1 + n2;
                break;
            case "-": res = n1 - n2;
                break;
            case "*": res = n1 * n2;
                break;
            case "/": res = n1 / n2;
                break;
        }
        System.out.println(res);



    }



}




