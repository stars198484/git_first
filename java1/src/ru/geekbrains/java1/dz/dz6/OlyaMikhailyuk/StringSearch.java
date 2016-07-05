package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;

import java.io.*;

/**
 * Created by dvb on 26/05/16.
 */
class StringSearch {

    public static void stringSearch(int number, String searchWord) throws IOException {

        String searchFileName = ("/tmp/newfile" + number);

//        int count;

        FileInputStream fileIn = new FileInputStream(new File(searchFileName));
        byte[] content = new byte[fileIn.available()];
        fileIn.read(content);
        fileIn.close();

        String[] words = new String(content).split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }


        }

        if (count > 0)
            System.out.println("The word " + searchWord + " present " + count + " times in file " + searchFileName);

    }

}
