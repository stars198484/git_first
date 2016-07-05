package ru.geekbrains.java2.dz.dz5.РусланУстиц;

/**
 * Created by darky_000 on 21.06.2016.
 */
public class ArrayFiller {

    public static float[] fillArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return array;
    }

    public static float[] threadedFillArray(float[] array, int threadsCount) {
        int size = array.length / threadsCount;
        float[][] arrayParts = new float[threadsCount][size];
        ArrayFillerThread[] threads = new ArrayFillerThread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            System.arraycopy(array, size * i, arrayParts[i], 0, size);
            threads[i] = new ArrayFillerThread(arrayParts[i], size * i);
            System.arraycopy(arrayParts[i], 0, array, size * i, size);

        }
        long liveTime = 0;
        System.out.print("Processing");
        for (ArrayFillerThread thread : threads) {
            do {
                System.out.print(".");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (thread.getThread().isAlive());

            if (liveTime < thread.getLiveTime())
                liveTime = thread.getLiveTime();
        }
        System.out.printf("\nMethod executed in %d ms\n", liveTime);
        return array;
    }

    private static class ArrayFillerThread extends Thread {

        private static int threadCounter = 0;
        private float[] array;
        private int shift;
        private int id;

        private Thread thread;

        private long bornTime;
        private long dieTime;
        private long liveTime;

        ArrayFillerThread(float[] array, int shift) {
            this.array = array;
            this.shift = shift;
            this.id = threadCounter;
            threadCounter++;

            thread = new Thread(this, String.valueOf(id));
            bornTime = System.currentTimeMillis();
            thread.start();
        }

        @Override
        public void run() {
            array = fillArray(shift);
            dieTime = System.currentTimeMillis();
            liveTime = dieTime - bornTime;
        }

        public Thread getThread() {
            return thread;
        }

        public long getLiveTime() {
            return liveTime;
        }

        private float[] fillArray(int shift) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + (i + shift)/ 5) * Math.cos(0.2f + (i + shift) / 5) * Math.cos(0.4f + (i + shift) / 2));
            }
            return array;
        }
    }
}
