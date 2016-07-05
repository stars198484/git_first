package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public abstract class Figure implements ChessFigure {

    private int currentPositionX = 0;
    private int currentPositionY = 0;
    private int destinationPosX = 0;
    private int destinationPosY = 0;

    public int getCurrentPositionY() {
        return currentPositionY;
    }

    public void setCurrentPositionY(int currentPositionY) {
        this.currentPositionY = currentPositionY;
    }

    public int getCurrentPositionX() {
        return currentPositionX;
    }

    public void setCurrentPositionX(int currentPositionX) {
        this.currentPositionX = currentPositionX;
    }

    public void setCurrentPositionXY(int currentPositionX,int currentPositionY) {
        this.currentPositionX = currentPositionX;
        this.currentPositionY = currentPositionY;
    }

    public int getDestinationPosX() {
        return destinationPosX;
    }

    public void setDestinationPosX(int destinationPosX) {
        this.destinationPosX = destinationPosX;
    }

    public int getDestinationPosY() {
        return destinationPosY;
    }

    public void setDestinationPosY(int destinationPosY) {
        this.destinationPosY = destinationPosY;
    }

    public void setDestinationPosXY(int destinationPosX, int destinationPosY) {
        this.destinationPosX = destinationPosX;
        this.destinationPosY = destinationPosY;
    }

    public int getNumCoordinate(String input) {
        switch (input.substring(0,1)) {
            case "a" : return 1;
            case "b" : return 2;
            case "c" : return 3;
            case "d" : return 4;
            case "e" : return 5;
            case "f" : return 6;
            case "g" : return 7;
            case "h" : return 8;
        }
        return -1;
    }

    @Override
    public boolean isRightMove(String from, String to) {
        setCurrentPositionXY(getNumCoordinate(from),Integer.parseInt(from.substring(1,2)));
        setDestinationPosXY(getNumCoordinate(to),Integer.parseInt(to.substring(1,2)));

        if ((getCurrentPositionX() >= 1 && getCurrentPositionX() <= 8) &&
                (getCurrentPositionY() >= 1 && getCurrentPositionY() <= 8) &&
                (getDestinationPosX() >= 1 && getDestinationPosX() <= 8) &&
                (getDestinationPosY() >= 1 && getDestinationPosY() <= 8)) {

            return true;

        } else {
            return false;
        }
    }
    }
