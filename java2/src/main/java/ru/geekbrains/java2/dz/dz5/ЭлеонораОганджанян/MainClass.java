package ru.geekbrains.java2.dz.dz5.ЭлеонораОганджанян;

import java.util.Arrays;

/**
 * Created by М.видео 60 on 21.06.2016.
 */
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        boolean activeMethod = false; // переключатель методов
        final int SIZE = 10;
        final int H = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] a1 = new float[H];
        float[] a2 = new float[H];
        CalcSecondPart calcSecondPart = new CalcSecondPart();
        Thread thread = new Thread(calcSecondPart);

        // заполнение массива единицами
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        if (activeMethod) {
            // первый метод
            long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Время просчета массива по первому методу: " + (System.currentTimeMillis() - a));
        } else {
            // второй метод
            long b = System.currentTimeMillis();
            System.arraycopy(arr, 0, a1, 0, H);
            System.arraycopy(arr, H, a2, 0, H);

            calcSecondPart.setSize(H);
            calcSecondPart.setArr(a2);
            thread.start();

            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a2 = calcSecondPart.getArr();

            System.arraycopy(a1, 0, arr, 0, H);
            System.arraycopy(a2, 0, arr, H, H);

            System.out.println("Время просчета массива по второму методу: " + (System.currentTimeMillis() - b));
        }
    }
}