package ru.geekbrains.java1.dz.dz7.МамаевИгорь;

import java.util.Scanner;

/**
 * Created by Игорь on 29.05.2016.
 */
public class GameProcess {

    public static void main(String[] args) {
        Player p1 = null;
        Player p2 = null;
        boolean result;
        do {
            System.out.println("Выберете вариант игры:");
            System.out.println("1. Человек - компьютер");
            System.out.println("2. Человек - человек");
            System.out.println("3. Компьютер - компьютер");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    p1 = new HumanPlayer();
                    p2 = new AiPlayer();
                    result = true;
                    break;
                }
                case 2: {
                    p1 = new HumanPlayer();
                    p2 = new HumanPlayer();
                    result = true;
                    break;
                }
                case 3: {
                    p1 = new AiPlayer();
                    p2 = new AiPlayer();
                    result = true;
                    break;
                }
                default: {
                    System.out.println("Неправильный ввод.");
                    result = false;
                    break;
                }
            }
        } while (!result);


        p1.getField().printField(true);
        while (true) {
            p1.turn(p2.getField());
            p2.getField().printField(true);
            if (p2.getField().isDefeated()) break;

            p2.turn(p1.getField());
            p1.getField().printField(true);
            if (p1.getField().isDefeated()) break;
        }
    }


}
