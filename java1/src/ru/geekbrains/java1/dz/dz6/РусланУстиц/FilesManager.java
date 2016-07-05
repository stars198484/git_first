package ru.geekbrains.java1.dz.dz6.РусланУстиц;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by darky_000 on 24.05.2016.
 */
public class FilesManager {
    public FilesManager() {

    }

    public static void joinFiles(String inputFile1, String inputFile2, String outputFile) {
        int i;
        FileInputStream fin1 = null;
        FileInputStream fin2 = null;
        FileOutputStream fout = null;

        try {
            fin1 = new FileInputStream(inputFile1 + ".txt");
            fin2 = new FileInputStream(inputFile2 + ".txt");
            fout = new FileOutputStream(outputFile + ".txt");

            do {
                i = fin1.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

            do {
                i = fin2.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

            if (fin1 != null) fin1.close();
            if (fin2 != null) fin2.close();
            if (fout != null) fout.close();

        } catch (IOException e) {
            System.out.println("Ошибка: Проблема при склеивании файлов");
        }
    }

    public static void generateFile(int size, String filename) {
        Random random = new Random();
        StringBuffer dict = new StringBuffer("abcdefghijklmnopqrstuvwxyz    0123456789");
        char tmp;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filename + ".txt");
            for (int i = 0; i < size; i++) {
                tmp = dict.charAt(random.nextInt(dict.length()) % dict.length());
                fout.write(tmp);
            }
            if (fout != null) fout.close();
        } catch (IOException e) {
            System.out.println("Ошибка: Проблема при генерации файла.");
        }
    }

    public static void printFilesContaining(String[] files, String word) {
        boolean[] results = getFilesNamesContaining(files, word);
        for (int i = 0; i < files.length; i++) {
            if (results[i] == true)
                System.out.println(files[i]);
        }
    }

    private static boolean[] getFilesNamesContaining(String[] files, String word) {
        boolean[] result = new boolean[files.length];
        FileInputStream[] filesStreams = new FileInputStream[files.length];
        StringBuilder tmp = new StringBuilder(word.length());
        int counter = 0;
        int symbol;

        for (int i = 0; i < files.length; i++)
            filesStreams[i] = null;

        try {
            for (int i = 0; i < files.length; i++) {
                filesStreams[i] = new FileInputStream(files[i] + ".txt");

                do {
                    symbol = filesStreams[i].read();
                    if (counter != word.length()) {
                        tmp.append((char)symbol);
                        counter++;
                    } else {
                        tmp.deleteCharAt(0);
                        tmp.append((char)symbol);
                    }

                    if (tmp.toString().equals(word)) {
                        result[i] = true;
                        break;
                    }
                } while (symbol != -1);
                if (filesStreams[i] != null) filesStreams[i].close();
                counter = 0;
                tmp.delete(0, tmp.length());
            }
        } catch (IOException e) {
            System.out.println("Ошибка: Проблема при поиске слова.");
        }

        return result;
    }
}
