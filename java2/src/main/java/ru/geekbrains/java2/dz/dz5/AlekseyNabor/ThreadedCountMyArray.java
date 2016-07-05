package ru.geekbrains.java2.dz.dz5.AlekseyNabor;

/**
 * Created by AlekseyN on 22.06.2016.
 */
public class ThreadedCountMyArray {

    private long time;
    private float[] finalArray;

    ThreadedCountMyArray(float[] array, int threadsSeparator) {

        finalArray = new float[array.length];
        float[][] arrays = new float[threadsSeparator][array.length / threadsSeparator];

        time = System.currentTimeMillis();

        for (int i = 0; i< threadsSeparator; i++) { // ДЕЛИМ НА МАССИВЫ И ОТПРАВЛЯЕМ В ПОТОКИ
            int arrayLen = array.length/ threadsSeparator;
            System.arraycopy(array,i*arrayLen, arrays[i],0,arrayLen);
            CountThread countThread = new CountThread(arrays[i]);
            countThread.run();
            System.arraycopy(countThread.getArray(),0, finalArray,i*arrayLen,arrayLen);
        }

        time = System.currentTimeMillis()-time;

    }

    long getTime() {
        return time;
    }

    float[] getFinalArray() {
        return finalArray;
    }

}
