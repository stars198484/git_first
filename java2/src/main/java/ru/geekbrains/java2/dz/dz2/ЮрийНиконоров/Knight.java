package ru.geekbrains.java2.dz.dz2.ЮрийНиконоров;

/**
 * Created by YurokVRS on 08.06.2016.
 */
public class Knight extends Figure implements Chessmen {
    private String name;
    private int X;
    private int Y;
    private boolean isWhiteFigure;
    private int turn;
    private char image;
    private boolean isDead;

    public Knight(int x, int y, boolean isWhiteFigure) {
        X = x;
        Y = y;
        turn = 0;
        isDead = false;
        this.isWhiteFigure = isWhiteFigure;
        if (this.isWhiteFigure) image = '♘'; else image = '♞';
        name = "Конь";
    }
    public int getTurn() {
        return turn;
    }
    public String getName() {
        return name;
    }

    public boolean isWhiteFigure() {
        return isWhiteFigure;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    @Override
    public boolean isMoveTo(int xMove, int yMove, Chessboard cb) {
        return false;
    }

    @Override
    public char getImage() {
        return image;
    }
}
