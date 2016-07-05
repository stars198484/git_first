package ru.geekbrains.java1.dz.dz2.ЮрийЛукас;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Calculator {
    private static Scanner read;
    private float first;
    private float second;
    private String operation="";

    public Calculator() {
        read = new Scanner(System.in);
    }

    public float calc() {
        float result = 0;

        try {
            switch (this.getOperation().getBytes()[0]) {
                case '+':
                    result = this.getFirst() + this.getSecond();
                    break;
                case '-':
                    result = this.getFirst() - this.getSecond();
                    break;
                case '*':
                    result = this.getFirst() * this.getSecond();
                    break;
                case '/':
                    result = this.getFirst() / this.getSecond();
                    break;
            }

        } catch (ArithmeticException e) {
            System.out.println(" РђСЂРёС„РјРµС‚РёС‡РµСЃРєР°СЏ РѕС€РёР±РєР°! ");
        }
        return result;
    }

    public void input() {
        while (!this.readFirst())                 ;
        while (!this.readSecond()) ;
        while (!this.readOperation());
    }

    public boolean readFirst() {
        try {
            System.out.println("Р’РІРµРґРёС‚Рµ РїРµСЂРІРѕРµ С‡РёСЃР»Рѕ: ");
            this.setFirst(read.nextFloat());
            return true;
        } catch (InputMismatchException e) {
            System.out.println(" РћС€РёР±РєР° РІРІРѕРґР° С‡РёСЃР»Р°");
            this.read = new Scanner(System.in);
            return false;
        }
    }

    public boolean readSecond() {
        try {
            System.out.println("Р’РІРµРґРёС‚Рµ РІС‚РѕСЂРѕРµ С‡РёСЃР»Рѕ: ");
            this.setSecond(read.nextFloat());
            return true;
        } catch (InputMismatchException e) {
            System.out.println(" РћС€РёР±РєР° РІРІРѕРґР° С‡РёСЃР»Р°");
            this.read = new Scanner(System.in);
            return false;
        }
    }

    public boolean readOperation() {
        System.out.println("Р’РІРµРґРёС‚Рµ РѕРїРµСЂР°С†РёСЋ:");
        this.setOperation(read.next());
        return this.checkOperation();
    }

    private boolean checkOperation() {
        if (this.operation.length() > 1 | this.operation.isEmpty()) {
            System.out.println(" РћС€РёР±РєР° РІРІРѕРґР° РѕРїРµСЂР°С†РёРё");
            return false;
        }

        if (this.operation.equals("+") | this.operation.equals("-") | this.operation.equals("*") | this.operation.equals("/")) {
            return true;
        }
        System.out.println(" РћС€РёР±РєР° РІРІРѕРґР° РѕРїРµСЂР°С†РёРё");
        return false;
    }


    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}


