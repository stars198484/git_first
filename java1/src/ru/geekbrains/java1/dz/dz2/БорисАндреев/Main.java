package ru.geekbrains.java1.dz.dz2.БорисАндреев;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) arr[i]=1;
            else arr[i]=0;
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        int [] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=i*3+1;
            System.out.print(arr2[i]+", ");
        }
        System.out.println();
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6) arr3[i]=arr3[i]*2;
            System.out.print(arr3[i]+", ");

        }
        System.out.println();
        int[] arr4 = { 30, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max= arr4[0], min = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] < min) min = arr4[i];
            if (arr4[i] > max) max = arr4[i];
            System.out.print(arr4[i] + ", ");
        }
        System.out.println();
        System.out.println("minimalniy element = "+ min);
        System.out.println("maximalniy element = "+ max);

        Scanner sc = new Scanner(System.in);
        System.out.println("vvedi deistvie");
        String c = sc.nextLine();
        System.out.println("vvedi 4islo 1");
        float a = sc.nextFloat();
        System.out.println("vvedi 4islo 2");
        float b = sc.nextFloat();


        float rez=1.5f;
        switch (c) {
            case "*":
                rez=a*b;
                System.out.println(a+" "+c+" "+b+" = "+ rez);
                break;
            case "/":
                if (b!=0) {rez=a/b; System.out.println(a+" "+c+" "+b+" = "+ rez);}
                else System.out.println("nelzya delit na 0");
                break;
            case "+":
                rez=a+b;
                System.out.println(a+" "+c+" "+b+" = "+ rez);
                break;
            case "-":
                rez=a-b;
                System.out.println(a+" "+c+" "+b+" = "+ rez);
                break;

        }
    }
}
