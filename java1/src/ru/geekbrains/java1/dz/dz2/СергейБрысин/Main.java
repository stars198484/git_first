package ru.geekbrains.java1.dz.dz2.СергейБрысин;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        String arrString = Arrays.toString(arr); //убираем печать непонятного текста, переводом массива в текстовый формат
        System.out.println(arrString);


        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + i * 3;
        }
        System.out.println(Arrays.toString(arr2));


        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i<mas.length; i++){
            if (mas[i] <6){
                mas[i] = mas[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mas));


        Random rand = new Random();
        int rmas[] = new int[5];
        int min, max;
        min = max = rmas[0];
        for (int i = 0; i < 5; i++) {// заполняем массив случайными силами с 0 ячейки
            rmas[i] = rand.nextInt();
        }
        for (int i = 1; i < 5; i++) { // начинаем проверку со 1 ячейки, т.к. 0 ячейка уже записана в min и max
            if (rmas[i] < min) min = rmas[i];
            if (rmas[i] > max) max = rmas[i];
        }

        //вариант записи через 1 for, но при установке i = 1, случайное число не пишется в 0 ячеку, min и max = 0
         /*   for (int i = 0; i < 5; i++) {
            rmas[i] = rand.nextInt();
            if (rmas[i] < min) min = rmas[i];
            if (rmas[i] > max) max = rmas[i];
        } */

        System.out.println("Случайный массив: " + Arrays.toString(rmas));
        System.out.println("min = " + min + " ; " + "max = " +max);

    }


}