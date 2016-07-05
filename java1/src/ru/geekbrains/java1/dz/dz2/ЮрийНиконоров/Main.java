package ru.geekbrains.java1.dz.dz2.ЮрийНиконоров;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
//    public static void main(String args[]) {
////        Создать массив состоящий из элементов 0 и 1, например int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1};
//
////        В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;
//        System.out.println("В массиве, с помощью цикла заменить 0 на 1, 1 на 0");
//        System.out.println("Первый способ, решение по теме 2-го урока");
//        for (int i = 0; i < arr.length; i++) {
//            switch (arr[i]) {
//                case 1:
//                    arr[i] = 0;
//                    break;
//                case 0:
//                    arr[i] = 1;
//                    break;
//            }
//            System.out.println(arr [ + i + ]= + arr[i]);
//        }

//        второй способ через If
//        System.out.println(Второй способ через if);
//        for (int i = 0; i  arr.length; i++) {
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else arr[i] = 0;
//            System.out.println(arr [ + i + ]= + arr[i]);
//        }
//
//        Создать массив из 8 целых чисел.
//        С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
//        System.out.println(С помощью цикла заполнить массив);
//        int[] arr2 = new int[8];
//        for (int i = 0; i  8; i++) {
//            arr2[i] = 1 + i  3;
//            System.out.println(arr2 [ + i + ]= + arr2[i]);
//        }

//        Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        пройти по нему циклом, и числакоторые меньше 6 умножить на 2.
//        System.out.println(Задать массив int[] mas, пройти по нему циклом, и числакоторые меньше 6 умножить на 2 );
//        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i  mas.length; i++) {
//            if (mas[i]  6) {
//                mas[i] = 2;
//            }
//            System.out.println(mas [ + i + ]= + mas[i]);
//        }
//        Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        System.out.println( Задать одномерный массив и найти в нем минимальный и максимальный элементы);
//        int[] mas2 = {2, 0, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 15, -67};
//        int minMas2, maxMas2;
//        minMas2 = maxMas2 = mas2[0];
//        for (int i = 1; i  mas2.length; i++) {
//            if (minMas2  mas2[i]) minMas2 = mas2[i];
//            if (maxMas2  mas2[i]) maxMas2 = mas2[i];
//        }
//        System.out.println(Минимальное значение массива  + minMas2);
//        System.out.println(Максимальное значение массива  + maxMas2);
//
//        Написать простой консольный калькулятор.
//        Пользователь вводит два числа и операцию которую хочет выполнить,
//                программа вычисляет результат и выводит в консоль;
//        System.out.println( Написать простой консольный калькулятор);
//
//        получаем входные значения и вид операции
//        Scanner inputMetod = new Scanner(System.in);
//        System.out.print(Введите первое число);
//        double fValue = inputMetod.nextDouble();
//        System.out.print(Введите второе число);
//        double sValue = inputMetod.nextDouble();
//        System.out.print(Введите символ операции (+,-,,,%));
//        String stOpType = inputMetod.next();
//        char chOpType = stOpType.charAt(0);
//        double rezultat = 0.00d;
//        switch (chOpType) {
//            case '+'
//                System.out.println(fValue +  +  + sValue +  =  + (fValue + sValue));
//                break;
//            case '-'
//                System.out.println(fValue +  -  + sValue +  =  + (fValue - sValue));
//                break;
//            case ''
//                System.out.println(fValue +    + sValue +  =  + (fValue  sValue));
//                break;
//        case '':
//                if (sValue != 0) {
//                    System.out.println(fValue +    + sValue +  =  + (fValue  sValue));
//                } else {
//                    System.out.println(Операция не доступна, т.к. делить на ноль нельзя!);
//                }
//                break;
//            case '%'
//                if (sValue != 0) {
//                    System.out.println(Остаток от деления  + fValue +  на  + sValue +  будет  + (fValue % sValue));
//                } else {
//                    System.out.println(Операция не доступна, т.к. делить на ноль нельзя!);
//                }
//                break;
//            default
//                System.out.println(Операция не определена);
//        }
//    }


}