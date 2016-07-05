package ru.geekbrains.java2.dz.dz2.ЮрийНиконоров;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public abstract class Figure implements Chessmen {
    private String name;
    private int X;
    private int Y;
    private boolean isWhiteFigure;
    private int turn;
    private char image;
    private boolean isDead;


    public Figure(){
    }
}
