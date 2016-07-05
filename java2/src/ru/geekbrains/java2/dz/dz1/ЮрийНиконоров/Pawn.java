package ru.geekbrains.java2.dz.dz1.ЮрийНиконоров;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public class Pawn extends Figure implements Chessmen {
    private String name;
    private int X;
    private int Y;
    private boolean isWhiteFigure;
    private int turn;
    private char image;
    private boolean isDead;

    public Pawn(int x, int y, boolean isWhiteFigure) {
        X = x;
        Y = y;
        turn = 0;
        isDead = false;
        this.isWhiteFigure = isWhiteFigure;
        if (this.isWhiteFigure) image = '♙'; else image = '♟';
        name = "Пешка";
    }

    public String getName() {
        return name;
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

    public char getImage() {
        return image;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    @Override
    public boolean isMoveTo(int xMove, int yMove, Chessboard cb) {
        //  константа определяет направление хода для пешек, т.к. пешки ходить назад не умеют
        int yUp;
        if (isWhiteFigure) yUp = 1; else yUp = -1;

        // проверяем ход на один шаг вперёд
        if (xMove == X & yMove == Y + yUp & cb.getFigure(X, Y+yUp)==null) return true;

        // проверяем, если пешка ходит первый раз, то она может сделать шаг на две клетки
        if (turn == 0 && xMove == X && yMove == Y + yUp * 2 &
                cb.getFigure(X, Y+yUp)==null &
                cb.getFigure(X, Y+yUp*2)==null) return true;
        // дописать проверку на ход по диагонали для съедания противника

        return false;
    }
}
