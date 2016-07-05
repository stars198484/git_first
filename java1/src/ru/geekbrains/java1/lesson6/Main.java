package ru.geekbrains.java1.lesson6;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//        String s1 = "111";
//        String s2 = "111";
//        String s3 = new String(s1);
//        String s4 = new String(s2);
//        String s5 = "11" + "1";
//
//        System.out.println("s1==s2 " + (s1==s2));
//        System.out.println("s1  equals s2 " + s1.equals(s2));
//        System.out.println("s1==s3 " + (s1==s3));
//        System.out.println("s1  equals s3 " + s1.equals(s3));
//        System.out.println("s1==s4 " + (s1==s4));
//        System.out.println("s1  equals s4 " + s1.equals(s4));
//        String s6 = "11";
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer;

        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream("test.txt");
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
            fin.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибкa чтения файла");
        }
    }
}
