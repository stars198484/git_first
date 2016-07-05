package ru.geekbrains.java1.dz.dz2.ИльяФиалковский;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    static int[] mas1 = {1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,1};
    static int[] mas2 = new int[8];
    static int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    public static void main(String[] args){

        for(int i=0;i<mas1.length;i++){
            System.out.print(mas1[i]+" ");
        }
        System.out.println();

        for(int i=0;i<mas1.length;i++){
            if(mas1[i]==0) mas1[i]=1;
            else mas1[i]=0;
            System.out.print(mas1[i]+" ");
        }
        System.out.println();

        int x=1;
        for(int i=0;i<mas2.length;i++){
            mas2[i]=x;
            x+=3;
            System.out.print(mas2[i]+" ");
        }
        System.out.println();

        for(int i=0;i<mas3.length;i++){
            System.out.print(mas3[i]);
            if (mas3[i]<6){
                mas3[i]*=2;
                System.out.print(">>"+mas3[i]);
            }
            System.out.print(" ");
        }
        System.out.println();

        //Для удобства перебираем массив 3
        int y = mas3[0],z = mas3[0];
        for(int i=1;i<mas3.length;i++){
            if (y>mas3[i]){
                y=mas3[i];
            }
            if (z<mas3[i]){
                z=mas3[i];
            }
        }
        System.out.println("min="+y+", max="+z);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = sc.nextInt();
        System.out.println("Введите знак ( + , - , * , / ):");
        String b = sc.next();
        System.out.println("Введите второе целое число:");
        int c = sc.nextInt();
        if(b.equals("/")&&c==0) System.out.println("На 0 делить нельзя!");
        else {
            switch(b){
                case "+":
                    System.out.println(a+"+"+c+"="+(a+c));
                    break;
                case "-":
                    System.out.println(a+"-"+c+"="+(a-c));
                    break;
                case "*":
                    System.out.println(a+"*"+c+"="+(a*c));
                    break;
                case "/":
                    System.out.println(a+"/"+c+"="+(a/c));
                    break;
                default:
                    System.out.println("Что-то пошло не так...");
            }
        }

    }

}
