package ru.geekbrains.java2.dz.dz4.СтаниславОвчинников;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by Stars on 17.06.2016.
 */
class CodChat extends JFrame {


    private Properties pr = new Properties();
    JTextField jtf = new JTextField();
    JTextArea jl = new JTextArea();
    private int changed = 0;
    void Message() {
        if (jtf.getText().equals("")) {
            jtf.setText("");
        } else {
            jl.append("Вы: " + jtf.getText() + '\n');
            changed++;
            pr.put(String.valueOf(changed), "Вы: " + jtf.getText());//перенос из текстфилда в коллекцию
            FileOutputStream fout = null;
            try {
                fout = new FileOutputStream("message.txt");//выгрузка коллекции в файл
                pr.store(fout, "сообщение");
            } catch (IOException e) {
                System.out.println("error");
            } finally {
                jtf.setText("");
                try {
                    if (fout != null) fout.close();
                } catch (IOException exc) {
                    System.out.println("Ошибка при закрытии выходного файла");
                }
            }
        }
    }

    void ClearHistory() {
        jl.setText("");
        pr.clear();
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("message.txt");
            pr.store(fout, "сообщение");
        } catch (IOException e) {
            System.out.println("error");
        } finally

        {
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла");
            }

        }
    }

    void History() {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("message.txt");
        } catch (FileNotFoundException e) {
            System.out.println("");
        }
        try {
            if (fin != null) {//загрузка файла в коллекцию
                pr.load(fin);
                Set<?> key = pr.keySet();     //получить множество ключей
                Set<String> newKey = new TreeSet<String>();
                for (Object element : key
                        ) {
                    newKey.add((String) element);
                }
                for (Object msg : newKey
                        ) {
                    jl.append(pr.getProperty((String) msg) + '\n');//печать коллекции в текстареа
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }
        }
    }

}
