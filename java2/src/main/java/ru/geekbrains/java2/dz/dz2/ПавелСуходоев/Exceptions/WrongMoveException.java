package ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions;

/**
 * Created by xcyxoux on 11.06.16.
 */
public class WrongMoveException extends PlayerException {
    public String toString(String figureName) {
        return super.toString() + " " + figureName + " не может так ходить";
    }
}
