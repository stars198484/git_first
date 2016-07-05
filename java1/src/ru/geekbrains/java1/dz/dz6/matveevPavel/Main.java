package ru.geekbrains.java1.dz.dz6.matveevPavel;

import java.io.*;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String file1 = read("/Users/Sarluk/IdeaProjects/java1/src/ru/geekbrains/java1/dz/dz6/matveevPavel/file1.txt");
            String file2 = read("/Users/Sarluk/IdeaProjects/java1/src/ru/geekbrains/java1/dz/dz6/matveevPavel/file2.txt");
            String fileFull = file1 + file2;
            System.out.println(fileFull);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        //Определяем файл
        File file = new File(fileName);

        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        exists(fileName);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}

