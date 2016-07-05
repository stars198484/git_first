package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.factory;

import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.chessfigure.*;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameinterface.ChessManFactory;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameinterface.ChessMan;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class BlackChessManFactory implements ChessManFactory {

    public ChessMan createChess(String position){
        Pawn pawn;
        Bishop bishop;
        Knight knight;
        Officer officer;
        Queen queen;
        King king;

        switch(position){
            case "a7":
                pawn = new Pawn(position);
                return pawn;
            case "b7":
                pawn = new Pawn(position);
                return pawn;
            case "c7":
                pawn = new Pawn(position);
                return pawn;
            case "d7":
                pawn = new Pawn(position);
                return pawn;
            case "e7":
                pawn = new Pawn(position);
                return pawn;
            case "f7":
                pawn = new Pawn(position);
                return pawn;
            case "g7":
                pawn = new Pawn(position);
                return pawn;
            case "h7":
                pawn = new Pawn(position);
                return pawn;
            case "a8":
                bishop = new Bishop(position);
                return bishop;
            case "h8":
                bishop = new Bishop(position);
                return bishop;
            case "b8":
                knight = new Knight(position);
                return knight;
            case "g8":
                knight = new Knight(position);
                return knight;
            case "c8":
                officer = new Officer(position);
                return officer;
            case "f8":
                officer = new Officer(position);
                return officer;
            case "e8":
                queen = new Queen(position);
                return queen;
            case "d8":
                king = new King(position);
                return king;

        }

        return  null;
    }

}
