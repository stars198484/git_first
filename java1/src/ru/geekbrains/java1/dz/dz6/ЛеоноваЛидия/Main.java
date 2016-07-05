package ru.geekbrains.java1.dz.dz6.ЛеоноваЛидия;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Lydia Leonova
 */

/**
 * Создать 2 текствоых файла примерно со 100-150 символами в каждом;
 * Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом
 * текст из второго.
 * Написать программу, которая составляет список файлов, в которых присутствует слово,
 * указанное пользователем. Для проверки работы программы необходимо создать ~10 текстовых файлов.
 */
public class Main {
    // Шаблон для имен текстовых файлов
    static final String pathToFilesTemplate = "d:/myFiles/text"; //TODO Можно запрашивать у пользователя
    // Список созданных файлов
    static ArrayList<String> filesToFind = new ArrayList<String>();

    public static void main(String args[]) {
        // Создание текстовых файлов
        createTextsFiles();
        // Склеивание двух первых файлов в новый файл
        concatFirstAndSecondFiles();
        // Вывод списка файлов, содержащих заданное слово
        findInFiles();
    }

    /**
     * Создание группы текстовых файлов
     */
    private static void createTextsFiles() {

        // Создаем список текстов для наполнения текстовых файлов
        List<String> texts = new ArrayList<String>();
        texts.add("Мы на грандиозном свадебном торжестве в одном из здоровенных особняков в Вест-Хиллз. Дом утопает в цветах. Пахнет фаршированными грибами.\n" +
                "Это называется художественным оформлением представления. Здесь присутствуют все – те, кто жив, и те, кто умер.\n");
        texts.add("Свадьба Эви Коттрелл в самом разгаре. Эви стоит посередине огромной лестницы лицом к столпившимся в холле гостям. На ней лишь" +
                " то, что осталось от восхитительного подвенечного платья. В руке у Эви винтовка.\n");
        texts.add("Я внизу, у нижней ступени. Вернее, здесь мое физическое «я». Где находится мое сознание – не знаю.\n" +
                "Никто еще не распрощался с жизнью окончательно, но можно смело сказать, что часики уже тикают.\n");
        texts.add("Вообще-то назвать участников этой колоссальной человеческой драмы по-настоящему живыми тоже нельзя.\n" +
                "Если вам интересно узнать, кто такая Эви Коттрелл, просмотрите ряд рекламных телепередач об органических шампунях, в которых она " +
                "снималась.\n");
        texts.add("Сейчас Эви стоит голая, в металлических обручах вокруг бедер, оставшихся от съеденного огнем свадебного платья. На ушах у нее " +
                "проволочные скелетики шелковых цветов, совсем недавно украшавших шикарные, зачесанные назад волосы всех оттенков светлого.\n");
        texts.add("Уложенные в праздничную прическу, залитые лаком. Ее волосы… Их тоже поглотило пламя.\n");
        texts.add("Здесь присутствует еще одно главное действующее лицо – Бренди Александр. Получив огнестрельное ранение, она распростерлась на " +
                "полу у подножия лестницы и истекает кровью.\n");
        texts.add("Я смотрю на красный поток, струящийся из пулевого отверстия на теле Бренди, и сознаю, что воспринимаю происходящее как " +
                "осуществление некоей социополитической программы. Я не зря упомянула о рекламных телепередачах с шампунями, с десятками " +
                "клонов одного и того же человека. Все это относится и ко мне, и к Бренди Александр.");
        texts.add("Выстрел в кого бы то ни было в этом доме – моральный эквивалент убийства автомобиля. Или пылесоса. Или куклы Барби. Он сравним с" +
                " уничтожением информации на компьютерном диске. С преданием книги огню. Наверное, точно так же можно рассматривать любой " +
                "акт убиения, совершенный в той или иной точке земного шара. Все мы почти не отличаемся от продуктов, порожденных цивилизацией.\n");
        texts.add("Бренди Александр, первоклассная красавица без комплексов и предрассудков, настоящая королева, лежит на полу, и из дыры в ее " +
                "восхитительном жакете течет кровь. Жакет – от костюма, подделки под Боба Маки. Бренди купила его в Сиэтле. Юбка утягивает " +
                "ее задницу так, что та походит по форме на сердце, которое так и хочется потрогать.\n");

        // Cоздаем текстовые файлы и выводим сообщение об этом
        StringBuilder sb = new StringBuilder("Созданы файлы ");

        for (int i = 0; i < texts.size(); i++) {
            String fileFullName = pathToFilesTemplate + (i + 1) + ".txt";
            createTextFile(fileFullName, texts.get(i));
            // добавить файл в список, по которыму потом будет производиться поиск
            filesToFind.add(fileFullName);
        }
        // отформатировать список файлов для вывода в сообщении
        sb.append(arrayListToFormattedString(filesToFind));
        System.out.println(sb.toString());

    }

