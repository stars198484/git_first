package ru.geekbrains.java2.dz.dz5.YuryLukas;

/**
 * Created by yurok on 23.06.16.
 */
public class MyTread extends Thread {

    float[] arr;

    public void run(){

        for(int i=0; i<arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }

    public void createArray(float[] arrayWork){
        arr = arrayWork;
    }

    public float[] getArray() {
        return arr;
    }
}
