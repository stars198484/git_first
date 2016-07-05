package ru.geekbrains.java2.dz.dz5.AlekseyNabor;

/**
 * Created by AlekseyN on 22.06.2016.
 */
class CountThread implements Runnable {

    private float[] array;

    CountThread(float[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i=0;i<array.length;i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    float[] getArray() {
        return array;
    }
}
