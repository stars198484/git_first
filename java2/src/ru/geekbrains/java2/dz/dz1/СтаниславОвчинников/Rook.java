package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Rook implements Chessman {
    int attitudeFromI, attitudeFromJ, attitudeToI, attitudeToJ;
    @Override
    public boolean isRightMove(String from, String to) {
        for (int i = 0; i < cb.thecells.length; i++) {
            for (int j = 0; j < cb.thecells.length; j++) {
                if (cb.thecells[i][j].equals(from)) {
                    attitudeFromI = i;
                    attitudeFromJ = j;
                }
                if (cb.thecells[i][j].equals(to)) {
                    attitudeToI = i;
                    attitudeToJ = j;
                }
            }
        }
        for (int i = attitudeFromI; i < cb.thecells.length; i++) {
            if (cb.thecells[i][attitudeFromJ].equals(to))
                return true;
        }
        for (int i = attitudeFromJ; i < cb.thecells.length; i++) {
            if (cb.thecells[attitudeFromI][i].equals(to))
                return true;
        }
        for (int i = attitudeFromI; i > -1; i--) {
            if (cb.thecells[i][attitudeFromJ].equals(to))
                return true;
        }
        for (int i = attitudeFromJ; i > -1; i--) {
            if (cb.thecells[attitudeFromI][i].equals(to))
                return true;
        }
        return false;
    }
}
