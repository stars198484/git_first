package ru.geekbrains.java1.dz.dz7.ОвчинниковСтанислав;

import java.util.Scanner;

/**
 * Created by Stars on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;
        boolean visibleField1 = true, visibleField2 = true, endSelect = true;
        Player p1 = null;
        Player p2 = null;
        do {
            System.out.println("Выбор режима игры" + '\n' + "1.Человек vs ИИ" + '\n' + "2.Человек vs Человек" + '\n' + "3.ИИ vs ИИ ");
            x = sc.next();
            if (x.equals("1")) {
                p1 = new HumanPlayer();
                p2 = new AiPlayer();
                endSelect = false;
                visibleField1 = false;
            }
            if (x.equals("2")) {
                p1 = new HumanPlayer();
                p2 = new HumanPlayer();
                endSelect = false;
                visibleField1 = false;
                visibleField2 = false;
            }
            if (x.equals("3")) {
                p1 = new AiPlayer();
                p2 = new AiPlayer();
                endSelect = false;
            }
        } while (endSelect);


        p1.getField().printField(visibleField2);
        while (true) {
            p1.turn(p2.getField());
            p2.getField().printField(visibleField1);
            if (p2.getField().isDefeated()) break;
            p2.turn(p1.getField());
            p1.getField().printField(visibleField2);
            if (p1.getField().isDefeated()) break;

        }
    }
}
