package ru.geekbrains.java1.dz.dz6.НатальяТанина;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        addDataToFile("D:/firstFile.txt", "D:/secondFile.txt");

    }

    // Создать 2 текстовых файла примерно со 100-150 символами в каждом;
    // Написать программу, "склеивающую" эти файлы, то есть вначале идет текст из первого файла, потом из второго.

    public static void appendDataToFile (String _fileName, String _data) {
        FileOutputStream inFile = null;

        try {
            inFile = new FileOutputStream(_fileName, true);   //inFile = new FileOutputStream(new File(_fileName), true);
            inFile.write(_data.getBytes(), 0, _data.length());
        }
        catch (IOException e) {
            System.out.println("appendDataToFile :: " + e.getMessage());
        }
        finally {
            try {
                inFile.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void addDataToFile (String _inFileName, String _fromFile) {
        byte[] fileBite = new byte[1024];
        int iLength;

        FileInputStream fromFile = null;
        FileOutputStream inFile = null;
        iLength = 0;

        System.out.println("enter to addDataToFile");

        try {
            fromFile = new FileInputStream(_inFileName);
            inFile = new FileOutputStream(_fromFile);

            while ((iLength = fromFile.read(fileBite))>0) {
                System.out.println("--->>>" + iLength + " >>> " + Arrays.toString(fileBite));
                inFile.write(fileBite, 0, iLength);
            }

//            do {
//                fileBite = fromFile.read();                   // считываем данные из файла
//
//                if (fileBite != -1) inFile.write(fileBite, 0, fileBite);     // записываем данные в другой файл
//            } while(fileBite != 1);
//
//            if (inFile != null) inFile.close();
//            if (fromFile != null) fromFile.close();
        }
        catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами. :: " + e.getMessage());
        }
        finally {
            try {
                inFile.close();
                fromFile.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}
