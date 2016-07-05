//package ru.geekbrains.java1.dz.dz2.СтаниславОвчинников;
//
//import java.util.Scanner;
//
///**
// * Created by I_V_Zhukov on 10.05.2016.
// */
public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};   //инициализируем массив
//        for (int item : arr) {
//            System.out.print(item + " ");             //выводим на экран начальный массив
//        }
//        for (int i = 0; i < arr.length; i++) {        //проверка и замена нулей на еденицы
//            if (arr[i] == 1) {
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }
//        }
//        System.out.println(" ");
//        for (int item : arr) {
//            System.out.print(item + " ");             //выводим на экран измененный массив
//        }
//
//    }
//}
////3....................................................................................................
//public class Main2 {
//    public static void main(String[] args) {
//        int[] mas = new int[8];                     //резервируем под массив 8 ячеек памяти
//        for (int i=0, j=1; i<8; i++, j = j + 3) {
//            mas[i] = j;                             //генерируем нужные числа и заносим их в массив
//        }
//        for (int item : mas) {
//            System.out.print(item + " ");           //выводим на экран массив
//        }
//    }
//}
////4....................................................................................................
//public class Main3 {
//    public static void main(String[] args) {
//        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};   //инициализируем массив
//        for (int item : mas) {
//            System.out.print(item + " ");                    //выводим на экран первичный массив
//        }
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] < 6) {
//                mas[i] = mas[i] * 2;                     //проходим по массиву и умножаем на 2 числа меньше 6
//            }
//        }
//        System.out.println(" ");
//        for (int item : mas) {
//            System.out.print(item + " ");                    //выводим на экран полученный массив
//        }
//    }
//}
////5.....................................................................................................
//public class Main4 {
//    public static void main(String[] args) {
//        int[] mas = { 8, -5, 30, 6, 11, 4};                            //инициализируем массив
//        int max = mas[0];                                              //присваиваем первый элемент массива переменной
//        int min = mas[0];                                              //присваиваем первый элемент массива переменной
//        for (int i=0; i<mas.length;i++){                               //находим максимальное число массива
//            if (max<mas[i]& mas[i]>max){
//                max = mas[i];
//            }
//        }
//        System.out.println("max ="+ max);                              //выводим на экран максимальное число массива
//        for (int i=0; i<mas.length;i++){                               //находим минимальное число массива
//            if (min>mas[i]&mas[i]<min){
//                min = mas[i];
//            }
//        }
//        System.out.println("min ="+ min);                              //выводим на экран минимальное число массива
//
//    }
//}
////6......................................................................................................
//public class Main5 {
//    public static void main(String[] args) {
//        double s;                                                      //инициализируем переменную для ответа
//        Scanner sc = new Scanner(System.in);                           //создание сканера первого числа
//        System.out.println("Введите первое число");
//        double a = sc.nextDouble ();                                   //присвоение данных со сканера в переменную а
//        Scanner sc2 = new Scanner(System.in);                          //создание сканера действия
//        System.out.println("Введите действие. Допустимые /, *, +, -");
//        String c = sc2.next();                                         //присвоение данных со сканера в переменную с
//        Scanner sc3 = new Scanner(System.in);                          //создание сканера второго числа
//        System.out.println("Введите второе число");
//        double b = sc3.nextDouble ();                                  //присвоение данных со сканера в переменную d
//        switch (c){                                                    //проверка необходимого действия и вычисление ответа
//            case "/":
//                if (b==0){                                             //проверка деление на ноль
//                    System.out.println("Деление на ноль"); break;
//                }
//                s = a/b;
//                System.out.println(s);
//                break;
//            case "*":
//                s = a*b;
//                System.out.println(s);
//                break;
//            case "+":
//                s = a+b;
//                System.out.println(s);
//                break;
//            case "-":
//                s = a-b;
//                System.out.println(s);
//                break;
//            default:                                               //дефолтное состояние означает, что введено не допустимое действие
//                System.out.println("Не допустимое действие");
//        }
//    }
}
