package ru.geekbrains.java1.dz.dz6.АлександрАнатольевичСмирнов;

import java.io.*;
import java.util.*;

/**
 * Created by Alexandr SMIRNOV on 25.05.2016.
 */

public class Main {
    public static void main(String[] args) {

        // ОСНОВНОЕ ЗАДАНИЕ

        int count;

        FileInputStream source = null;
        FileOutputStream receiver = null;

        // Открываем файл-приёмник
        try {
            receiver = new FileOutputStream("ДЗ3.txt");
        } catch (IOException е) {
            System.out.println("Произошла ошибка при работе с файлом-приёмником!");
        }

        // Открываем 1 файл-источник, копируем его содержимое и закрываем его
        try {
            source = new FileInputStream("ДЗ1.txt");
            do {
                count = source.read();
                if (count != -1) receiver.write(count);
            } while (count != -1);
            if (source != null) source.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибка при работе с первым файлом-источником!");
        }

        // Открываем 2 файл-источник, копируем его содержимое и закрываем его
        try {
            source = new FileInputStream("ДЗ2.txt");
            do {
                count = source.read();
                if (count != -1) receiver.write(count);
            } while (count != -1);
            if (source != null) source.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибка при работе с первым файлом-источником!");
        }

        // Закрывем файл-приёмник
        try {
            if (receiver != null) receiver.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибка при работе с файлом-приёмником!");
        }

        // ЗАДАНИЕ *
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для поиска: ");
        String stringFind = scanner.next();

        File[] filesInDirectory = new File(".").listFiles();

        for (File file : filesInDirectory) {
            //Нужны только папки в место isFile() пишим isDirectory()
            if (file.isFile()) {
                try {
                    source = new FileInputStream(file.getName());
                    byte[] fileContents = new byte[source.available()];
                    source.read(fileContents);
                    String textOfFind = new String(fileContents);
                    if (textOfFind.contains(stringFind)) System.out.println(file.getName());
                    if (source != null) source.close();
                } catch (IOException е) {
                    System.out.println("Произошла ошибка при работе с файлом " + file.getName());
                }
            }
        }


    } // psvm
}
