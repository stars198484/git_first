package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев;

import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.factory.FieldFactory;

/**
 * Created by Prilepishev Vadim on 07.06.2016.
 */
public class ChessBoard {

    private static ChessBoard instance = new ChessBoard();

    public static ChessBoard getInstance(){
        return instance;
    }

    public Field[] chessBoard = new Field[64];
    FieldFactory fieldFactory = new FieldFactory();

    public char[] abc = new char[]{'a','b','c','d','e','f','g','h'};
    private char[] digi = new char[]{'1', '2', '3', '4', '5', '6', '7', '8'};

    public void setCurrentPosition(String position,char chessName){
         for(int i = 0; i < chessBoard.length;i++){
             if(chessBoard[i].getFieldId().equals(position)){
                 chessBoard[i].setContent(chessName);
             }
         }
    }

    private ChessBoard(){
        int counter = 0;
        for(int i = 0; i < digi.length;i++){
           for(int j = 0; j < abc.length;j++){
               chessBoard[counter] = fieldFactory.createField(abc[j],digi[i]);
               counter++;
           }
        }
    }

    protected void printBoard(){
        int counter = 0;
        int rowCounter = 8;

        for(int i = abc.length-1; i >= 0; i--){
            if(i == abc.length-1) System.out.print(abc[i]);
            else System.out.print(" " + abc[i]);
        }
        System.out.println();

       for(int i = chessBoard.length-1; i >= 0 ;i--){
           System.out.print(chessBoard[i].getContent());
           System.out.print("|");
           counter++;
           if(counter == digi.length) {
               System.out.print("  " + rowCounter);
               rowCounter--;
               System.out.println("");
               counter = 0;
           }
       }
    }

    public boolean fieldIsEmpty(String field){
        for(int i = 0; i < chessBoard.length;i++){
            if(chessBoard[i].getFieldId() == field){
                if(chessBoard[i].getContent() == chessBoard[i].getColor()) return true;
                else return false;
            }
        }

        return true;
    }

}
