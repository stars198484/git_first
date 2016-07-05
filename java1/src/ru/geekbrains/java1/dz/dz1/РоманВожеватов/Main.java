package ru.geekbrains.java1.dz.dz1.РоманВожеватов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {
//задание 2
        /*byte a = 10;
        short b = 5000;
        int c = 500000;
        long d = 20000L;

        float e = 200.5f;
        double f = 40.55d;

        boolean g = true;
        boolean h = false;

        char j = 'J';
        */

/*задание 3

        float i = expression(2.5f, 1, 10, 5f);
        System.out.println(i);
    }

    public static float expression(float a, int b, int c, float d) {
        return (a * (b + (c / d)));//!
    }*/

        //задание 4
        /*int a = 10;
        int b = 3;*/
        /*int i = summ(7, 3);
        System.out.println(i);
        if (i >= 10 & i <= 20) {
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

    public static int summ(int a, int b) {
        return a + b;
    }*/

        // задание 5
        int year = 2016;
        System.out.println(year);
        if ((year % 4 != 0 || year % 400 != 0) && year % 100 == 0) {
            System.out.println("Обычный");
        } else {
            System.out.println("Високосный");
        }


    }
}
