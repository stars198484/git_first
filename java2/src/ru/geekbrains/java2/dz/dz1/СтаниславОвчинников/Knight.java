package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Knight implements Chessman {
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
        if ((attitudeFromI == attitudeToI + 1 || attitudeFromI == attitudeToI - 1)||
                (attitudeFromJ == attitudeToJ + 1 || attitudeFromJ == attitudeToJ - 1))
            return true;
        return false;
    }

}
