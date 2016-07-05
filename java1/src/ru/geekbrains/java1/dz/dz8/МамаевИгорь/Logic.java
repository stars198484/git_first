package ru.geekbrains.java1.dz.dz8.МамаевИгорь;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Created by Игорь on 01.06.2016.
 */
public class Logic {

    public String decide(double firstNum, double secondNum, char sign) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(new Locale("ENGLISH"));
        DecimalFormat dc = new DecimalFormat("###.########",decimalFormatSymbols);
        switch (sign) {
            case '+':
                return dc.format(firstNum + secondNum);

            case '-':
                return dc.format(firstNum - secondNum);

            case '*':
                return dc.format(firstNum * secondNum);

            case '/':
                if (secondNum != 0) return dc.format(firstNum / secondNum);
                else return "divide by zero";

        }
        return "";
    }
}
