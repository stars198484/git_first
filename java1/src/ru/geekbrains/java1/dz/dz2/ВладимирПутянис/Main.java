package ru.geekbrains.java1.dz.dz2.ВладимирПутянис;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   public static void main(String[] args)
   {
      int[] arArray = {1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0};

      int[] arResult = invertValues(arArray);
      printArray(arResult);

      System.out.println("******************************");

      int[] arResult2 = createArray(3, 8);
      printArray(arResult2);

      System.out.println("******************************");

      int[] arArrayMult = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
      printArray( calc(arArrayMult) );

      System.out.println("******************************");

      int[] arResult3 = minMaxOf(arArrayMult);
      System.out.println("min = " + arResult3[0] + ", max = " + arResult3[1]);

      System.out.println("******************************");

      initCalculator();
   }

   public static int[] invertValues(int[] arArray)
   {
      for (int i = 0; i < arArray.length; i++)
      {
         arArray[i] = (arArray[i] == 1 ? 0 : 1);
      }
      return arArray;
   }

   public static int[] createArray(int stepSize, int arraySize)
   {
      int[] arArray = new int[arraySize];
      for (int i = 0; i < arraySize; i++)
      {
         arArray[i] = stepSize * i + 1;
      }
      return arArray;
   }

   public static int[] calc(int[] arArray)
   {
      for (int i = 0; i < arArray.length; i++)
      {
         if (arArray[i] < 6)
         {
            arArray[i] *= 2;
         }
      }
      return arArray;
   }

   public static void printArray(int[] arr)
   {
      for (int i = 0; i < arr.length; i++)
      {
         System.out.println(arr[i]);
      }
   }

   public static int[] minMaxOf(int[] arr)
   {
      int min, max;
      min = max = arr[0];
      for (int N : arr)
      {
         min = N < min ? N : min;
         max = N > max ? N : max;
      }
      return new int[]{min, max};
   }

   public static void initCalculator()
   {
      int a, b;
      String operation;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Р’РІРµРґРёС‚Рµ РїРµСЂРІРѕРµ С†РµР»РѕРµ С‡РёСЃР»Рѕ: ");
      a = scanner.nextInt();

      System.out.println("Р’РІРµРґРёС‚Рµ РІС‚РѕСЂРѕРµ С†РµР»РѕРµ С‡РёСЃР»Рѕ: ");
      b = scanner.nextInt();

      System.out.println("Р’РІРµРґРёС‚Рµ РѕРїРµСЂР°С†РёСЋ (+ - * /)");
      operation = scanner.next();

      switch (operation)
      {
         case "+":
            System.out.println(a + " + " + b + " = " + (a + b));
            break;
         case "-":
            System.out.println(a + " - " + b + " = " + (a - b));
            break;
         case "*":
            System.out.println(a + " * " + b + " = " + (a * b));
            break;
         case "/":
            if (b != 0)
            {
               System.out.println(a + " / " + b + " = " + ((float)a / b));
            }
            else
            {
               System.out.println("Р”РµР»РµРЅРёРµ РЅР° 0!");
            }
            break;
         default:
            System.out.println("Р’РІРµРґРµРЅ РЅРµ РІРµСЂРЅС‹Р№ С‚РёРї РѕРїРµСЂР°С†РёРё");
            break;
      }
   }
}