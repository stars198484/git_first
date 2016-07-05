package ru.geekbrains.java2.dz.dz5.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 22.06.2016.
 */
public class Main {

    private static final int size = 10000000;
    private static final int h = size / 2;
    public static float[] arr = new float[size];

    public static void main(String[] args) {
        simpleMethod();
        threadMethod();
    }

    public static void simpleMethod(){
        arrayInit();

        long a = System.currentTimeMillis();

        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Первый метод обработка цикла: " + (System.currentTimeMillis() - a) + " мс.");
    }

    public static void threadMethod(){
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        arrayInit();

        long a = System.currentTimeMillis();
          System.arraycopy(arr, 0, arr1, 0, h);
          System.arraycopy(arr, h, arr2, 0, h);

        System.out.println("Разбивка массива на два: " + (System.currentTimeMillis() - a) + " мс.");

        long thread1time = System.currentTimeMillis();
        long thread2time = System.currentTimeMillis();

        ArrThread thread1 = new ArrThread(arr1);
        ArrThread thread2 = new ArrThread(arr2);
        thread1.start();
        thread2.start();

        try {
            thread1.join(); //ждем завершения потока 1
            thread2.join(); //ждем завершения потока 2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(!thread1.isAlive()) { arr1 = thread1.getArr(); } //если поток закончил работу, возвращаем массив
        if(!thread2.isAlive()) { arr2 = thread2.getArr(); }

        System.out.println("Обработка первого массива в потоке 1: "  + (System.currentTimeMillis() - thread1time) + " мс.");
        System.out.println("Обработка второго массива в потоке 2: "  + (System.currentTimeMillis() - thread2time) + " мс.");

        a = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Склейка массивов: " + (System.currentTimeMillis() - a) + " мс.");

    }

    public static void arrayInit(){
        for(int i = 0; i < arr.length;i++){
            arr[i] = 1;
        }
    }

}
