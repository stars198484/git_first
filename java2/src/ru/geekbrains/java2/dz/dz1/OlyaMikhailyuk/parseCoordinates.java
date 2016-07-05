package ru.geekbrains.java2.level2homework1;

/**
 * Created by Olya on 09.06.2016.
 */
public class parseCoordinates {
    public int parseMethod(String Point, String forCrdt) {
        byte[] Cors = Point.getBytes();

        int Crdt = 0;
        switch (forCrdt) {
            case "x1":
                Crdt = Cors[0] - 97;
                break;
            case "x2":
                Crdt = Cors[0] - 97;
                break;
            case "y1":
                Crdt = Cors[1] - 49;
                break;
            case "y2":
                Crdt = Cors[1] - 49;
                break;
        }
        return Crdt;
    }
}
