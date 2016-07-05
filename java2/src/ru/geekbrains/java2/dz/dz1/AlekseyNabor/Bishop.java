package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

/**
 * Created by A on 08.06.2016.
 */
public class Bishop extends Figure implements ChessFigure {
    final String NAME = "слон";
    @Override
    public boolean isRightMove(String from, String to) {
        if(super.isRightMove(from,to)) {

            return (Math.abs(getCurrentPositionX() - getDestinationPosX()) == Math.abs(getCurrentPositionY() - getDestinationPosY()));

        }
        return false;
    }
}
