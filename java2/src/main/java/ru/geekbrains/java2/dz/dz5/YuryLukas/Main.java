package ru.geekbrains.java2.dz.dz5.YuryLukas;

/**
 * Created by yurok on 23.06.16.
 */
public class Main {
private static final int SIZE = 10000000;
private static final int H = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        float[] a1=new float[H], a2 = new float[H];

        long a = System.currentTimeMillis();
        for(int i=0; i<SIZE; i++){
            arr[i] = 1;
        }

        System.out.println(System.currentTimeMillis() - a);
        System.out.println("----------------------------------------");

        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);

        long b = System.currentTimeMillis();

        MyTread tread1 = new MyTread();
        tread1.createArray(a1);
        MyTread tread2 = new MyTread();
        tread2.createArray(a2);

        tread1.start();
        tread2.start();

        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H,H);
        System.out.println(System.currentTimeMillis() - b);
    }

}
