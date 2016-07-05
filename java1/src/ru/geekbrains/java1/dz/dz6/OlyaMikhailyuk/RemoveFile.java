package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;

import java.io.*;

/**
 * Created by dvb on 26/05/16.
 */
class RemoveFile {

    public static void removeFile(int number) throws IOException {

        String removeFileName = ("/tmp/newfile" + number);
        new File(removeFileName).delete();

    }
}
