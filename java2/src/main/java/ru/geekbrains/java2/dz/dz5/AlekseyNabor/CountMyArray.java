package ru.geekbrains.java2.dz.dz5.AlekseyNabor;

/**
 * Created by AlekseyN on 22.06.2016.
 */
class CountMyArray {

    private float[] array;
    private long time;

    CountMyArray(float[] arr) {
        this.array = arr;
        count();
    }

    private void count() {
        time = System.currentTimeMillis();
        for (int i=0;i<array.length;i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        time = System.currentTimeMillis()-time;
    }

    long getTime() {
        return time;
    }

    float[] getFinalArray() {
        return array;
    }

}
