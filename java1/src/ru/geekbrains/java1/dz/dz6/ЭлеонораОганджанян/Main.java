package ru.geekbrains.java1.dz.dz6.ЭлеонораОганджанян;

import java.io.*;

/**
 * Created by М.видео 60 on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\М.видео 60\\Documents\\Курсы Java1\\lesson2\\src\\ru\\geekbrains\\java1\\dz\\dz6\\";

        FileInputStream firstFile = null;
        FileInputStream secondFile = null;
        FileOutputStream summaryFile = null;

        int i;
        try {
            firstFile = new FileInputStream(path + "text1.txt");
            secondFile = new FileInputStream(path + "text2.txt");
            summaryFile = new FileOutputStream(path + "text3.txt");
            do {
                i = firstFile.read();
                if (i != -1) summaryFile.write(i);
            } while (i != -1);

            do {
                i = secondFile.read();
                if (i != -1) summaryFile.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (firstFile != null) firstFile.close();
                if (secondFile != null) secondFile.close();
                if (summaryFile != null) summaryFile.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
