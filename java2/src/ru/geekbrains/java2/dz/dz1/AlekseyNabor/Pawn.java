package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class Pawn extends Figure implements ChessFigure{
    final String NAME = "пешка";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            return ((getCurrentPositionX() == getDestinationPosX()) && (getCurrentPositionY() == getDestinationPosY()-1));

        }
        return false;
    }
}
