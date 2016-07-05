package ru.geekbrains.java2.dz.dz5.АндрейИванов;

/**
 * Created by a.ivanov on 22.06.2016.
 */
public class TimeWorkingMetods {

   private static final int size = 10000000;
   private static final int halfSize = size / 2;
   private static final int fourthsize = size / 4;

    void howLongWorking() {

        long start, end;

        //вычисление с 1 одним потоком
        start = System.currentTimeMillis();
        calculateWithOneThread();
        end = System.currentTimeMillis();
        System.out.println("Затраченное время на вычисление с 1 одним потоком - " + (end - start));

        //вычисление с 2мя потоками
        start = System.currentTimeMillis();
        calculateWithTwoThread();
        end = System.currentTimeMillis();
        System.out.println("Затраченное время на вычисление с 2мя потоками - " + (end - start));

        //вычисление с 4мя потоками
        start = System.currentTimeMillis();
        calculateWithFourThread();
        end = System.currentTimeMillis();
        System.out.println("Затраченное время на вычисление с 4мя потоками - " + (end - start));
    }


    private void calculateWithOneThread(){

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < size; i++) {

            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private void calculateWithTwoThread() {

        float[] arr = new float[size];
        float[] a1 = new float[halfSize];
        float[] a2 = new float[halfSize];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.arraycopy(arr, 0, a1, 0, halfSize);
        System.arraycopy(arr, halfSize, a2, 0, halfSize);

        a1 = runNewThread(a1);
        a2 = runNewThread(a2);

        System.arraycopy(a1, 0, arr, 0, halfSize);
        System.arraycopy(a2, 0, arr, halfSize, halfSize);
    }

    private void calculateWithFourThread() {

        float[] arr = new float[size];
        float[] a1 = new float[fourthsize];
        float[] a2 = new float[fourthsize];
        float[] a3 = new float[fourthsize];
        float[] a4 = new float[fourthsize];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        System.arraycopy(arr, 0, a1, 0, fourthsize);
        System.arraycopy(arr, fourthsize, a2, 0, fourthsize);
        System.arraycopy(arr, halfSize, a3, 0, fourthsize);
        System.arraycopy(arr, size - fourthsize, a4, 0, fourthsize);

        a1 = runNewThread(a1);
        a2 = runNewThread(a2);
        a3 = runNewThread(a3);
        a4 = runNewThread(a4);

        System.arraycopy(a1, 0, arr, 0, fourthsize);
        System.arraycopy(a2, 0, arr, fourthsize, fourthsize);
        System.arraycopy(a3, 0, arr, halfSize, fourthsize);
        System.arraycopy(a4, 0, arr, size-fourthsize, fourthsize);

    }

    private float[] runNewThread(float[] mas) {

        ThreadClass threadClass = new ThreadClass(mas);
        Thread thread = new Thread(threadClass);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        mas = threadClass.getArr();
        return mas;
    }

}
