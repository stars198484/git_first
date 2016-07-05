package ru.geekbrains.java1.dz.dz6.ВавилинГерман;

/**
 * Created by Вавилин Герман on 24.05.2016.
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Следует указать путь к файлам.
        String path = "D:\\YaDisk\\YandexDisk\\Обучение\\GeekBrains\\Mobile Developer\\java1";
        //Список файлов для объединения
        String[] fileList = {"1.txt", "2.txt"};
        //Имя для выходного файла.
        String fileOut = "out.txt";
        //Сшиваем файлы в 1
        fileMerge(fileList, fileOut);
        //Поиск строки в файлах
        fileContainStringChecher(path);
    }

    //Объединение путем дописывания исходного файла в конец выводного (через цикл, по списку файлов).
    //Так реаизовано, поскольку если работать со строками, будет использоваться много памяти на больших файлах.
    //Вообще можно было получить строки из файлов 1 и 2, сконкатенировать их, и полученную строку записать в выходной файл
    //При работе с потоком вывода дописать файл не получилось, только переписать заново.
    //_out.txt - полученный мной файл

    public static void fileMerge(String[] inFiles, String outFile) {
        File out = new File(outFile);
        if (out.exists()&out.isFile()) {
            System.out.println("Удаляем старый файл " + outFile);
            out.delete();
        }
        for(String file : inFiles) {
            int i;
            FileInputStream fin = null;
            try {
                fin = new FileInputStream(file);
                FileWriter fileWriter = new FileWriter(outFile, true);
                do {
                    i = fin.read();
                    if(i != -1) fileWriter.write(i);
                } while (i != -1);
                if (fin != null) fin.close();
                fileWriter.close();
            }
            catch (IOException e) {
                System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
            }
        }
    }

    public static void fileContainStringChecher(String directory) {
        String question;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите слово для поиска в файлах (не может быть пустым):");
            question = sc.nextLine();
        }while (question.equals(""));
        File sourceDirectory = new File(directory);
        try {
            for (File file : sourceDirectory.listFiles()) {
                if (!file.isDirectory()) {
                    String fileString = "";
                    int i;
                    FileInputStream fin = null;
                    try {
                        fin = new FileInputStream(file);
                        do {
                            i = fin.read();
                            if(i != -1) fileString = fileString + (char)i;
                        } while (i != -1);
                        if (fin != null) fin.close();
                        if (fileString.contains(question)) {
                            System.out.println("Строка " + question + " содержится в файле " + file.getName());
                        }
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
                    }
                }
            }
        }
        catch (NullPointerException npe) {
            System.out.println("Список для обработки пуст: " + npe.getMessage());
        }
    }
}
