package ru.geekbrains.java1.dz.dz7.ВавилинГерман;
/**
 * Created by gta5 on 26.05.2016.
 */
public abstract class Player {
    private String name;
    private GameField gameField;

    public Player() {
        gameField = new GameField();
    }

    public GameField getGameField() {
        return this.gameField;
    }
    public abstract void turn(GameField gameField, boolean isFieldVisible);

    public String getName() {return name;}




}
