package ru.geekbrains.java2.dz.dz5.ЭлеонораОганджанян;

import java.util.ArrayList;

/**
 * Created by М.видео 60 on 22.06.2016.
 */
public class CalcSecondPart implements Runnable {
    private int size;
    private float[] arr = new float[size];

    public void setSize(int size) {
        this.size = size;
    }

    public void setArr(float[] arr) {
        this.arr = arr;
    }

    public float[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        for (int i = size; i < arr.length + size; i++) {
            arr[i - size] = (float) (arr[i - size] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
