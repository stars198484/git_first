package ru.geekbrains.java1.dz.dz2.ВадимПрилепишев;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   public static void main(String[] args) {

      int[] arr = {0,0,1,0,1,1,0,1,0,1};

      for(int i=0; i < arr.length; i++){
         if(arr[i] == 0) arr[i] = 1;
         else arr[i] = 0;
      }


      int[] arr8digi = new int[8];
      int count = 1;

      for(int i = 0; i < arr8digi.length; i++){
         arr8digi[i] = count;
         count = count + 3;
      }

      int[] mas =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

      for(int i=0; i < mas.length; i++){
         if(mas[i] < 6) mas[i] = mas[i] * 2;
      }

      viewArray(arr);
      viewArray(arr8digi);
      viewArray(mas);

      System.out.println("Минимальный элемент = " + minElement(mas));
      System.out.println("Максимальный элемент = " + maxElement(mas));

      Scanner scanner = new Scanner(System.in);

      System.out.println("Калькулятор. Введите 1");
      System.out.println("Выход. Введите 0");
      int menu = scanner.nextInt();

      switch (menu){
         case 0: System.exit(0);
         case 1: calcMenu();
      }
   }

   public static void viewArray(int[] arr){
      for(int i=0; i < arr.length; i++){
         System.out.println(arr[i]);
         System.out.println();
      }
   }

   public static int minElement(int[] arr){
      int minElement = 0;
      for(int i = 0; i < arr.length-1; i++){
         if(i == 0) minElement = arr[i];
         if(minElement > arr[i+1]) minElement = arr[i+1];
      }
      return minElement;
   }

   public static int maxElement(int[] arr){
      int maxElement = 0;
      for(int i = 0; i < arr.length-1; i++){
         if(i == 0) maxElement = arr[i];
         if(maxElement < arr[i+1]) maxElement = arr[i+1];
      }
      return maxElement;
   }

   public static void calcMenu(){
      Scanner calcScanner = new Scanner(System.in);

      System.out.println("Введите число 1");
      double digitalOne = calcScanner.nextDouble();
      System.out.println("Введите операцию, +,-,*,/,%");
      String matOperation = calcScanner.next();
      System.out.println("Введите число 2");
      double digitalTwo = calcScanner.nextDouble();

      System.out.println(calculator(digitalOne, matOperation, digitalTwo));

   }

   public static double calculator(double digitalOne, String matOperation,double digitalTwo){
      switch(matOperation){
         case "+": return digitalOne + digitalTwo; //здесь не нужен оператор break,так как return выкинет нас из тела метода с возвратом резудьтата
         case "-": return digitalOne - digitalTwo;
         case "*": return digitalOne * digitalTwo;
         case "/": return digitalOne / digitalTwo;
         case "%": return (digitalOne / 100) * digitalTwo;
         default: System.out.println("Вы неправильно ввели данные.");
      }
      return 0;
   }

}