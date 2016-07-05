package ru.geekbrains.java1.dz.dz6.АндрейИванов;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by a.ivanov on 24.05.2016.
 */
public class JoinFile {

//    Создать 2 текствоых файла примерно со 100-150 символами в каждом;
//    Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

    public static void main(String[] args) {

        String filePathRead = "C:/geekbrains/java1/java1.git/src/lesson6/1.txt";
        String filePathCopy = "C:\\geekbrains\\java1\\java1.git\\src\\lesson6\\3.txt";
        String data = "\r\n\r\n                                     Начало второго файла.\r\n\r\n";

        copyFile(filePathRead, filePathCopy);

        WriteIntoFile(filePathCopy, data);

        filePathRead = "C:/geekbrains/java1/java1.git/src/lesson6/2.txt";

        copyFile(filePathRead, filePathCopy);
    }

    public static void copyFile (String filePathRead, String filePathWrite) {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        String str;

        try {
            fin = new FileInputStream(filePathRead);
            fout = new FileOutputStream(filePathWrite, true);
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            }
            while (i != -1);
            if (fin != null) fin.close();
            if (fout != null) fout.close();
        }
        catch (IOException e) { System.out.println("Произошла ошибка при чтении-записи файла!");}
    }

    public static void WriteIntoFile (String filePathWrite, String data) {

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filePathWrite, true);
            fout.write(data.getBytes("Cp1251"));
            fout.close();
        }
        catch (IOException e) { System.out.println("Произошла ошибка при записи в файл!");}
    }
}
