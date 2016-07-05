package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
 */
public abstract class Player {
    private GameField gameField;

    public Player() {
        gameField = new GameField();
    }

    public GameField getGameField() {
        return gameField;
    }

    public abstract void turn(GameField gameField);
}
