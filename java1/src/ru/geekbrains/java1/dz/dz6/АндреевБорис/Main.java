package ru.geekbrains.java1.dz.dz6.АндреевБорис;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bombist on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//        char[] sym = {'h', 'e', 'l', 'l', 'o'};
//        String s = new String(sym);
//        String s1 = new String(s);
//        System.out.println(s);
//        System.out.println(s1);
//        int age = 10;
//        String s3 = "Emu " + age + " let";
//        System.out.println(s3);
        int i=0;
        String test = new String();
        FileInputStream fin;
        try {
            fin = new FileInputStream("C:\\Users\\bombist\\IdeaProjects\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\АндреевБорис\\test.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    test = test + ((char) i);
//                    System.out.println((char) i);
                }
            } while (i != -1);
            fin.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибкa чтения файла");
        }
        System.out.println(test);
        try {
            fin = new FileInputStream("C:\\Users\\bombist\\IdeaProjects\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\АндреевБорис\\test2.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    test = test + ((char) i);
//                    System.out.println((char) i);
                }
            } while (i != -1);
            fin.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибкa чтения файла");
        }
        System.out.println(test);

        FileOutputStream fout = null;
        try {
//            fin = new FileInputStream("1.txt");
            fout = new FileOutputStream("C:\\Users\\bombist\\IdeaProjects\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\АндреевБорис\\test summ.txt");
            do {
                byte[] buffer = test.getBytes();

                fout.write(buffer, 0, buffer.length);
            } while (i != -1);
            if (fout != null) fout.close();
        }catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами") ;
        }

    }
}
