package ru.geekbrains.java1.dz.dz3.ВадимПрилепишев;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   private static final int SIZE = 5;
   private static final int WINFLAG = 4;
   private static char[][] field = new char[SIZE][SIZE];
   private static final char playerDot = 'x';
   private static final char aiDot = '0';
   private static final char emptyDot = '*';
   private static Scanner scanner = new Scanner(System.in);
   private static Random random = new Random();

   private static void initField(){
      for(int i = 0; i < SIZE; i++){
         for(int j = 0; j < SIZE; j++) {
            field[i][j] = emptyDot;
         }
      }
   }

   private static boolean initFieldFull(){
      for(int i = 0; i < SIZE; i++){
         for(int j = 0; j < SIZE; j++) {
            if(field[i][j] == emptyDot) return false;
         }
      }
      return true;
   }

   private static void printField(){
      for(int i = 0; i < SIZE; i++){
         for(int j = 0; j < SIZE; j++) {
            System.out.print(field[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }

   private static void setX0(int x, int y, char x0){
      field[x][y] = x0;
   }

   private static void playerTurn(){
      int x,y;
      do {
         System.out.println("Введите координаты в формате X Y (1-5)");
         x = scanner.nextInt();
         y = scanner.nextInt();
      } while(!isCellEmpty(x-1,y-1));
      setX0(x - 1, y - 1, playerDot);
   }

   private static void aiTurn(){
      int x,y;

      //hor

      for(int i = 0; i < SIZE; i++){
         int count = 0;
         for(int j = 0; j < SIZE; j++){
            if(field[i][j] == playerDot) count++;
            if(count == WINFLAG - 1) { // блокируем горизонталь до одного хода до победы человека
               x = i;
               y = j+1;
               if(isCellEmpty(x,y)) setX0(x, y, aiDot);
               break;
            };
         }
      }

      //vert

      for(int i = 0; i < SIZE;i++){
         int count = 0;
         for(int j = 0; j < SIZE;j++){
            if(field[j][i] == playerDot) count++;
            if(count == WINFLAG - 1) {
               x = j+1;
               y = i;
               if(isCellEmpty(x,y)) setX0(x, y, aiDot);
               break;
            };
         }
      }

      //diag 1

      int diagCount = 0;

      for(int i = 0; i < SIZE;i++){
         if(field[i][i] == playerDot) diagCount++;
         if(diagCount == WINFLAG - 1) {
            x = i+1;
            y = i+1;
            if(isCellEmpty(x,y)) setX0(x, y, aiDot);
            break;
         };
      }

      //diag 2

      diagCount = 0;

      int j = 0;

      for(int i = SIZE-1; i > 0; i--){
         if(field[i][j] == playerDot) diagCount++;
         j++;
         if(diagCount == WINFLAG - 1) {
            x = i - 1;
            y = j + 1;
            if(isCellEmpty(x,y)) setX0(x, y, aiDot);
            break;
         };
      }

      do {
         x = random.nextInt(SIZE);
         y = random.nextInt(SIZE);
      } while(!isCellEmpty(x,y));
      setX0(x, y, aiDot);
   }

   private static Boolean isCellEmpty(int x,int y) {
      if(x < 0 || x > SIZE-1 || y < 0 || y > SIZE-1) return false;
      if(field[x][y] == emptyDot) return true;
      return false;
   }

   private static boolean horizontalWinChecker(int horRow,int horCell, char x0){
      boolean win = false;
      int count = 0;

      for(int i = horCell; i < SIZE; i++){
         if(field[horRow][i] != x0) break;
         if(field[horRow][i] == x0) count++;
         if(count == WINFLAG) win = true;
      }

      return win;
   }

   private static boolean verticalWinChecker(int horCell,int horCol, char x0){
      boolean win = false;
      int count = 0;

      for(int i = horCell; i < SIZE; i++){
         if(field[i][horCol] != x0) break;
         if(field[i][horCol] == x0) count++;
         if(count == WINFLAG) win = true;
      }

      return win;
   }

   private static boolean isCheckWin(char x0){
      //hor
      for(int horRow = 0; horRow < SIZE; horRow++){
         for(int horCell = 0; horCell < SIZE; horCell++){
            if(field[horRow][horCell] == x0 && horizontalWinChecker(horCell, horRow, x0)) return true;
         }
      }

      //vert
      for(int horCol = 0; horCol < SIZE;horCol++){
         for(int horCel = 0; horCel < SIZE;horCel++){
            if(field[horCel][horCol] == x0 && verticalWinChecker(horCel,horCol,x0)) return true;
         }
      }

      //diag 1
      int diagCount = 0;

      for(int i = 0; i < SIZE;i++){
         if(field[i][i] == x0) diagCount++;
         if(field[i][i] != x0 && field[i][i] != emptyDot) diagCount--;
         if(diagCount == WINFLAG) return true;
      }

      //diag 2
      diagCount = 0;
      int j = 0;
      for(int i = SIZE-1; i > 0; i--){
         if(field[i][j] == x0) diagCount++;
         j++;
         if(diagCount == WINFLAG) return true;
      }

      return false;
   }


   public static void main(String[] args) {
      initField();
      printField();

      while(true){
         playerTurn();
         printField();
         if(isCheckWin(playerDot)) {
            System.out.println("победил человек");
            break;
         }

         if(initFieldFull()){
            System.out.println("ничья");
            break;
         }

         aiTurn();
         printField();
         if(isCheckWin(aiDot)) {
            System.out.println("победил компьютер");
            break;
         }

         if(initFieldFull()){
            System.out.println("ничья");
            break;
         }
      }
   }
}
