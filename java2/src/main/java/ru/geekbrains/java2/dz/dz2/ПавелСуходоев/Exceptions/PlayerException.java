package ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions;

/**
 * Created by xcyxoux on 11.06.16.
 */
public class PlayerException extends Exception {
    @Override
    public String toString() {
        return "Возникла непредвиденная ситуация после ввода игроком данных.";
    }
}
