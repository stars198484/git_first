package ru.geekbrains.java1.dz.dz8.МамаевИгорь;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Gui extends JFrame {

    String mainText = "";
    Double firstNum, secondNum = null;
    char sign;
    Logic logic = new Logic();
    boolean clearDisp = false;
    JTextField mainDisplay = new JTextField(12);
    JButton cButton;
    JButton ceButton;
    JButton plusMinusButton;
    JButton bsButton;
    JButton divideButton;
    JButton multplButton;
    JButton minusButton;
    JButton plusButton;
    JButton eqvButton;
    JButton commaButton;
    JButton[] numButtons;

    public Gui() {
        super("Calc");
        setSize(230, 300);
        setLocation(100, 100);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel fieldPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        numButtons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton("" + i);
        }
        cButton = new JButton("C");
        ceButton = new JButton("CE");
        plusMinusButton = new JButton("+-");
        bsButton = new JButton("<=");
        divideButton = new JButton("/");
        multplButton = new JButton("*");
        minusButton = new JButton("-");
        plusButton = new JButton("+");
        eqvButton = new JButton("=");
        commaButton = new JButton(",");

        mainDisplay.setEditable(false);
        mainDisplay.setFont(new Font("SansSerif", Font.PLAIN, 22));
        mainDisplay.setHorizontalAlignment(JTextField.RIGHT);
        fieldPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        fieldPanel.add(mainDisplay);

        buttonPanel.setLayout(new GridLayout(5, 4));
        buttonPanel.add(ceButton);
        buttonPanel.add(cButton);
        buttonPanel.add(plusMinusButton);
        buttonPanel.add(bsButton);
        buttonPanel.add(numButtons[7]);
        buttonPanel.add(numButtons[8]);
        buttonPanel.add(numButtons[9]);
        buttonPanel.add(divideButton);
        buttonPanel.add(numButtons[4]);
        buttonPanel.add(numButtons[5]);
        buttonPanel.add(numButtons[6]);
        buttonPanel.add(multplButton);
        buttonPanel.add(numButtons[1]);
        buttonPanel.add(numButtons[2]);
        buttonPanel.add(numButtons[3]);
        buttonPanel.add(minusButton);
        buttonPanel.add(commaButton);
        buttonPanel.add(numButtons[0]);
        buttonPanel.add(eqvButton);
        buttonPanel.add(plusButton);

        for (int i = 0; i < 10; i++) {
            final int num = i;
            numButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (clearDisp) {
                        mainText = "";
                        clearDisp = false;
                    }
                    mainText = mainText + num;
                    mainDisplay.setText(mainText);
                }
            });
        }
        plusButton.addActionListener(new PlusListener());
        minusButton.addActionListener(new MinusListener());
        multplButton.addActionListener(new MultplListener());
        divideButton.addActionListener(new DivideListener());
        eqvButton.addActionListener(new EqvListener());
        commaButton.addActionListener(new CommaListener());
        cButton.addActionListener(new CListener());
        ceButton.addActionListener(new CEListener());
        plusMinusButton.addActionListener(new PlusMinusListener());
        bsButton.addActionListener(new BsListener());

        add(fieldPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        setResizable(false);
        setVisible(true);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
    }

    class PlusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null) && !(mainText.equals(""))) {
                secondNum = Double.parseDouble(mainText);
                mainText = logic.decide(firstNum, secondNum, sign);
                mainDisplay.setText(mainText);
                firstNum = Double.parseDouble(mainText);
                sign = '+';
                secondNum = null;
                clearDisp = true;
            } else if (!(mainText.equals(""))) {
                firstNum = Double.parseDouble(mainText);
                sign = '+';
                clearDisp = true;
            }
        }
    }

    class MinusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null) && !(mainText.equals(""))) {
                secondNum = Double.parseDouble(mainText);
                mainText = logic.decide(firstNum, secondNum, sign);
                mainDisplay.setText(mainText);
                firstNum = Double.parseDouble(mainText);
                sign = '-';
                secondNum = null;
                clearDisp = true;
            } else if (!(mainText.equals(""))) {
                firstNum = Double.parseDouble(mainText);
                sign = '-';
                clearDisp = true;
            }

        }
    }

    class MultplListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null) && !(mainText.equals(""))) {
                secondNum = Double.parseDouble(mainText);
                mainText = logic.decide(firstNum, secondNum, sign);
                mainDisplay.setText(mainText);
                firstNum = Double.parseDouble(mainText);
                sign = '*';
                secondNum = null;
                clearDisp = true;
            } else if (!(mainText.equals(""))) {
                firstNum = Double.parseDouble(mainText);
                sign = '*';
                clearDisp = true;
            }

        }
    }

    class DivideListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null) && !(mainText.equals(""))) {
                secondNum = Double.parseDouble(mainText);
                mainText = logic.decide(firstNum, secondNum, sign);
                mainDisplay.setText(mainText);
                firstNum = Double.parseDouble(mainText);
                sign = '/';
                secondNum = null;
                clearDisp = true;
            } else if (!(mainText.equals(""))) {
                firstNum = Double.parseDouble(mainText);
                sign = '/';
                clearDisp = true;
            }
        }
    }

    class EqvListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null)) {
                secondNum = Double.parseDouble(mainText);
                mainText = logic.decide(firstNum, secondNum, sign);
                mainDisplay.setText(mainText);
                sign = '0';
                firstNum = null;
                secondNum = null;
                clearDisp = true;
            }
        }
    }

    class CommaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ((clearDisp) || (mainText.equals(""))) {
                mainText = "0";
                mainDisplay.setText(mainText);
                clearDisp = false;
            }
            if (!(mainText.contains("."))) {
                mainText = mainText + ".";
                mainDisplay.setText(mainText);
            }
        }
    }

    class CListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(firstNum == null)) {
                mainText = "";
                mainDisplay.setText(mainText);
                secondNum = null;


            } else {
                mainText = "";
                mainDisplay.setText(mainText);
            }

        }
    }

    class CEListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            mainText = "";
            mainDisplay.setText(mainText);
            firstNum = null;
            secondNum = null;

        }
    }

    class PlusMinusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!mainText.equals("") && mainText.charAt(0) != '-') {
                mainText = "-" + mainText;
                mainDisplay.setText(mainText);
            } else if (!mainText.equals("")) {
                mainText = mainText.substring(1);
                mainDisplay.setText(mainText);
            }
        }
    }

    class BsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (!(mainText.equals(""))) {
                mainText = mainText.substring(0, mainText.length() - 1);
                mainDisplay.setText(mainText);
            }
        }
    }

    private class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_TYPED) {
                switch ((int) e.getKeyChar()) {
                    case 8:
                        bsButton.doClick();
                        break;
                    case 10:
                        eqvButton.doClick();
                        break;
                    case 61:
                        eqvButton.doClick();
                        break;
                    case 42:
                        multplButton.doClick();
                        break;
                    case 43:
                        plusButton.doClick();
                        break;
                    case 44:
                        commaButton.doClick();
                        break;
                    case 46:
                        commaButton.doClick();
                        break;
                    case 45:
                        minusButton.doClick();
                        break;
                    case 47:
                        divideButton.doClick();
                        break;

                }
                    for (int i=0;i<10;i++){
                        if ((int) e.getKeyChar()==(i+48)){
                            numButtons[i].doClick();
                        }
                    }


                System.out.println((int) e.getKeyChar());
            }
            return false;
        }
    }
}
