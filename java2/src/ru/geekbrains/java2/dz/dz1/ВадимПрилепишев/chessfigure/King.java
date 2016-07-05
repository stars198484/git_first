package ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.chessfigure;

import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.ChessBoard;
import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.gameabstractclass.ChessManAbstract;
import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.gameinterface.ChessMan;

/**
 * Created by Prilepishev Vadim on 09.06.2016.
 */
public class King extends ChessManAbstract implements ChessMan {

    public King(String startPosition){
        this.startPosition = startPosition;
        this.currentPosition = startPosition;
        this.chessName = 'К';
        ChessBoard.getInstance().setCurrentPosition(currentPosition,chessName);
    }

    @Override
    public String getCurrentPosition() {
        return this.currentPosition;
    }

    @Override
    public void isRightMove(String from, String to) {
        System.out.println("Ход невозможен.");
    }

}
