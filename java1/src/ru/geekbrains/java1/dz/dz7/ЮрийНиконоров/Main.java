package ru.geekbrains.java1.dz.dz7.ЮрийНиконоров;

import java.util.Scanner;

/**
 * Created by YurokVRS on 28.05.2016.
 */
public class Main {
    private final static int timePause = 6000;

    public static void main(String[] args) {
        Player hp1 = new HumanPlayer();
        Player hp2 = new HumanPlayer();
        Player aip1 = new AIPlayer();
        Player aip2 = new AIPlayer();

        int versus;
        Scanner sc = new Scanner(System.in);

        // Игровое меню
        System.out.println("Игра 'Морской бой'\nВыберите игроков:\n1. Человек против компьютера\n" +
                "2. Человек против человека\n3. Компьютер против компьютера");

        do {
            System.out.println("Введите число от 1 до 3:");
            versus = sc.nextInt();
        } while (versus < 1 && versus > 3);
        switch (versus){
            case 1:
                if (versus1(hp1,aip1) == 1) System.out.println("Победил человек");
                else System.out.println("Победил компьютер");
                break;
            case 2:
                if (versus2(hp1,hp2) == 1) System.out.println("Победил человек 1");
                else System.out.println("Победил человек 2");
                break;
            case 3:
                if (versus3(aip1,aip2) == 1) System.out.println("Победил компьютер 1");
                else System.out.println("Победил компьютер 2");
                break;
        }





    }
    public static int versus1(Player p1, Player p2){
        System.out.println("Ваше море с короблями:");
        p1.getGameField().printField(true);

        boolean returnTurn;
        while (true){
            do{
                System.out.println("Море противника:");
                p2.getGameField().printField(false);
                returnTurn = p1.turn(p2.getGameField(),"человек");
                if (p2.getGameField().isDefeated()) return 1;
                if (returnTurn) System.out.println("Человек ходит ещё раз!");
            }while(returnTurn);
            do{
                returnTurn = p2.turn(p1.getGameField(),"компьютер");
                p1.getGameField().printField(true);
                if (p1.getGameField().isDefeated()) return 2;
                if (returnTurn) System.out.println("Компьютер ходит ещё раз!");
            }while(returnTurn);
        }
    }

    public static int versus2(Player p1, Player p2){

        while (true){
            boolean returnTurn;
            do{
                System.out.println("Море человека 2:");
                p2.getGameField().printField(false);
                returnTurn = p1.turn(p2.getGameField(),"человек 1");
                if (p2.getGameField().isDefeated()) return 1;
                if (returnTurn) System.out.println("Человек 1 ходит ещё раз!");
            }while(returnTurn);

            do{
                System.out.println("Море человека 1:");
                p1.getGameField().printField(false);
                returnTurn = p2.turn(p2.getGameField(),"человек 2");
                if (p1.getGameField().isDefeated()) return 1;
                if (returnTurn) System.out.println("Человек 2 ходит ещё раз!");
            }while(returnTurn);


        }
    }

    public static int versus3(Player p1, Player p2){
        System.out.println("Море с короблями компьютера 1:");
        p1.getGameField().printField(true);
        System.out.println("Море с короблями компьютера 2:");
        p2.getGameField().printField(true);
        boolean returnTurn;
        while (true){
            pause(timePause);
            do{
                returnTurn = p1.turn(p2.getGameField(),"компьютер 1");
                p2.getGameField().printField(true);
                if (p2.getGameField().isDefeated()) return 1;
                if (returnTurn) System.out.println("Компьютер 1 ходит ещё раз!");
            }while(returnTurn);

            pause(timePause);
            do {
                returnTurn = p2.turn(p1.getGameField(), "компьютер 2");
                p1.getGameField().printField(true);
                if (p1.getGameField().isDefeated()) return 2;
                if (returnTurn) System.out.println("Компьютер 2 ходит ещё раз!");
            }while(returnTurn);
        }
    }
    public static void pause(int sleep){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
