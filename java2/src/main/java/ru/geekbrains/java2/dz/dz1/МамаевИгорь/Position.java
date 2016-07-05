package ru.geekbrains.java2.dz.dz1.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Position {
    protected char column;
    protected int row;

// В случае получения некорректных значений column, row значению row присваивается -1
    public Position(char column, int row) {
        if (column >= 'a' && column <= 'h' && row > 0 && row < 9) {
            this.column = column;
            this.row = row;
        } else this.row = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            return ((column == ((Position) obj).column) && (row == ((Position) obj).row));
        }
        return false;
    }
}
