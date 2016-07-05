package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dvb on 26/05/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String fileIn = "/tmp/newfile0";
        String fileOut = "/tmp/newfile1";

        Scanner scanner = new Scanner(System.in);

        String searchWord = scanner.nextLine();

        int[] fileLoop = new int[10];

        for (int number = 0; number < fileLoop.length; number++) {
            RemoveFile.removeFile(number);
            CreateNewFile.createFile(number);
            FillFile.fillFile(number);
            StringSearch.stringSearch(number, searchWord);

        }

        CopyFile.copyFile(fileIn, fileOut);

    }

}
