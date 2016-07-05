package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class King implements Chessman {
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
        for (int i = attitudeFromI - 1; i <= attitudeFromI + 1; i++) {
            for (int j = attitudeFromJ - 1; j <= attitudeFromJ + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (cb.thecells[i][j].equals(to)) return true;
            }
        }
        return false;
    }
}
