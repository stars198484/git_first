package ru.geekbrains.java1.dz.dz8.АндрейКащеев;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kay on 31.05.2016.
 */
public class CalcEng implements ActionListener {
    private CalcForm parent;
    private double res = 0;
    private double next = 0;
    //next = Double.parseDouble(parent.getDisplay());
    private String[] numbers;
    private String[] operands;
    private StringBuilder sb = new StringBuilder();

    public CalcEng(CalcForm parent) {
        this.parent = parent;
    }
    private void toDisplay(String text) {
//        if (text.equals(".") && (parent.getDisplay().indexOf('.') > -1));
//            else
            parent.setDisplay(parent.getDisplay() + text);

    }

    //    public StringBuilder getResult() {
//        return printresult;
//    }
//    public void setResult(StringBuilder result) {
//        this.printresult = result;
//    }
    public double compute(double n1, String oper, double n2) {
        switch (oper) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                return 0;
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (((JButton) e.getSource()).getText()) {
            case "0": toDisplay("0"); break;
            case "1": toDisplay("1"); break;
            case "2": toDisplay("2"); break;
            case "3": toDisplay("3"); break;
            case "4": toDisplay("4"); break;
            case "5": toDisplay("5"); break;
            case "6": toDisplay("6"); break;
            case "7": toDisplay("7"); break;
            case "8": toDisplay("8"); break;
            case "9": toDisplay("9"); break;
            case ",": toDisplay("."); break;
            case "CLEAN": parent.setDisplay(""); res=0; break;
            case "+": if (parent.getDisplay().length()>0) toDisplay(" + "); break;
            case "*": if (parent.getDisplay().length()>0) toDisplay(" * "); break;
            case "-": if (parent.getDisplay().length()>0) toDisplay(" - "); break;
            case "/": if (parent.getDisplay().length()>0) toDisplay(" / "); break;
            case "=":
                //toDisplay(" =");
                numbers = parent.getDisplay().split("[+*\\-/ ]+");
                operands = parent.getDisplay().split("[0-9. ]");
                sb.delete(0,sb.length());
                for (String s: operands) {
                    if (!s.equals("")) sb.append(s);
                }
                res += Double.parseDouble(numbers[0]);
                for (int i = 1; i < numbers.length; i++) {
                    res = compute(res,sb.toString().substring(i-1,i),Double.parseDouble(numbers[i]));

                }
                toDisplay(" = "+res);
        }





    }
}
