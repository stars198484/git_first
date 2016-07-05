package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.chessfigure;

import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.ChessBoard;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameabstractclass.ChessManAbstract;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameinterface.ChessMan;

/**
 * Created by Prilepishev Vadim on 07.06.2016.
 */
public class Pawn extends ChessManAbstract implements ChessMan {

    public Pawn(String startPosition){
        this.startPosition = startPosition;
        this.currentPosition = startPosition;
        this.chessName = 'П';
        ChessBoard.getInstance().setCurrentPosition(currentPosition,chessName);
    }

    @Override
    public String getCurrentPosition() {
        return this.currentPosition;
    }

    @Override
    public void isRightMove(String from, String to) {
        //если это не вертикаль данной пешки
        if(to.charAt(0) != this.currentPosition.charAt(0)){
            System.out.println("Ход в " + to + " невозможен");
        }

        //если это первый ход для пешки и поле пустое, ходим на один или два шага, для белых пешок
        if(from.equals(startPosition) && startPosition.charAt(1) == '2') {
            if ((to.charAt(1) == '3' || to.charAt(1) == '4') && (ChessBoard.getInstance().fieldIsEmpty(to))) {
                this.currentPosition = to;
                ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                for (int i = 0; i < ChessBoard.getInstance().chessBoard.length; i++) {
                    if (ChessBoard.getInstance().chessBoard[i].getFieldId().equals(from)) {
                        ChessBoard.getInstance().chessBoard[i].setContent(ChessBoard.getInstance().chessBoard[i].getColor());
                    }
                }
                System.out.println("Ход произошел, с " + from + " на " + to);
            }
        }

        //если это первый ход для пешки и поле пустое, ходим на один или два шага, для черных пешок
        if(from.equals(startPosition) && startPosition.charAt(1) == '7') {
            if ((to.charAt(1) == '6' || to.charAt(1) == '5') && (ChessBoard.getInstance().fieldIsEmpty(to))) {
                this.currentPosition = to;
                ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                for (int i = 0; i < ChessBoard.getInstance().chessBoard.length; i++) {
                    if (ChessBoard.getInstance().chessBoard[i].getFieldId().equals(from)) {
                        ChessBoard.getInstance().chessBoard[i].setContent(ChessBoard.getInstance().chessBoard[i].getColor());
                    }
                }
                System.out.println("Ход произошел, с " + from + " на " + to);
            }
        }

        //если ход пещкой идет не со стартовой позиции
        if(!from.equals(startPosition)){
            for(int i = 0; i < ChessBoard.getInstance().chessBoard.length;i++){
                if((ChessBoard.getInstance().chessBoard[i].getFieldId().equals(from)) && (ChessBoard.getInstance().chessBoard[i].getContent() == 'П')){
                    this.currentPosition = to;
                    ChessBoard.getInstance().setCurrentPosition(currentPosition,chessName);
                    ChessBoard.getInstance().chessBoard[i].setContent(ChessBoard.getInstance().chessBoard[i].getColor());
                }
            }
        }
    }
}
