package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;

import java.io.*;

/**
 * Created by dvb on 26/05/16.
 */
class CreateNewFile {

    public static void createFile(int number) throws IOException {

        String createFileName = ("/tmp/newfile" + number);

        File newFile = new File(createFileName);
        newFile.createNewFile();

    }

}
