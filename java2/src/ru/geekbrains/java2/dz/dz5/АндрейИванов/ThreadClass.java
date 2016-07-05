package ru.geekbrains.java2.dz.dz5.АндрейИванов;

/**
 * Created by a.ivanov on 22.06.2016.
 */
public class ThreadClass implements Runnable {

    private float[] arr;
    public void setArr(float[] arr) {
        this.arr = arr;
    }
    public float[] getArr() {

        return arr;
    }

    ThreadClass(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
