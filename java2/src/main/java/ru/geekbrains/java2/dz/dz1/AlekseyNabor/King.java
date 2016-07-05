package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class King extends Figure implements ChessFigure {
    final String NAME = "король";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            if((Math.abs(getDestinationPosX() - getCurrentPositionX()) == 1) ||
                    (Math.abs(getDestinationPosY() - getCurrentPositionY()) == 1)) {
            return (
                    ((Math.abs(getCurrentPositionX() - getDestinationPosX()) == 0) && (Math.abs(getCurrentPositionY() - getDestinationPosY()) == 1)) ||
                            ((Math.abs(getCurrentPositionY() - getDestinationPosY()) == 0) && (Math.abs(getCurrentPositionX() - getDestinationPosX()) == 1)) ||
                            (Math.abs(getCurrentPositionX() - getDestinationPosX()) == Math.abs(getCurrentPositionY() - getDestinationPosY()))
            );

        }
        }
        return false;
    }
}
