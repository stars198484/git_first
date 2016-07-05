package ru.geekbrains.java1.dz.dz7.ВавилинГерман;

import java.util.Random;

/**
 * Created by gta5 on 26.05.2016.
 */
public class AIPlayer extends Player {
    String name;
    private Random rand = new Random();

    public AIPlayer() {
        super();
    }
    public AIPlayer(String name) {
        super();
        this.name = name;
    }
    @Override
    public void turn(GameField gameField, boolean isFieldVisible) {
        int x,y;
        do {
            System.out.println("Ходит " + this.getName());
            System.out.println("Ход - " + Main.count);
            do {
                x = rand.nextInt(10);
                y = rand.nextInt(10);
            } while ((!isXYCorrect(x, y)) || gameField.getPoint(x, y) == 'X');

            gameField.strike(x, y);
            Main.count++;
            gameField.printField(isFieldVisible);
        } while (gameField.getPoint(x, y) == 'X' & !gameField.isDefeated());

    }
    private boolean isXYCorrect (int x, int y) {
        if((x < 0) || (x > 9) || (y < 0) ||(y > 9)) return false;
        return true;
    }

    public String getName() {return this.name;}




}
