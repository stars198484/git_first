package ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions;

/**
 * Created by xcyxoux on 11.06.16.
 */
public class WrongCoordinateException extends PlayerException {

    @Override
    public String toString() {
        return super.toString() + " Ошибка при вводе координат";
    }
}
