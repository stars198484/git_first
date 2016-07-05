package ru.geekbrains.java1.dz.dz6.АлександрРожнов;
/**
 * Created by aleksandr.rozhnov on 25.05.2016.
 */
import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        File file1 = createFileOnDisk("flle1.txt");
        File file2 = createFileOnDisk("flle2.txt");

        String randomString1 = getRandomString(100);
        String randomString2 = getRandomString(150);

        appendToFile(file1,randomString1);
        appendToFile(file2,randomString2);


        collapseFiles(file1,file2);

    }


    /**
     * создание файла с указанным именем на диске
     * @param fileName имя файла для создания
     * @return объект файла или  null в случае неудачи
     */
    private static File createFileOnDisk(String fileName){
        File file = new File(fileName);
        try {
            //проверка что такого файла еще не создали
            if(file.exists()){
                System.out.println("File already exists "+file.getAbsolutePath());
                //удаляем файл если такой уже есть
                file.delete();
                //создаем новый
                file.createNewFile();
                return file;
            }else{
                //если такого файла еще нет
                //создаем файл
                boolean created =  file.createNewFile();
                if(created){
                    return file;
                }else{
                    System.out.println("Can not create file "+file.getAbsolutePath());
                    return  null;
                }

            }
        } catch (IOException e) {
            //в случае ошибки
            System.out.println("Can not create file "+file.getAbsolutePath());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * дописать в файл строку теста
     * @param text текст для записи
     * @param file файл в который записываем
     */
    private static void appendToFile(File file, String text){

        try {
            //канал для записи в файл, true для того чтобы не перезаписывать файл при добавлении строк
            FileOutputStream stream = new FileOutputStream(file,true);

            // перевод строки в байты для записи
            byte[] textInBytes = text.getBytes();
            try {
                stream.write(textInBytes);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Can not write to file "+file.getAbsolutePath());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found "+file.getAbsolutePath());
        }
    }

    /**
     *
     * @param lenght длина строки
     * @return возвращает строку заданной длины со случайными символами
     */
    private static String getRandomString(int lenght){
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(lenght);
        for( int i = 0; i < lenght; i++ )
            sb.append(symbols.charAt(
                    random.nextInt(symbols.length())
            ));
        return sb.toString();
    }

    /**
     * копирует содержимое из файла 1 в файл 2, если в файле file2 уже есть данные то дописывает
     *
     * @param file1 файл1
     * @param file2 файл 2
     * @return файл2
     */
    private static File collapseFiles(File file1, File file2) throws IOException {
        int i;
        FileInputStream in  = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2, true);

        do {
            i = in.read();
            if(i != -1) out.write(i);
        } while (i!=-1);

        in.close();
        out.close();

        return file2;
    }
}

