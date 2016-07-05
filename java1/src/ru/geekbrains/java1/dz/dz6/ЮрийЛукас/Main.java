package ru.geekbrains.java1.dz.dz6.ЮрийЛукас;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yurok on 25.05.16.
 */
public class Main {
    private static Scanner read;
    private static String line;
    //не понял почему, но путь с ~/ не хочет работать
    private static String workDirektory = "/home/yurok/IdeaProjects/dz/src/ru/geekbrains/java1/dz/dz6/ЮрийЛукас/";
    private static String firstFileName = "in1.txt";
    private static String secondFileName = "in2.txt";
    private static String resultFileName = "res.txt";

    public static void main(String[] args) throws IOException {

        read = new Scanner(System.in);

        System.out.println(System.getProperty("user.dir"));

        while (true) {
            System.out.println("1 - слияние двух файлов");
            System.out.println("2 - поиск в файлах");
            System.out.println("Q - Выход");
            System.out.println("-----------------------------");

            line = read.next();

            switch (line.charAt(0)) {
                case '1':
                    SumFiles concatFiles = new SumFiles(workDirektory + firstFileName, workDirektory + secondFileName, workDirektory + resultFileName);
                    concatFiles.concatFiles();

                    break;
                case '2':
                    System.out.println("Поиск слова \"dixi\" в файлах .txt");
                    SeachWordInFiles search = new SeachWordInFiles();
                    search.setMask(".txt");
                    search.setWorkDirectory(workDirektory);
                    search.setWord("dixi");
                    search.searcFiles();
                    break;
                case 'q':
                    return;
                case 'Q':
                    return;
            }
        }
    }
}
