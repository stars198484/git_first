package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);
    Figure figure = null;
    boolean closeProgram=false;

    public Menu() {
        choiceFigureMenu();
        if (closeProgram) return;

        Position from = null, to = null;
        boolean isSetPosition = false;

        do {
            try {
                from = setPosition("СТАРТОВАЯ");
                isSetPosition = true;
            } catch (WrongPositionException | NumberFormatException e) {
                System.out.println("Неверно задана координата");
            }
        } while (!isSetPosition);

        isSetPosition = false;
        do {
            try {
                to = setPosition("КОНЕЧНАЯ");
                isSetPosition = true;
            } catch (WrongPositionException | NumberFormatException e) {
                System.out.println("Неверно задана координата");
            }
        } while (!isSetPosition);


        if (figure.isRightMove(from, to)) {
            System.out.println("Ход верный!");
        } else System.out.println("Ход неверный!");
    }

    private void choiceFigureMenu() {

        int choice;

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
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                choice = 0;
            }
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
                closeProgram=true;
                break;
        }
    }

    private Position setPosition(String name) throws WrongPositionException {
        Position position;
        String userInput;
        System.out.println("Введите координату в формате столбец строка (e1) для позиции " + name + ":");
        userInput = scanner.next();
        position = new Position(userInput.charAt(0), Integer.parseInt(userInput.substring(1)));
        return position;

    }
}
