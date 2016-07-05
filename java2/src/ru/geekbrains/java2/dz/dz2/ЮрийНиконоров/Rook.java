package ru.geekbrains.java2.dz.dz2.ЮрийНиконоров;

/**
 * Created by YurokVRS on 08.06.2016.
 */
public class Rook extends Figure implements Chessmen {
    private String name;
    private int X;
    private int Y;
    private boolean isWhiteFigure;
    private int turn;
    private char image;
    private boolean isDead;

    public Rook(int x, int y, boolean isWhiteFigure) {
        X = x;
        Y = y;
        turn = 0;
        isDead = false;
        this.isWhiteFigure = isWhiteFigure;
        if (this.isWhiteFigure) image = '♖'; else image = '♜';
        name = "Ладья";
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
    public char getImage() {
        return image;
    }

    @Override
    public boolean isMoveTo(int xMove, int yMove, Chessboard cb) {

        //Проверяем что координаты по диагонале
        if (xMove == X & yMove == Y) return false;
        if (xMove != X & yMove != Y) return false;

        //Проверим что на клетке нет союзника, кроме первого хода Ладьи и Короля, тогда можно сделать рокировку
        if (cb.getFigure(xMove,yMove)!=null) {
            if (cb.getFigure(xMove, yMove).isWhiteFigure() == this.isWhiteFigure &&
                    !cb.getFigure(xMove, yMove).getName().equals("Король")) return false;
            if (cb.getFigure(xMove, yMove).getName().equals("Король") &
                    cb.getFigure(xMove, yMove).isWhiteFigure() == this.isWhiteFigure)
                if (cb.getFigure(xMove, yMove).getTurn() > 0 |
                        cb.getFigure(X, Y).getTurn() > 0) return false;
        }

        //Проверяем, что до точки назначения проход свободен
        int xRight = 0;
        int yUp = 0;
        int z = 0;

        if (xMove==X & Y > yMove) {yUp = -1; z = Y - yMove;}
        if (xMove==X & Y < yMove) {yUp = 1; z = yMove - Y;}
        if (yMove==Y & X > xMove) {xRight = -1; z = X - xMove;}
        if (yMove==Y & X < xMove) {xRight = 1; z = xMove - X;}

        for (int i = 1; i < z; i++) {
            if (cb.getFigure(X + xRight * i, Y + yUp * i) != null) return false;
        }
        return true;
    }
}
