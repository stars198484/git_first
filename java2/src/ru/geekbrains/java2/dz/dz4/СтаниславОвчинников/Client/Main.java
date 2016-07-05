package ru.geekbrains.java2.dz.dz4.СтаниславОвчинников.Client;

import java.io.File;
import java.io.IOException;

/**
 * Created by Stars on 17.06.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        File newFile = new File("message.txt");//создать новый файл
        newFile.createNewFile();
        WindowChat wc = new WindowChat();
    }
}
