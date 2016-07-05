package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class Knight extends Figure implements ChessFigure {
    final String NAME = "конь";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            return (((getDestinationPosX() == (getCurrentPositionX()+1)) && (getDestinationPosY() == (getCurrentPositionY()+2))) ||
                    (getDestinationPosX() == (getCurrentPositionX()+2)) == (getDestinationPosY() == (getCurrentPositionY()+1)));

        }
        return false;
    }
}
