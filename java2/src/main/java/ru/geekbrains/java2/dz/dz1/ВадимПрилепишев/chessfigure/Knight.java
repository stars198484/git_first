package ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.chessfigure;

import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.ChessBoard;
import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.gameabstractclass.ChessManAbstract;
import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.gameinterface.ChessMan;

/**
 * Created by Prilepishev Vadim on 09.06.2016.
 */
public class Knight extends ChessManAbstract implements ChessMan {

    public Knight(String startPosition){
        this.startPosition = startPosition;
        this.currentPosition = startPosition;
        this.chessName = 'Л';
        ChessBoard.getInstance().setCurrentPosition(currentPosition,chessName);
    }

    @Override
    public String getCurrentPosition() {
        return this.currentPosition;
    }

    @Override
    public void isRightMove(String from, String to) {
        //первый ход,белые кони
        if(startPosition.equals(currentPosition)){
            if(from.equals("b1")){
                switch(to){
                    case "a3":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    case "c3":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    default:
                        System.out.println("Ход в " + to + " невозможен");
                }
            }

            if(from.equals("g1")){
                switch(to){
                    case "h3":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    case "f3":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    default:
                        System.out.println("Ход в " + to + " невозможен");
                }
            }
        }

        //первый ход,черные кони

        if(startPosition.equals(currentPosition)){
            if(from.equals("b8")){
                switch(to){
                    case "a6":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    case "c6":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    default:
                        System.out.println("Ход в " + to + " невозможен");
                }
            }

            if(from.equals("g8")){
                switch(to){
                    case "h6":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    case "f6":
                        this.currentPosition = to;
                        ChessBoard.getInstance().setCurrentPosition(currentPosition, chessName);
                        fieldRewrite(from);
                        System.out.println("Ход произошел, с " + from + " на " + to);
                        break;
                    default:
                        System.out.println("Ход в " + to + " невозможен");
                }
            }
        }

    }

    private void fieldRewrite(String from){
        for (int i = 0; i < ChessBoard.getInstance().chessBoard.length; i++) {
            if (ChessBoard.getInstance().chessBoard[i].getFieldId().equals(from)) {
                ChessBoard.getInstance().chessBoard[i].setContent(ChessBoard.getInstance().chessBoard[i].getColor());
            }
        }
    }

}
