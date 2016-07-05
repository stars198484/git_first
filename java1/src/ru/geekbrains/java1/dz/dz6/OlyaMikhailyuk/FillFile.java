package ru.geekbrains.java1.dz.dz6.OlyaMikhailyuk;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by dvb on 26/05/16.
 */
class FillFile {

    public static void fillFile(int number) throws IOException {

        String fillFileName = ("/tmp/newfile" + number);

//        String dictionary = "wertyuiopasdfghjklzxcvbnm1234567890";

        byte[] charArray = new byte[75];
        for (int i = 0; i < charArray.length; i++) {

            charArray[i] = ((byte) (Math.random() * 128));
            
        }

        String dictionary = new String(charArray);


        try (FileWriter writer = new FileWriter(fillFileName, false)) {
            writer.write(dictionary);
        } catch (IOException e) {
            System.out.println("Something goes wrong");
        }
    }
}
