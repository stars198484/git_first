package ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions;

/**
 * Created by xcyxoux on 11.06.16.
 */
public class WrongFigureException extends PlayerException {
    @Override
    public String toString() {
        return super.toString() + " Такой фигуры не существует!";
    }
}
