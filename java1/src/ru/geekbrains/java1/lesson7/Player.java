package ru.geekbrains.java1.lesson7;

/**
 * Created by Home-pc on 26.05.2016.
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
