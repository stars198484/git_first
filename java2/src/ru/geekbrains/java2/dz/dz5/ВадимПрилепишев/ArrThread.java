package ru.geekbrains.java2.dz.dz5.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 22.06.2016.
 */

public class ArrThread extends Thread {
    private static float[] arr;

    ArrThread(float[] arr){
        this.arr = arr;
    }

    public float[] getArr() {
        return arr;
    }

    @Override
    public void run(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
