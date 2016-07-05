package ru.geekbrains.java2.dz.dz5.СараевМаксим;

/**
 * Created by desarz on 23.06.2016.
 */
public class MyThread implements Runnable {
    float[] arr;

    public MyThread(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
