package ru.geekbrains.java1.dz.dz7.МамаевИгорь;

public abstract class Player {
    private GameField gf;
    public GameField getField() { return gf; };
    public Player() {
        gf = new GameField();
    }
    public abstract void turn(GameField fl);
}