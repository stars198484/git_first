package ru.geekbrains.java2.dz.dz1.YuryLukas;

import ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces.Figure;

/**
 * Created by yurok on 9.06.16.
 */
public class Pawn implements Figure {
    private final String horizontal = "abcdefgh";
    private final int HORIZONTAL = 0;
    private final int VERTICAL = 1;
    private String[] currentCoord;
    private String[] toCoord;
    private int color;


    public Pawn(String coord, int color) {
        currentCoord = separateCoord(coord);
        this.color = color;
    }

    @Override
    public boolean move(String coord) {
        return false;
    }

    @Override
    public boolean isRightMove(String from, String to, ChessBoard board) {
        this.currentCoord = separateCoord(from);
        this.toCoord = separateCoord(to);
        int maxRow = 0;

        if (!board.isOut(horizontal.lastIndexOf(toCoord[HORIZONTAL]), Integer.valueOf(toCoord[VERTICAL]))) {
            return false;
        }

        currentCoord = separateCoord(from);
        toCoord = separateCoord(to);

        if (color == Figure.WHITE) {
            if (currentCoord[0].equals("2")) {
                maxRow = 4;
            } else {
                maxRow = Integer.valueOf(currentCoord[0]) + 1;
                if(maxRow>board.MAX_LENGTH) return false;
            }

            if (Integer.parseInt(toCoord[0]) <= maxRow) {
                return true;
            }
        }

        if (color == Figure.BLACK) {
            if (currentCoord[0].equals("7")) {
                maxRow = 5;
            }
            else
            {
                maxRow = Integer.valueOf(currentCoord[0]) - 1;
                if(maxRow<1) return false;
            }

            if (Integer.parseInt(toCoord[0]) >= maxRow) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String getFigureName() {
        return null;
    }

    private String[] separateCoord(String coord) {
        String[] result = new String[2];
        result[0] = String.valueOf(coord.charAt(HORIZONTAL));
        result[1] = String.valueOf(coord.charAt(VERTICAL));
        return result;
    }
}
