package ru.geekbrains.java1.dz.dz2.ОляМихайлюк;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    // Р—Р°РґР°РЅРёРµ 1-2
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0};
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = arr[i]+1;
            }
            else {
                arr[i] = arr[i]-1;
            }
            System.out.print(arr[i] + " ");
        }

// Р—Р°РґР°РЅРёРµ 3

        System.out.println("\n");
        int [] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                arr2[i] = 1;
            }
            else {
                arr2[i] = arr2[i-1] + 3;
            }
            System.out.print(arr2[i] + " ");
        }

// Р—Р°РґР°РЅРёРµ 4

        System.out.println("\n");
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i]*2;
            }
            System.out.print(mas[i] + " ");
        }

// Р—Р°РґР°РЅРёРµ 5

        System.out.println("\n");
        int[] arr3 = new int[55];

        for (int i = 0; i<arr3.length; i++) {
            arr3[i] = i;
            //System.out.print(arr3[i] + " ");

        }
        System.out.print("\n");

        int min = arr3[0];
        int max = arr3[0];

        for (int i = 1; i<arr3.length; i++) {
            if (arr3[i]<min ) {
                min = arr3[i];
            }
            if (arr3[i]>max) {
                max = arr3[i];
            }
        }
        System.out.println("min = " + min + "; max = " + max);

// Р—Р°РґР°РЅРёРµ 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numeric");
        float a = scanner.nextFloat();
        System.out.println("Enter second numeric");
        float b = scanner.nextFloat();
        System.out.println("Enter one of the 4 main math operations");
        String op = scanner.next();
        switch (op){
            case "+":
                System.out.println("Get result: " + (a + b));
                break;
            case "-":
                System.out.println("Get result: " + (a - b));
                break;
            case "*":
                System.out.println("Get result: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Should not divide by zero");
                    break;
                }
                System.out.println("Get result: " + (a / b));
                break;
            default:
                System.out.println("Sorry, Don't understand what to do");
        }



    }


}