package ru.geekbrains.java1.lesson6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class CopyFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("1.txt");
            fout = new FileOutputStream("2.txt");
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException е) {
            System.out.println("Произошла ошибка при работе с файлами");
        } finally {
            try {
            if (fin != null) fin.close();
            if (fout != null) fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

