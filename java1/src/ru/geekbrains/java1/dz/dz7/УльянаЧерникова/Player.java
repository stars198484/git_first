package ru.geekbrains.java1.dz.dz7.УльянаЧерникова;

/**
 * Created by Uliana on 30.05.2016.
 */
public  abstract class Player {
    private Game gf;
    public Game getField() {return gf;};
    public Player(){
        gf=new Game();
    }
    public abstract void turn (Game f1);
}
