package ru.geekbrains.java1.dz.dz7.ПавелСуходоев;

import java.util.Scanner;

/**
 * Created by xcyxoux on 29.05.16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Player p1, p2;
        System.out.println("Выберите кто будет первым игроком (1 - ИИ, 2 - Человек): ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                p1 = new AiPlayer();
                break;
            case 2:
                p1 = new HumanPlayer();
                break;
            default:
                System.out.println("Ввод не распознан, за первого игрока будет Человек");
                p1 = new HumanPlayer();
                break;
        }

        System.out.println("Выберите кто будет вторым игроком (1 - ИИ, 2 - Человек): ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                p2 = new AiPlayer();
                break;
            case 2:
                p2 = new HumanPlayer();
                break;
            default:
                System.out.println("Ввод не распознан, за второго игрока будет Человек");
                p2 = new HumanPlayer();
                break;
        }

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
