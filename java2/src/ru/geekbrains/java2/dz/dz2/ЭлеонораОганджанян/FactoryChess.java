package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 11.06.2016.
 */
public class FactoryChess {
    public MoveChess factoryChessMetod(int i){
        MoveChess moveChess = null;

        switch (i) {
            case 1: moveChess = new Pawn(); break;
            case 2: moveChess = new Rook(); break;
            case 3: moveChess = new Knight(); break;
            case 4: moveChess = new Bishop(); break;
            case 5: moveChess = new Queen(); break;
            case 6: moveChess = new King(); break;
        }
        return moveChess;
    }
}
