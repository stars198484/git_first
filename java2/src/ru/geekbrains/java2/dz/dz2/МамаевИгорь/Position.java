package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Position {
    protected char column;
    protected int row;

    public Position(char column, int row) throws WrongPositionException {
        if (!(column >= 'a' && column <= 'h' && row > 0 && row < 9)) throw new WrongPositionException();
        this.column = column;
        this.row = row;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            return ((column == ((Position) obj).column) && (row == ((Position) obj).row));
        }
        return false;
    }
}
