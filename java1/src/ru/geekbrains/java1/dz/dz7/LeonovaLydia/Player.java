package ru.geekbrains.java1.dz.dz7.LeonovaLydia;

/**
 * Created by LiLeo on 28.05.2016.
 */
public abstract class Player {

    private String name;
    private GameField gf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameField getField() {
        return gf;
    }

    public Player() {
        gf = new GameField();
    }

    public Player(String name) {
        this.name = name;
        gf = new GameField();
    }

    public abstract void turn(GameField fl, String name, Player otherPlayer);
}

