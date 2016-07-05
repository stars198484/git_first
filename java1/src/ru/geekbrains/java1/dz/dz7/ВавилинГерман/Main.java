package ru.geekbrains.java1.dz.dz7.ВавилинГерман;


import java.util.Scanner;

/**
 * Created by gta5 on 28.05.2016.
 */
public class Main {
    public static int count = 1;
    public static void main(String[] args) {

        gameLoop(selectGameType());
    }

    public static int selectGameType() {
        Scanner mode = new Scanner(System.in);
        int result;
        do {
            System.out.println("Выберите режим игры:\n1. Человек - ИИ\n2. Человек - Человек\n3. ИИ - ИИ\n");
            result = mode.nextInt();
        }while (result < 1 | result > 3);
        return result;
    }

    public static void gameLoop(int mode) {
        Player p1;
        Player p2;
        boolean isFieldOneVisible = true;
        boolean isFieldTwoVisible;// = false;
        switch (mode) {
            case 1: {
                p1 = new HumanPlayer("Игрок");
                p2 = new AIPlayer("Компьютер");
                isFieldTwoVisible = false; //установить true для быстрой победы
                break;
            }
            case 2: {
                p1 = new HumanPlayer("Игрок 1");
                p2 = new HumanPlayer("Игрок 2");
                isFieldTwoVisible = true;
                break;
            }
            case 3: {
                p1 = new AIPlayer("Компьютер 1");
                p2 = new AIPlayer("Компьютер 2");
                isFieldTwoVisible = true;
                break;
            }
            default: {
                p1 = new HumanPlayer();
                p2 = new AIPlayer();
                isFieldTwoVisible = false;
            }
        }
        p1.getGameField().printField(true);
        while(true) {
            p1.turn(p2.getGameField(), isFieldTwoVisible);
            if (p2.getGameField().isDefeated()) {
                System.out.println("Победил " + p1.getName());
                break;
            }
            p2.turn(p1.getGameField(), isFieldOneVisible);
            if (p1.getGameField().isDefeated()) {
                System.out.println("Победил " + p2.getName());
                break;
            }
        }
    }
}
