package ru.geekbrains.java1.lesson1;

/**
 * Created by Home-pc on 05.05.2016.
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
//        int n = 0;
//        if (10 < n  || n >3) {
//            System.out.println("true");
//         } else {
//            System.out.println("false");
//        }
//
//        System.out.println("Hello? World");
//        int i = add(20, 30);
//        System.out.println(i);

        pasRecord(1);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    static void pasRecord(int i) {
        float f = 10;
        if (i < 10) {
            int b = 10;
            System.out.println(b);
            System.out.println(i);
            System.out.println(f);
        }
        boolean b = true;
        System.out.println(b);
        System.out.println("go");


    }
}
