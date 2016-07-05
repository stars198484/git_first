package ru.geekbrains.java1.dz.dz6.МаксимСараев;

import java.io.*;

/**
 * Created by Максим Сараев on 26.05.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter file1 = null;
        FileWriter file2 = null;

        try {
            file1 = new FileWriter("file1.txt");
            file1.write(splitText("qwertyuio1", 10));

            file2 = new FileWriter("file2.txt");
            file2.write(splitText("asdfghjkl2", 15));

        } catch (IOException e) {
            System.out.println("Ошиюка записи файлов");

        } finally {
            if (file1!=null) {
                file1.close();
            }
            if (file2!=null) {
                file2.close();
            }
        }

        String [] fileNameArr = new String[2];
        fileNameArr[0] = "file1.txt";
        fileNameArr[1] = "file2.txt";

        SplitTxtManyFile splitFile = new SplitTxtManyFile();
        SplitTxtManyFile.splitFile(fileNameArr, "result.txt");

     }

    private static String splitText(String inText, int n) {
        String splitText = "";
        for (int i=0; i<n; i++){
            splitText = splitText.concat(inText);
        }
        return splitText;
    }
}
