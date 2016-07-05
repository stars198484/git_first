package ru.geekbrains.java2.dz.dz5.РусланУстиц;

/**
 * Created by darky_000 on 21.06.2016.
 */
public class Main {


    public static void main(String[] args) {
        final int size = 10_000_000;
        float[] array1 = generateArray(size);
        float[] array2 = generateArray(size);
        int threadsCount = 4;

        // 1-st realization: simple fillArray
        System.out.println("Simple array filler");
        long beginTest = System.currentTimeMillis();
        array1 = ArrayFiller.fillArray(array1);
        long endTest = System.currentTimeMillis();
        System.out.printf("Test duration: %d ms\n", endTest - beginTest);

        // 2-nd realization: filling array using threadedFillArray method (works only with even number of threads)
        System.out.printf("Threaded array filler method (%d threads)\n", threadsCount);
        array2 = ArrayFiller.threadedFillArray(array2, threadsCount);
    }

    private static float[] generateArray(int size) {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }
        return array;
    }
}
