package ru.geekbrains.java1.dz.dz8.МаксимСараев;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by desarz on 31.05.2016.
 */
public class CalculatorPanel extends JPanel{
    private JTextField display;
    JPanel systemPanel;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        // создаем слой на панели, тип задаем BorderLayout
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        // создаем классы событий для комманд, операторов и цифр
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        ActionListener operator = new OperatorAction();

        // создаем панель для системных команд
        systemPanel = new JPanel();
        systemPanel.setLayout(new GridLayout(2, 1));

        addButton(systemPanel, "->", command);
        addButton(systemPanel, "CE", command);

        add(systemPanel, BorderLayout.WEST);

        display = new JTextField("");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton(panel, "7", insert);
        addButton(panel, "8", insert);
        addButton(panel, "9", insert);
        addButton(panel, "/", operator);

        addButton(panel, "4", insert);
        addButton(panel, "5", insert);
        addButton(panel, "6", insert);
        addButton(panel, "*", operator);

        addButton(panel, "1", insert);
        addButton(panel, "2", insert);
        addButton(panel, "3", insert);
        addButton(panel, "-", operator);

        addButton(panel, "0", insert);
        addButton(panel, ".", insert);
        addButton(panel, "=", operator);
        addButton(panel, "+", operator);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(JPanel inPanel, String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        inPanel.add(button);
    }

    private class InsertAction implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String input = event.getActionCommand();
            if(start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }
    private class CommandAction implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String command = event.getActionCommand();
            if (command.equals("CE")){
                display.setText("");
                start = true;
               }
            if (command.equals("->")){
                removeLastChar(display.getText());
            }
        }
    }

    private class OperatorAction implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String operator = event.getActionCommand();
            if(start)
            {
                if(operator.equals("-"))
                {
                    display.setText(operator);
                    start = false;
                }
                else lastCommand = operator;
            }
            else
            {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = operator;
                start=true;
            }
        }
    }

    public void calculate(double x)
    {
        if(lastCommand.equals("+")) result += x;
        else if(lastCommand.equals("-")) result -= x;
        else if(lastCommand.equals("*")) result *= x;
        else if(lastCommand.equals("/")) result /= x;
        else if(lastCommand.equals("=")) result = x;
        display.setText("" + result);
    }

    public void removeLastChar(String  x)
    {
        display.setText("" + (x.length()>0 ? x.substring(0, x.length()-1): ""));
    }

}
