package ru.geekbrains.java1.dz.dz6.СтаниславЗемляков;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.IOException;


/**
 * Copypasted by rcd on 26.05.2016.
 */
public class TextGluer {
    public static void main(String[] args) {


        File file1 = new File("C:\\GeekBrains\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\СтаниславЗемляков\\text1.txt");
        File file2 = new File("C:\\GeekBrains\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\СтаниславЗемляков\\text2.txt");
        try {
            //Открываем 1-й файл для записи
            BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(file1, true)); // true - добавление в конец файла

            //Открываем 2-й файл для считывания
            BufferedInputStream bufRead = new BufferedInputStream(new FileInputStream(file2));
            int n;
            while ((n = bufRead.read()) != -1)

            {
                bufOut.write(n);
            }

            bufOut.flush();      // Принудительно выталкиваем данные с буфера
            bufOut.close();     // Закрываем соединения

            bufRead.close();
        } catch (IOException еx) {
            System.out.println("Произошла ошибка при работе с файлами");//
        }
    }
}