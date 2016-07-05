package ru.geekbrains.java2.dz.dz7.РусланУстиц.io;

import java.io.*;

/**
 * Created by darky_000 on 17.06.2016.
 */
public class IOFile {

    private static final String FILENAME = "history.txt";
    private static final File FILE = new File(FILENAME);

    public void write(final String text) {
        try {
            final PrintWriter pw = new PrintWriter(new FileWriter(FILE, true));
            pw.append(text);
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        StringBuilder text = new StringBuilder();
        try {
            final FileReader fr = new FileReader(FILE);
            final BufferedReader br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null) {
                text.append(s + "\n");
            }
        } catch (FileNotFoundException e) {
            text.append("");
        }
        catch (IOException e) {
            text.append(e.getMessage());
            e.printStackTrace();
        }

        return text.toString();
    }

    public void clearFile() {
        try {
            final PrintWriter pw = new PrintWriter(new FileWriter(FILE));
            pw.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
