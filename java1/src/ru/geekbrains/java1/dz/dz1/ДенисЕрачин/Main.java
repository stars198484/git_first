package ru.geekbrains.java1.dz.dz1.ДенисЕрачин;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
 /*public static void main(String[] args) {
        byte a = 10;
        int b = 1;
        long c = 654654l;
        float d = 10.5f;
        double e = 15.74d;
        boolean f = true;
        char g = 'A';
    }
     */



    /* private static int summ(int a, int b, int c, int d) {

         return a * (b + (c / d));//!
     }
     */


    /* public static void main(String[] args) {
        int a = 5, b = 14, c = a + b;
        if (c > 10 & c < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    */

    public static void main(String[] args) {
        int g = 200;
        if (g % 4 == 0) {
            if  ((g % 100 != 0) || (g % 400 == 0)) {
                System.out.println("високосный");
            }
        }

    }



}
