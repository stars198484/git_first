package ru.geekbrains.java2.dz.dz5.AlekseyNabor;

import java.util.Arrays;

/**
 * Created by AlekseyN on 22.06.2016.
 */
public class Main {

    private static final int arraySize = 10000000; // РАЗМЕР МАССИВА
    private static final int threadedArrayCount = 2; // НА СКОЛЬКО МАССИВОВ И ПОТОКОВ РАЗБИВАТЬ ОСНОВНОЙ МАССИВ
    private static float[] array = new float[arraySize];

    public static void main(String[] args) {


        for (int i=0;i<array.length;i++) {
            array[i] = 1;
        }

        //CountMyArray countMyArray = new CountMyArray(array); // ОДИН ПОТОК ЖЕЛЕЗНО
        //System.out.println("Non threaded count: "+(float)countMyArray.getTime()/1000+" secconds");

        // ОБРАБОТКА В ОДНОМ ПОТОКЕ ЧЕРЕЗ МУЛЬТИПОТОЧНЫЙ КЛАСС
        int t;
        ThreadedCountMyArray oneThreadCount = new ThreadedCountMyArray(array,t=1); // <--- 1 поток
        System.out.println(t+" threads: "+(float)oneThreadCount.getTime()/1000+" secconds");

        for (int i=0;i<array.length;i++) {
            array[i] = 1;
        }

        ThreadedCountMyArray threadedMyArray = new ThreadedCountMyArray(array,threadedArrayCount); // НЕСКОЛЬКО ПОТОКОВ
        System.out.println(threadedArrayCount+" threads: "+(float)threadedMyArray.getTime()/1000+" secconds");

    }
}
