package ru.geekbrains.java2.dz.dz5.ИльяФиалковский;
/**
 * Created by Demo on 21.06.2016.
 */
public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static volatile float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) {
        long a = timeNow();
        long b = timeNow();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("Этап 1. Массив заполнен за (мс): "+timeEs(a));
        long c = timeNow();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Этап 1. Пересчет массива выполнен за (мс): "+timeEs(c));
        System.out.println("Этап 1. Всего программа выполнялась (мс): "+timeEs(b));
        a = timeNow();
        b = timeNow();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("\nЭтап 2. Массив заполнен за (мс): "+timeEs(a));
        c = timeNow();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println("Этап 2. Разделение массива завершено за (мс)"+timeEs(c));
        Thread2 t = new Thread2();
        Thread t2 = new Thread(t);
        t2.start();
        c = timeNow();
        System.out.println("Этап 2. Пересчет массива в потоке 1 запущен");
        for (int i = 0; i < h; i++) {
            a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Этап 2. Пересчет массива в потоке 1 выполнен за (мс): "+timeEs(c));
        c = timeNow();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h ,h);
        System.out.println("Этап 2. Склеивание массива завершено за (мс)"+timeEs(c));
        System.out.println("Этап 2. Всего программа выполнялась (мс): "+timeEs(b));
        System.out.println("Этап 2. Проверка: первый элемент массива: "+arr[0]+" .. Последний элемент массива: "+arr[size-1]);
    }

    public static long timeNow(){
        return System.currentTimeMillis();
    }

    public static long timeEs(long a){
        return System.currentTimeMillis()-a;
    }
}

 class Thread2 implements Runnable{
    public void run(){
        synchronized (this) {
            long a = Main.timeNow();
            System.out.println("Этап 2. Пересчет массива в потоке 2 запущен");
            for (int i = 0; i < Main.h; i++) {
                Main.a1[i] = (float) (Main.a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Этап 2. Пересчет массива в потоке 2 выполнен за (мс): " + Main.timeEs(a));
        }
    }
}