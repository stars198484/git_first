package ru.geekbrains.java1.dz.dz2.РусланУстиц;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i % 2;

        // Task 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
        }

        // Task 3
        int[] arr8 = new int[8];
        arr8[0] = 1;
        for (int i = 1; i < arr8.length; i++) {
            arr8[i] = arr8[i - 1] + 3;
        }

        // Task 4
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length ; i++) {
            if (mas[i] < 6)
                mas[i] *= 2;
        }

        // Task 5 - getting minimum and maximum values
        int[] arrMinMax = {1, 4, 53, 33};
        int minValue = getMinValue(arrMinMax);
        int maxValue = getMaxValue(arrMinMax);

        /*
        Task 6 - simple calculator
        Works only with two operators
        */
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the expression (or `q` to exit):");
            String expression = sc.nextLine();

            //  Check if Exit
            if (expression.equals("q") || expression.equals("Q"))
                break;

            double result = getExprResult(expression);
            System.out.println(expression + " = " + result + "\n");
        }
    }

    public static int getMinValue(int[] array) {
        int min = array[0];
        for (int item : array)
        {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static int getMaxValue(int[] array) {
        int max = array[0];
        for (int item : array)
        {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static double getExprResult(String expression) {
        ArrayList<Double> arrayList = new ArrayList<Double>();

        String delim = " +-*/";
        String operation = "";
        StringTokenizer st = new StringTokenizer(expression, delim, true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            switch (token) {
                case " ":
                    break;
                case "+":
                    operation = "+";
                    break;
                case "-":
                    operation = "-";
                    break;
                case "*":
                    operation = "*";
                    break;
                case "/":
                    operation = "/";
                    break;
                default:
                    if (isDouble(token))
                        arrayList.add(Double.parseDouble(token));
                    else
                    {
                        System.out.println("Error: Wrong expression, can`t resolve arguments!");
                        return 0.0;
                    }
            }
        }

        // Check if there are more than 2 arguments in the expression
        if (arrayList.size() != 2)
        {
            System.out.println("Error: Wrong expression, too many arguments!");
            return 0.0;
        }

        return calculateExpr(arrayList.get(0), arrayList.get(1), operation);
    }

    private static double calculateExpr(double firstNumber, double secondNumber, String operation) {
        double result = 0.0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Error: Operation was not initialized!");
        }
        return result;
    }

    /*
    Check if string can be converted to double
     */
    private static boolean isDouble(String text) {
        for (int i = 0; i < text.length(); i++)
        {
            char tmp = text.charAt(i);
            if (tmp < '0' || tmp > '9') {
                if (tmp == '.')
                    continue;
                return false;
            }
        }
        return true;
    }
}