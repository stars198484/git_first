package ru.geekbrains.java2.dz.dz5.СараевМаксим;

/**
 * Домашнее задание небольшое, но придется покопаться.
 Необходимо написать два метода, которые делают следующее:
 1) Создают одномерный длинный массив, например:
 static final int size = 10000000;
 static final int h = size / 2;
 float[] arr = new float[size];
 2) Заполняют этот массив единицами;
 3) Засекают время выполнения: long a = System.currentTimeMillis();
 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 5) Проверяется время окончания метода System.currentTimeMillis();
 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
 Чем отличается первый метод от второго:
 Первый просто бежит по массиву и высчитывает значения.
 Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом
 склеивает эти массивы обратно в один.
 Пример деления одного массива на два:
 System.arraycopy(arr, 0, a1, 0, h);
 System.arraycopy(arr, h, a2, 0, h);
 Пример обратной склейки:
 System.arraycopy(a1, 0, arr, 0, h);
 System.arraycopy(a2, 0, arr, q,h);
 По замерам времени:
 Для первого метода надо считать время только на цикл расчета:
 for (int i = 0; i < size; i++) {
 arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 }
 Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
 склейки
 */
public class Main {

    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        method1();
        method2();

    }

    public static void method1() {

        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void method2() {

        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        // Пример деления одного массива на два:
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread m1 = new MyThread(a1);
        MyThread m2 = new MyThread(a2);
        m1.run();
        m2.run();

        // Пример обратной склейки:
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);

    }
}
