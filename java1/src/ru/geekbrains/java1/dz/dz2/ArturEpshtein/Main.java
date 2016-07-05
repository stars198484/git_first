package ru.geekbrains.java1.dz.dz2.ArturEpshtein;
//
//import java.util.Scanner;
//
///**
// * Created by I_V_Zhukov on 10.05.2016.
// */
public class Main {
//    public static void main(String[] args) {
//        int[] mas = {0,1,1,0,1,0,1,0,1,1,0};
//        System.out.println(mas.length);
//    }
//}
//**●В массиве из предыдущего пункта, с помощью цикла заменить 0 на 1, 1 на 0;
//        package ArturEpshtein.HomeWorks.HomeWork2.Home2;
//        import java.util.Arrays;
///**
// * Created by ArturEpshtein on 12/05/2016.
// */
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = {0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0};
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] == 0) {
//                mas[i] = 1;
//            } else {
//                mas[i] = 0;
//            }
//        }
//        for (int item : mas) {
//            System.out.println("item: " + item);
//        }
//    }
//}
//**● Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16
//        19 22;
//        package ArturEpshtein.HomeWorks.HomeWork2.Home3;
//
///**
// * Created by ArturEpshtein on 12/05/2016.
// */
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = new int[8];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = i * 3 + 1;
//        }
//        for (int item : mas) {
//            System.out.println("item: " + item);
//        }
//    }
//}
//**● Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа
//        которые меньше 6 умножить на 2.
//        package ArturEpshtein.HomeWorks.HomeWork2.Home4;
///**
// * Created by ArturEpshtein on 12/05/2016.
// */
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = {1,5,3,2,11,4,5,2,4,8,9,1};
//        for (int i = 0; i < mas.length; i++) {
//            if(mas[i]< 6){
//                mas[i] *= 2;
//            }
//        }
//        for (int item : mas) {
//            System.out.println("item: " + item);
//        }
//    }
//}
//**● * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
//        package ArturEpshtein.HomeWorks.HomeWork2.Home5;
///**
// * Created by ArturEpshtein on 12/05/2016.
// */
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = {1,5,3,2,11,4,5,2,4,8,9,1};
//        int max = 0;
//        int min = 100;
//        for (int i = 0; i < mas.length; i++) {
//            if(mas[i] > max){
//                max = mas[i];
//            }
//            if(mas[i] < min){
//                min = mas[i];
//            }
//        }
//        for (int item : mas) {
//            System.out.println("item: " + item);
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }
//}
//**● ** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию
//        которую хочет выполнить, программа вычисляет результат и выводит в консоль;
//
//        package ArturEpshtein.HomeWorks.HomeWork2.Home6;
//        import java.util.Scanner;
///**
// * Created by ArturEpshtein on 12/05/2016.
// */
//public class Calculator {
//    public static void main(String[] args) {
//        System.out.println("enter number a:");
//        Scanner num1 = new Scanner(System.in);
//        int a = num1.nextInt();
//        System.out.println("enter number b:");
//        Scanner num2 = new Scanner(System.in);
//        int b = num2.nextInt();
//        System.out.println("enter +,-,/,*:");
//        //System.out.println("a= " + a);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        if("+".equals(s)) {
//            System.out.println("Answer = " + (a + b));
//        }
//        if("-".equals(s)) {
//            System.out.println("Answer = " + (a - b));
//        }
//        if("/".equals(s)) {
//            if (b != 0) {
//                System.out.println("Answer = " + (a / b));
//            } else {
//                System.out.println("на 0 делить нельзя");
//            }
//        }
//        if("*".equals(s)) {
//            System.out.println("Answer = " + (a * b));
//        }
//    }
}
