package ru.geekbrains.java1.dz.dz8.ЮрийЛукас;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yurok on 1.06.16.
 */
public class Form extends JFrame {
    private JLabel digiLabel = new JLabel();
    //private ExpressionUtils utilCalc = new ExpressionUtils();

    public Form() {
        JFrame jFrame = new JFrame("Калькулятор");
        jFrame.setSize(350,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel digiPanel = new JPanel();
        Font font = new Font("Verdana", Font.PLAIN, 33);
        digiLabel = new JLabel("0");
        digiLabel.setFont(font);
        digiLabel.setHorizontalAlignment(JLabel.RIGHT);
        digiLabel.setVerticalAlignment(JLabel.CENTER);

        digiPanel.setBackground(Color.LIGHT_GRAY);
        digiPanel.add(digiLabel, BorderLayout.CENTER);

        jFrame.add(digiPanel,BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(350,140);
        JLabel empty = new JLabel("");
        buttonPanel.setLayout(new GridLayout(3, 6));

        ActionListener listener = new ButtonAction();
        ActionListener backspace = new ButtonBackspace();
        ActionListener clear = new ClearSpace();
        ActionListener equals = new Equals();


        addButton(buttonPanel, "7", listener);
        addButton(buttonPanel, "8", listener);
        addButton(buttonPanel, "9", listener);
        addButton(buttonPanel, "/", listener);
        addButton(buttonPanel, "<-", backspace);
        addButton(buttonPanel, "C", clear);

        addButton(buttonPanel, "6", listener);
        addButton(buttonPanel, "5", listener);
        addButton(buttonPanel, "4", listener);
        addButton(buttonPanel, "*", listener);
        addButton(buttonPanel, "(", listener);
        addButton(buttonPanel, ")", listener);

        addButton(buttonPanel, "3", listener);
        addButton(buttonPanel, "2", listener);
        addButton(buttonPanel, "1", listener);

        addButton(buttonPanel, "0", listener);
        addButton(buttonPanel, ",", listener);
        //addButton(buttonPanel, "+", listener);
        //addButton(buttonPanel, "-", listener);
        //addButton(bottomPanel, "=", equals);

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(equals);
        //equalsButton.setSize(350,60);

        JPanel bottomPanel = new JPanel();
        addButton(bottomPanel, "+", listener);
        addButton(buttonPanel, "-", listener);
        addButton(bottomPanel, "=", equals);

        jFrame.add(buttonPanel);
        jFrame.add(bottomPanel, BorderLayout.SOUTH);

        jFrame.setVisible(true);
    }

    private void addButton(JPanel panel,String buttonName, ActionListener listener){
        JButton button = new JButton(buttonName);
        button.addActionListener(listener);
        Font font = new Font("Verdana", Font.PLAIN, 17);
        button.setFont(font);
        panel.add(button);
    }

    private class ButtonAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if(digiLabel.getText().equals("0")){
                digiLabel.setText(e.getActionCommand());
            } else {
                digiLabel.setText(digiLabel.getText() + input);
            }
        }
    }

    private class ButtonBackspace implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            digiLabel.setText(digiLabel.getText().substring(0,digiLabel.getText().length()-1));
        }
    }

    private class  ClearSpace implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            digiLabel.setText("0");
        }
    }

    private class Equals implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String result = ExpressionUtils.calculateExpression(digiLabel.getText()).toString();
                digiLabel.setText(result);
            }
            catch (Exception e1){
                digiLabel.setText("ERROR");
            }
        }
    }
}
