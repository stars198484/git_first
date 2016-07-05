package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class Rook extends Figure implements ChessFigure {
    final String NAME = "ладья";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            return (
                    (((getDestinationPosY() == getCurrentPositionY()) || (getDestinationPosX() == getCurrentPositionX())) &&
                            ((getCurrentPositionX() == getDestinationPosX()) || (getCurrentPositionY() == getDestinationPosY())))
            );

        }
        return false;
    }
}
