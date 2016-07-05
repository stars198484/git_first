package ru.geekbrains.java1.dz.dz6.ПавелСуходоев;

import java.io.*;
import java.util.Arrays;

/**
 * Created by xcyxoux on 25.05.16.
 */
public class Main {
    public static void main(String[] args) throws IOException {


        // 1
        try {
            //Пути до файлов нужно будет поправить
            FileInputStream f1 = new FileInputStream("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/1.txt");
            FileInputStream f2 = new FileInputStream("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/2.txt");
            FileOutputStream f3 = new FileOutputStream("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/out.txt");
            //Сливаем файлы в один
            concatFiles(f1, f2, f3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File[] files = new File[10];

        files[0] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/1.txt");
        files[1] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/2.txt");
        files[2] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/3.txt");
//        files[3] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/4.txt");
//        files[4] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/5.txt");
//        files[5] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/6.txt");
//        files[6] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/7.txt");
//        files[7] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/8.txt");
//        files[8] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/9.txt");
//        files[9] = new File("/home/xcyxoux/IdeaProjects/dz6/src/ru/geekbrains/java1/dz/dz6/ПавелСуходоев/10.txt");

        // 2
        //Слово которое нужно найти
        String word = "Java";
        //Запоминаем байты слова
        byte[] wordInBytes = word.getBytes();
        for (File file : files) {
            //Если файл задан
            if (file != null) {
                FileInputStream fileToSearchIn = new FileInputStream(file);
                //Если слово находится - пишем название файла
                if (searchWord(fileToSearchIn, wordInBytes)) System.out.println(file.getName());
            }
        }


    }

    //Склейка файлов
    private static void concatFiles(FileInputStream f1, FileInputStream f2, FileOutputStream f3) throws IOException {

        int smbl;
        do {
            smbl = f1.read();
            if (smbl != -1) {
                f3.write(smbl);
            }
        } while (smbl != -1);

        do {
            smbl = f2.read();
            if (smbl != -1) {
                f3.write(smbl);
            }
        } while(smbl != -1);
    }

    //Поиск слова в файле
    private static boolean searchWord(FileInputStream f, byte[] wordInBytes) throws IOException {
        int smbl;
        //массив байт для сравнения
        byte[] tmp = new byte[wordInBytes.length];
        //вспомогательный массив байт
        byte[] help = new byte[wordInBytes.length - 1];
        tmp[0] = wordInBytes[0];
        do {
            smbl = f.read();
            //Если прочитанный символ равен первой букве слова которое ищем
            if (smbl == wordInBytes[0]) {
                //Читаем количество байт начиная со следующего за найденной буквой в вспомогательный массив
                f.read(help, 0, wordInBytes.length - 1);
                //копируем прочитанные байты в массив tmp
                System.arraycopy(help, 0, tmp, 1, help.length);
                //Выходим с истиной, если массивы равны
                return Arrays.equals(tmp, wordInBytes);
            }
        } while (smbl != -1);
        return false;
    }

}