    /**
     * Создание текстового файла с именем pathToFile и содержимым text с использованием символьного потока вывода BufferedWriter
     */
    private static void createTextFile(String pathToFile, String text) {
        File file = new File(pathToFile);
        try {
            // создать символьный поток вывода
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            // записать в поток текст
            bw.write(text);
            // закрыть поток
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Соединение содержимого первых двух файлов в один новый файл
     */

    private static void concatFirstAndSecondFiles() {
        try {
            // для удобства и расширяемости сделать список потоков ввода для склеиваемых файлов
            List<FileInputStream> fins = new ArrayList<FileInputStream>();
            for (int j = 1; j < 3; j++) {
                fins.add(new FileInputStream(pathToFilesTemplate + j + ".txt"));
            }
            // создать поток вывода
            FileOutputStream fout = new FileOutputStream(pathToFilesTemplate + "texts1and2.txt");
            // идти по списку потоков ввода, из каждого брать данные и записывать в поток вывода
            for (FileInputStream fin : fins) {
                int i;
                do {
                    i = fin.read();
                    if (i != -1) fout.write(i);
                } while (i != -1);
            }
            // закрыть все потоки ввода в списке
            for (FileInputStream fin : fins) {
                if (fin != null) fin.close();
            }
            // закрыть поток вывода
            fout.close();
        } catch (IOException е) {
            е.printStackTrace();
        }
        System.out.println("Содержимое файлов " + pathToFilesTemplate + "1.txt и " + pathToFilesTemplate + "2.txt склеено в файле " +
                pathToFilesTemplate + "texts1and2.txt");
    }

    private static void findInFiles() {

        System.out.println("Вывести тексты всех файлов? (введите y для продолжения, любой другой символ - для задания слова для поиска)");
        Scanner scanner = new Scanner(System.in);
        String showTexts = scanner.next();

        if ("y".equals(showTexts)|| "у".equals(showTexts)) {
            showAllFilesTexts();
        }

        System.out.println("Задайте слово для поиска");
        Scanner scanWord = new Scanner(System.in);
        String word = scanWord.next();
        // Список файлов, включающих искомое слово
        ArrayList<String> fileNames = new ArrayList<String>();

        try {
            for (String fileName : filesToFind) {
                // считать содержимое каждого файла в строку
                String fileText = "";
                Scanner in = new Scanner(new File(fileName));
                while (in.hasNext())
                    fileText += in.nextLine();
                in.close();
                // если в строке есть искомое слово, добавить файл в список
                if (fileText.contains(word)) {
                    fileNames.add(fileName);
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        System.out.println("Слово «" + word + "» содержится в файлах " + arrayListToFormattedString(fileNames));
    }

    // Показать тексты всех файлов
    private static void showAllFilesTexts() {
        StringBuilder allFilesTextsSB = new StringBuilder();
        try {
            for (String fileName : filesToFind) {
                Scanner in = new Scanner(new File(fileName));
                while (in.hasNext())
                    allFilesTextsSB.append(in.nextLine()).append("\n");
                in.close();
            }
            System.out.println(allFilesTextsSB.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Вывести список файлов в строку через запятую
    private static String arrayListToFormattedString(ArrayList<String> arrayList){
        StringBuilder sb = new StringBuilder();
        for (String s : arrayList) {
            sb.append(s).append(", ");
        }
        String filesList = sb.toString();
        return (filesList.substring(0, filesList.length() - 2));
    }
}