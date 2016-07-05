package ru.geekbrains.java1.dz.dz2.АлександрРублевский;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Сalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Choose operation:");
        String operation = sc.next();
        sc.close();

        switch (operation) {
            case "+":
                System.out.println(met1(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(met2(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(met3(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(met4(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Wrong operation please try again.");
        }
    }

    public static int met1(int a, int b) {
        return a + b;
    }

    public static int met2(int a, int b) {
        return a - b;
    }

    public static double met3(double a, double b) {
        return a * b;
    }

    public static double met4(double a, double b) {
        return a / b;
    }
}
