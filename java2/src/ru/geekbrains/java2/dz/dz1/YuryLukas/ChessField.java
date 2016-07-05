package ru.geekbrains.java2.dz.dz1.YuryLukas;

import ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces.Field;
import ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces.Figure;

/**
 * Created by yurok on 9.06.16.
 */
public class ChessField implements Field {

    private int color;

    private Figure figure=null;
    private char horizontalCoord;
    private Integer verticalCoord;

    public ChessField(int color) {
        this.color = color;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Figure getContent() {
        return figure;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String getName() {
        return this.verticalCoord.toString() + this.horizontalCoord;
    }

    public char getHorizontalCoord() {
        return horizontalCoord;
    }

    public void setHorizontalCoord(char horizontalCoord) {
        this.horizontalCoord = horizontalCoord;
    }

    public int getVerticalCoord() {
        return verticalCoord;
    }

    public void setVerticalCoord(int verticalCoord) {
        this.verticalCoord = verticalCoord;
    }

}
