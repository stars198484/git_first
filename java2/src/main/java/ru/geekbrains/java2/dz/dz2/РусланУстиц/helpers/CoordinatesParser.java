package ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidLineException;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class CoordinatesParser {

    private static final int COORDINATE_LENGTH = 2;

    public static String parseFromCoordinate(final String line) throws InvalidLineException {
        if (!isReadableLine(line))
            throw new InvalidLineException();
        return line.substring(0, COORDINATE_LENGTH);
    }

    public static String parseToCoordinate(final String line) throws InvalidLineException {
        if (!isReadableLine(line))
            throw new InvalidLineException();
        return line.substring(COORDINATE_LENGTH + 1, COORDINATE_LENGTH * 2 + 1);

    }

    public static int convertXtoInt(String coordinate) throws InvalidCoordinateException {
        if (!isReadableCoordinate(coordinate))
            throw new InvalidCoordinateException();

        final String sX = coordinate.substring(0, 1);
        int x = 0;

        char tmp = 'a';
        for (int i = 0; i < ChessField.getFieldSize(); i++) {
            if (sX.charAt(0) == tmp + i) {
                x = i;
                break;
            }
        }
        return x;
    }

    public static int convertYtoInt(String coordinate) throws InvalidCoordinateException {
        if (!isReadableCoordinate(coordinate))
            throw new InvalidCoordinateException();

        String sY = coordinate.substring(1, 2);
        int y = ChessField.getFieldSize() - Integer.parseInt(sY);
        if (y >= ChessField.getFieldSize())
            System.out.println("CoordinateParser Error: Wrong Y coordinate");
        return y;
    }

    public static String convertToString(int x, int y) {
        String sX = "";
        String sY = String.valueOf(y + 1);

        char tmp = 'a';
        for (int i = 0; i < ChessField.getFieldSize(); i++) {
            if (x == i) {
                sX = String.valueOf(tmp);
                break;
            }
            tmp++;
        }
        return sX + sY;
    }

    private static boolean isReadableLine(final String line) {
        if (line.length() < COORDINATE_LENGTH * 2 + 1) {
            System.out.println("CoordinateParser Error: Line is too short");
            return false;
        } else if (line.length() > COORDINATE_LENGTH * 2 + 1) {
            System.out.println("CoordinateParser Error: Line is too long");
            return false;
        }
        return true;
    }

    private static boolean isReadableCoordinate(final String coordinate) {
        if (coordinate.length() == COORDINATE_LENGTH)
            return true;
        System.out.println("CoordinateParser Error: Coordinate is wrong");
        return false;
    }
}
