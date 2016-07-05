package ru.geekbrains.java2.dz.dz1.РусланУстиц.helpers;

import ru.geekbrains.java2.dz.dz1.РусланУстиц.ChessField;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class CoordinatesConverter {

    public static int convertXtoInt(String coord) {
        String sX = coord.substring(0, 1);
        int x = 0;

        switch (sX) {
            case "a": x = 0; break;
            case "b": x = 1; break;
            case "c": x = 2; break;
            case "d": x = 3; break;
            case "e": x = 4; break;
            case "f": x = 5; break;
            case "g": x = 6; break;
            case "h": x = 7; break;
            default:
                System.out.println("Warning: Wrong X coordinate");
        }
        return x;
    }

    public static int convertYtoInt(String coord) {
        String sY = coord.substring(1, 2);
        int y = ChessField.getFieldSize() - Integer.parseInt(sY);
        if (y >= ChessField.getFieldSize())
            System.out.println("Warning: Wrong Y coordinate");
        return y;
    }

    public static String convertToString(int x, int y) {
        String sX = "";
        String sY = String.valueOf(y + 1);

        switch (x) {
            case 0: sX = "a"; break;
            case 1: sX = "b"; break;
            case 2: sX = "c"; break;
            case 3: sX = "d"; break;
            case 4: sX = "e"; break;
            case 5: sX = "f"; break;
            case 6: sX = "g"; break;
            case 7: sX = "h"; break;
            default:
                System.out.println("Warning: Wrong X coordinate");
        }

        return sX + sY;
    }
}
