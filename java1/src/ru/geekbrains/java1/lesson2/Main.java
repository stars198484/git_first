package ru.geekbrains.java1.lesson2;

import java.util.Scanner;

/**
 * Created by Home-pc on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//        int n = 3;
//        for (int i = 0, j = 10; i < j; i++, j--) {
//            if (i == 1) continue;
//            System.out.println(i + " "+ j);
//            if (i == 2) break;
//
//        }

//        int i = 0;
//        while (i < 3) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("re");
//        do {
//            System.out.println(i);
//        } while (i <0);

//        String u = "9";
//        switch (u){
//            case "q":
//                System.out.println("q");
//                break;
//            case "r":
//                System.out.println("r");
//                break;
//            case "5":
//                System.out.println("5");
//                break;
//                default:
//                    System.out.println(u);
//                    System.out.println("tytr");
//        }

//        int[] arr = new int[5];
//        arr[0] = 10;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("i= " + arr[i]);
//        }
//
//        int[] mas = {1,2,3,4};
//        for (int item : mas) {
//            System.out.println("item= " + item);
//        }

//        int[][] mas2 = new int[2][3];
//        System.out.println(Arrays.deepToString(mas2));
//
//        for (int[] i : mas2){
//            for (int j :i){
//                System.out.println(j);
//            }
//        }


        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите целое число");
//        int a = scanner.nextInt();
//        System.out.println("a= "+ a);

        System.out.println("введите строку");
        String s = scanner.nextLine();
       if ("1234".equals(s)) {
           System.out.println(s);
       }

    }

}
