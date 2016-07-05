package ru.geekbrains.java2.dz.dz1.МамаевИгорь;

import java.util.Scanner;

/**
 * Created by Игорь on 08.06.2016.
 */
public class Menu {

    public Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String userInput;
        Figure figure = null;
        do {
            System.out.println("Введите пункт меню:");
            System.out.println("Проверить:");
            System.out.println("    1. Пешку");
            System.out.println("    2. Ладью");
            System.out.println("    3. Коня");
            System.out.println("    4. Слона");
            System.out.println("    5. Короля");
            System.out.println("    6. Ферзя");
            System.out.println("7. Выйти из программы");
            choice = scanner.nextInt();
            if (!(choice > 0 && choice < 8)) {
                System.out.println("Неверный ввод");
            }
        } while (!(choice > 0 && choice < 8));

        switch (choice) {
            case 1:
                figure = new Pawn();
                break;
            case 2:
                figure = new Rook();
                break;
            case 3:
                figure = new Knight();
                break;
            case 4:
                figure = new Bishop();
                break;
            case 5:
                figure = new King();
                break;
            case 6:
                figure = new Queen();
                break;
            case 7:
                return;
        }


        do {
            System.out.println("Введите первую координату в формате столбец строка (e1):");
            userInput = scanner.next();
            if (new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1))).row == -1) {
                System.out.println("Неверно введена координата");
            }
        } while (new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1))).row == -1);
        Position from = new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1)));


        do {
            System.out.println("Введите вторую координату в формате столбец строка (e1):");
            userInput = scanner.next();
            if (new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1))).row == -1) {
                System.out.println("Неверно введена координата");
            }
        } while (new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1))).row == -1);
        Position to = new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1)));

        if (figure.isRightMove(from, to)) {
            System.out.println("Ход верный!");
        } else System.out.println("Ход неверный!");
    }


}
