package ru.geekbrains.java2.dz.dz6.AlekseyNabor.temp.test3;

/**
 * Created by AlekseyN on 22.06.2016.
 */
public class Main {
    static int count;
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println("=="+count);
    }

    private static int fib(int i) {
        count++;
        if (i<=1) return i;
        return fib(i-1)+fib(i-2);
    }
}
