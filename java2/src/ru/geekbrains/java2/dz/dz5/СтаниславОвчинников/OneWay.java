package ru.geekbrains.java2.dz.dz5.СтаниславОвчинников;

/**
 * Created by Stars on 21.06.2016.
 */
class OneWay {
    OneWay() {
        final int size = 1000000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println("Одинарный поток: " + (System.currentTimeMillis() - a));
    }
}
