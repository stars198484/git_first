package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

import java.util.Scanner;

/**
 * Created by М.видео 60 on 11.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        MoveChess moveChess;
        DataEntry dataEntry = new DataEntry();

        do {
        System.out.println("Введите название фигуры:");
        FactoryChess factoryChess = new FactoryChess();
            try {
                moveChess = factoryChess.factoryChessMetod(dataEntry.entryChess());
                if (dataEntry.entryCoordinates(moveChess))
                    System.out.println("Успех!!!");
                else
                    System.out.println(moveChess.toString() + " не может так походить.");
            } catch (EntryChessException e) {
                System.out.println(e.getMessage());
            } catch (EntryCoordinatesException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Сыграем ещё? да - 1, нет - любая клавиша");
                ans = sc.next();
            }
        } while (ans.equals("1"));
        System.out.println("До свидания!");
    }
}
