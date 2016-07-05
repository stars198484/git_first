package ru.geekbrains.java1.dz.dz1.ArturEpshtein;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte b = 25; // 8-битное знаковое целое число. Значения: от -128 до 127.
        System.out.println(b);
        short s = 25134; // 16-битное знаковое целое число. Значения: от -32768 до 32767.
        System.out.println(s);
        int i = 666000; // 32-битное знаковое целое число. Значения: от -2147483648 до 2147483648.
        System.out.println(i);
        long l = 26000L; // 64-битное знаковое целое число. Значения: от -9223372036854775808 до 9223372036854775808.
        System.out.println(l);
        float f = 155.0f; // 32-битное знаковое число с плавающей запятой одинарной точности. По умолчанию: 0.0f
        System.out.println(f);
        double d = 16.54d; // 64-битное знаковое число с плавающей запятой двойной точности. По умолчанию: 0.0d
        System.out.println(d);
        boolean bb = true; // принимает два значения: true и false.
        System.out.println(bb);
        char c = 'A'; // 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode. Принимает значения от '\u0000' или 0 до '\uffff' или 65,535.
        System.out.println(c);

        System.out.println(Method1(1, 3, 2, 4));
        System.out.println(method2(13, 11));
        System.out.println(Method3(1983));
    }

    //●	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
    private static int Method1(int a, int b, int c, int d) {//!
        int Result = a * (b + c / d);//!
        return Result;
    }


//●	Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.
    private static boolean method2(int a, int b) {
        int Sum = a + b;//!
        boolean Result = false;//!
        if ((Sum < 20) && (Sum > 10)) {
            Result = true;
        }
        return Result;
    }

//●	* Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static int Method3(int a) {
        int x;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            x = 366;
            System.out.println("Год является високосным (с " + x + " дней).");
        } else {
            x = 365;
            System.out.println("Год не является високосным (имеет " + x + " дней).");
        }
        return a;//!
    }
}
