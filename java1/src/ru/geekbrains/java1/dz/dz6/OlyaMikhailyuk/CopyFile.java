package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;
import java.io.*;

/**
 * Created by dvb on 26/05/16.
 */
class CopyFile {

    public static void copyFile(String fileIn, String fileOut) throws IOException {

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileIn, true));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileOut));

        int n;
        while ((n = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(n);
        }

        bufferedOutputStream.close();
        bufferedInputStream.close();


    }


}
