package ru.geekbrains.java1.dz.dz3.ИльяФиалковский;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static int winSize = 4, boardSize = 5, turn = 0, playerLastX =0, playerLastY=0;
    public static final int turnToCheck = (winSize*2)-1;
    public static boolean chkTurn, turnAi = true, chkWin = false;
    public static int[][] board = new int[boardSize][boardSize];
    public static Scanner in=new Scanner(System.in);
    public static Random rNext = new Random();

    public static void main(String args[]){
        systemInit();
        do{
            turn++;
            do{
                chkTurn = playerTurn();
            }while(chkTurn==false);
            if(chkWin==true){
                System.out.println("Р’С‹ РїРѕР±РµРґРёР»Рё!");
                turn=999;
                break;
            }
            if (turn>=boardSize*boardSize) break;
            turn++;
            if(turnAi) pcTurnAi(playerLastX,playerLastY);
            else pcTurnNoAi();
            if(chkWin==true){
                System.out.println("Р’С‹ РїСЂРѕРёРіСЂР°Р»Рё!");
                turn=999;
                break;
            }

        }while(turn<boardSize*boardSize);

        if(turn!=999) System.out.println("РќРёС‡СЊСЏ!");
    }

    public static void printBoard(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                if(board[i][j]==0) System.out.print("* ");
                else if(board[i][j]==1) System.out.print("X ");
                else if(board[i][j]==-1) System.out.print("O ");
                else System.out.print("!!!!!!!!ERROR!!!!!!!!!");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean playerTurn(){
        System.out.println("Р’РІРµРґРёС‚Рµ РєРѕРѕСЂРґРёРЅР°С‚С‹ X Y (СЃС‚СЂРѕРєР° Рё СЃС‚РѕР»Р±РµС†; РѕС‚ 1 РґРѕ "+boardSize+") С‡РµСЂРµР· РїСЂРѕР±РµР» РёР»Рё РїРѕСЃС‚СЂРѕС‡РЅРѕ.");
        int a=in.nextInt()-1;
        int b=in.nextInt()-1;
        if(a>-1&&b>-1&&a<boardSize&&b<boardSize&&board[a][b]==0){
            board[a][b]=1;
            printBoard();
            if(turnToCheck<=turn) chkWin(a,b,1);
            if(turnAi) {
                playerLastX = a;
                playerLastY = b;
            }
            return true;
        }
        System.out.print("РћС€РёР±РєР°...");
        return false;
    }

    public static void systemInit(){
        System.out.println("Р’РІРµРґРёС‚Рµ 0 РґР»СЏ РѕС‚РєР»СЋС‡РµРЅРёСЏ Ai, РёР»Рё Р»СЋР±РѕРµ РґСЂСѓРіРѕРµ С‡РёСЃР»Рѕ С‡С‚Рѕ Р±С‹ РµРіРѕ РѕСЃС‚Р°РІРёС‚СЊР–");
        turn = in.nextInt();
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++) board[i][j] = 0;
        }
        if(winSize>boardSize) winSize=boardSize;
        if(turn==0) turnAi=false;
        turn=0;
        String isAiOn="Р’РєР»СЋС‡РµРЅ.";
        if(!turnAi) isAiOn="РћС‚РєР»СЋС‡РµРЅ.";
        System.out.println("РџРѕР»Рµ: "+boardSize+"x"+boardSize+" ; Р”Р»СЏ РїРѕР±РµРґС‹ РІ СЂСЏРґ РЅРµРѕР±С…РѕРґРёРјРѕ Р·Р°РїРѕР»РЅРёС‚СЊ СЏС‡РµРµРє: "+winSize+" РїРѕРґСЂСЏРґ. РСЃРєСѓСЃС‚РІРµРЅРЅС‹Р№ РёРЅС‚РµР»РµРєС‚ "+isAiOn+"\n");
        printBoard();
    }

    public static void pcTurnNoAi(){
        do {
            int a = rNext.nextInt(boardSize);
            int b = rNext.nextInt(boardSize);
            if (board[a][b] == 0) {
                pcTurnFinal(a, b);
                break;
            }
        }while(true);
    }

    public static void pcTurnAi(int a,int b) {
        int i0 = a - 1, i1 = a + 1, j0 = b - 1, j1 = b + 1;
        boolean stopChk = false;
        if (i0 < 0) i0 = 0;
        if (j0 < 0) j0 = 0;
        if (i1 > boardSize - 1) i1 = boardSize - 1;
        if (j1 > boardSize - 1) j1 = boardSize - 1;

        for (int i = i0; i < i1+1; i++) {
            for (int j = j0; j < j1+1; j++) {
                if (i1 - i0 == 2 && j1 - j0 == 2) {
                    int di = 0, dj = 0;
                    if (i == i0) di = i1;
                    else if (i == i1) di = i0;
                    else di = a;
                    if (j == j0) dj = j1;
                    else if (j == j1) dj = j0;
                    else dj = b;
                    if (board[i][j] == 1 && board[di][dj] == 0) {
                        pcTurnFinal(di, dj);
                        stopChk = true;
                        break;
                    }
                }
                if (i1 - i0 == 1 && j1 - j0 == 1) {
                    if(board[i][j]==0){
                        pcTurnFinal(i, j);
                        stopChk = true;
                        break;
                    }
                }



                if (i1 - i0 == 2 && j1 - j0 == 1) {
                    if(i==i0&&j==j0){
                        int jj=j;
                        if(j1==boardSize-1) jj=j1;
                        if (board[i][jj] == 0 && board[i+2][jj] == 1) {
                            pcTurnFinal(i, jj);
                            stopChk = true;
                            break;
                        } else if (board[i+2][jj] == 0 && board[i][jj] == 1) {
                            pcTurnFinal(i+2, jj);
                            stopChk = true;
                            break;
                        }
                    }

                    if(board[i][j] == 0){
                        pcTurnFinal(i, j);
                        stopChk = true;
                        break;
                    }

                }



                if (i1 - i0 == 1 && j1 - j0 == 2) {
                    if(i==i0&&j==j0){
                        int ii=i;
                        if(i1==boardSize-1) ii=i1;
                        if (board[ii][j] == 0 && board[ii][j+2] == 1) {
                            pcTurnFinal(ii, j);
                            stopChk = true;
                            break;
                        } else if (board[ii][j+2] == 0 && board[ii][j] == 1) {
                            pcTurnFinal(ii, j+2);
                            stopChk = true;
                            break;
                        }
                    }

                    if(board[i][j] == 0){
                        pcTurnFinal(i, j);
                        stopChk = true;
                        break;
                    }

                }
            }
            if(stopChk) break;
        }



        // pcTurnNoAi();
    }

    public static void pcTurnFinal(int i,int j){
        board[i][j] = -1;
        printBoard();
        if (turnToCheck <= turn) chkWin(i, j, -1);
    }

    public static void chkWin(int a,int b,int c){
        int c1=0,c2=0,c3=0,c4=0;
        int a1=a,a2=a,b1=b,b2=b;
        while(a1!=0&&b1!=0){
            a1--;
            b1--;
        }
        while(a2!=boardSize-1&&b2!=0){
            a2++;
            b2--;
        }

        for(int i=0,j=boardSize-1;i<boardSize;i++,j--) {
            if (board[i][b] == c) c1++;
            else c1=0;
            if (board[a][i] == c) c2++;
            else c2=0;
            if (a1<boardSize&&b1<boardSize&&board[a1][b1] == c) {
                c3++;
                a1++;
                b1++;
            }
            else c3=0;
            if (a2>-1&&b2<boardSize&&board[a2][b2] == c) {
                c4++;
                a2--;
                b2++;
            }
            else c4=0;
            if(c1==winSize||c2==winSize||c3==winSize||c4==winSize){
                chkWin=true;
                break;
            }
        }

    }

}
