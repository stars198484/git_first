package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Абстрактный класс, реализующий интерфейс ChessFigure

public abstract class AbstractFigure implements ChessFigure{

    //Применяться фактически будет только у пешки
    boolean isWhite = true;
    String name = "";

    public AbstractFigure(boolean isWhite) {
        this.isWhite = isWhite;
        this.name = setName(isWhite);
    }

    public String getName() {
        return name;
    }

    public ChessCoordinate getCoordinateDelta(ChessCoordinate from, ChessCoordinate to) {
        return new ChessCoordinate(to.x - from.x, to.y - from.y);
    }

    private String setName(boolean isWhite) {
        if(isWhite) return "Бел";
        else return "Чёрн";
    }

}


