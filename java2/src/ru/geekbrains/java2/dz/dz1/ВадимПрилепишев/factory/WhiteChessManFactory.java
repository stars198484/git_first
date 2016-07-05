package ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.factory;

import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.chessfigure.*;
import ru.geekbrains.java2.dz.dz1.ВадимПрилепишев.gameinterface.*;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class WhiteChessManFactory implements ChessManFactory{

    public ChessMan createChess(String position){
        Pawn pawn;
        Bishop bishop;
        Knight knight;
        Officer officer;
        Queen queen;
        King king;

         switch(position){
             case "a2":
                 pawn = new Pawn(position);
                 return pawn;
             case "b2":
                 pawn = new Pawn(position);
                 return pawn;
             case "c2":
                 pawn = new Pawn(position);
                 return pawn;
             case "d2":
                 pawn = new Pawn(position);
                 return pawn;
             case "e2":
                 pawn = new Pawn(position);
                 return pawn;
             case "f2":
                 pawn = new Pawn(position);
                 return pawn;
             case "g2":
                 pawn = new Pawn(position);
                 return pawn;
             case "h2":
                 pawn = new Pawn(position);
                 return pawn;
             case "a1":
                 bishop = new Bishop(position);
                 return bishop;
             case "h1":
                 bishop = new Bishop(position);
                 return bishop;
             case "b1":
                 knight = new Knight(position);
                 return knight;
             case "g1":
                 knight = new Knight(position);
                 return knight;
             case "c1":
                 officer = new Officer(position);
                 return officer;
             case "f1":
                 officer = new Officer(position);
                 return officer;
             case "e1":
                 queen = new Queen(position);
                 return queen;
             case "d1":
                 king = new King(position);
                 return king;

         }

        return  null;
    }

}
