package ru.geekbrains.java2.dz.dz1.РусланУстиц.helpers;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class CoordinatesParser {

    public static String parseFromCoordinate(String line) {
        return line.substring(0, 2);
    }

    public static String parseToCoordinate(String line) {
        return line.substring(3, 5);
    }
}
