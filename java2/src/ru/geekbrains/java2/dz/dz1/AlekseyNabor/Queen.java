package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class Queen extends Figure implements ChessFigure {
    final String NAME = "ферзь";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            return (
                    (Math.abs(getCurrentPositionX() - getDestinationPosX()) == Math.abs(getCurrentPositionY() - getDestinationPosY())) ||
                    (((getDestinationPosY() == getCurrentPositionY()) || (getDestinationPosX() == getCurrentPositionX())) &&
                            ((getCurrentPositionX() == getDestinationPosX()) || (getCurrentPositionY() == getDestinationPosY())))
            );

        }
        return false;
    }
}
