package ru.geekbrains.java1.dz.dz6.ЭлеонораОганджанян;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by М.видео 60 on 26.05.2016.
 */
public class Main1 {
    public static String path = "C:\\Users\\М.видео 60\\Documents\\Курсы Java1\\lesson2\\src\\ru\\geekbrains\\java1\\dz\\dz6\\SomeFiles\\";
    public static Scanner sc = new Scanner(System.in);
    public static String strEquals = "";

    public static void findWord(File directory) {
        if (directory.isDirectory()) {
            for (File f : directory.listFiles()) {
                if (f.isFile()) try (FileReader fReader = new FileReader(f)) {
                    char[] buffer = new char[(int) f.length()];
                    fReader.read(buffer);
                    String s = new String(buffer);

                    if (s.indexOf(strEquals) != -1) {
                        System.out.println(path + f.getName());
                    }
                    fReader.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Введите искомое слово:");
        strEquals = sc.nextLine();

        File dir = new File(path);
        findWord(dir);
    }
}
