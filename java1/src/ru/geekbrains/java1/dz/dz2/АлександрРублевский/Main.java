package ru.geekbrains.java1.dz.dz2.АлександрРублевский;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int max = 0, min = 0;
        for (int j = 0; j < array.length; j++) {

            if (j == 0) {
                max = array[j];
                min = array[j];
            }
            if (max < array[j])
                max = array[j];

            if (min > array[j])
                min = array[j];
        }
        System.out.println("Minumum is = " + min + " Maximum is = " + max);

    }

}
