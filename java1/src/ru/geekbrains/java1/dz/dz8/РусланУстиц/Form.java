package ru.geekbrains.java1.dz.dz8.РусланУстиц;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Hashtable;

/**
 * Created by darky on 31.05.2016.
 */
public class Form extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 500;

    private JLabel lResult;
    private JLabel lOperand;
    private JLabel lHistory;
    private JPanel buttonsPanel;

    private double result = 0;
    private boolean isOperated;
    private StringBuilder labelValue;
    private Operations.SimpleOperator operation;

    private Hashtable<String, JButton> buttons;
    private InputMap imap;
    private ActionMap amap;

    public Form() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); // центрируем форму относительно центра экрана

        setLayout(new BorderLayout());
        labelValue = new StringBuilder();

        lResult = new JLabel(labelValue.toString());
        lResult.setPreferredSize(new Dimension(240, 50));
        lResult.setFont(new Font("arial", Font.PLAIN, 20));
        lOperand = new JLabel();
        lHistory = new JLabel();

        JPanel historyPanel = new JPanel();
        historyPanel.setPreferredSize(new Dimension(40, 50));
        historyPanel.setLayout(new BoxLayout(historyPanel, BoxLayout.PAGE_AXIS));
        historyPanel.add(lHistory);
        historyPanel.add(lOperand);

        JPanel resultPanel = new JPanel();
        resultPanel.setBorder(new LineBorder(Color.GRAY, 1));
        resultPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
        resultPanel.add(lResult);
        resultPanel.add(historyPanel);
        add(resultPanel, BorderLayout.NORTH);

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(6, 4));
        add(buttonsPanel, BorderLayout.CENTER);

        buttons = new Hashtable<>();

        setButtons();
        setVisible(true);
    }


    private void setButtons() {
        createButtons();

        buttonsPanel.add(buttons.get("%"));
        buttonsPanel.add(buttons.get("sqrt"));
        buttonsPanel.add(buttons.get("sqr"));
        buttonsPanel.add(buttons.get("1/x"));
        buttonsPanel.add(buttons.get("CE"));
        buttonsPanel.add(buttons.get("C"));
        buttonsPanel.add(buttons.get("<-"));
        buttonsPanel.add(buttons.get("/"));
        buttonsPanel.add(buttons.get("7"));
        buttonsPanel.add(buttons.get("8"));
        buttonsPanel.add(buttons.get("9"));
        buttonsPanel.add(buttons.get("*"));
        buttonsPanel.add(buttons.get("4"));
        buttonsPanel.add(buttons.get("5"));
        buttonsPanel.add(buttons.get("6"));
        buttonsPanel.add(buttons.get("-"));
        buttonsPanel.add(buttons.get("1"));
        buttonsPanel.add(buttons.get("2"));
        buttonsPanel.add(buttons.get("3"));
        buttonsPanel.add(buttons.get("+"));
        buttonsPanel.add(buttons.get("+/-"));
        buttonsPanel.add(buttons.get("0"));
        buttonsPanel.add(buttons.get("."));
        buttonsPanel.add(buttons.get("="));
    }

    private void createButtons() {
        setInputMap();

        amap = buttonsPanel.getActionMap();

        amap.put("esc.action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton bPercent = new JButton("%");
        buttons.put("%", bPercent);
        bPercent.addActionListener(e -> {
            if (labelValue.length() == 0)
                return;
            double tmp = Double.parseDouble(labelValue.toString());
            tmp *= 0.01 * result;
            labelValue.delete(0, labelValue.length());
            labelValue.append(tmp);
            calculate(result, tmp);
        });

        createSimpleOperationButton("+", Operations.SimpleOperator.SUM);
        createSimpleOperationButton("-", Operations.SimpleOperator.SUBTRACTION);
        createSimpleOperationButton("*", Operations.SimpleOperator.MULTIPLY);
        createSimpleOperationButton("/", Operations.SimpleOperator.DIVISION);

        setComplexOperationButton("sqrt", Operations.ComplexOperator.SQRT);
        setComplexOperationButton("sqr", Operations.ComplexOperator.SQR);
        setComplexOperationButton("1/x", Operations.ComplexOperator.FRACTION);

        setSystemButtons();

        for (int i = 0; i < 10; i++) {
            setNumberButton(i);
        }
    }

    private void createSimpleOperationButton(String name, Operations.SimpleOperator simpleOperator) {
        JButton jButton = new JButton(name);

        amap.put(name + ".action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (result != 0 && operation == null) {
                    setOperation(simpleOperator);
                    return;
                }
                if (result == 0) {
                    result = Double.parseDouble(labelValue.toString());
                    setHistory(result);
                } else if (result != 0) {
                    double tmp = Double.parseDouble(lResult.getText());
                    calculate(result, tmp);
                }

                setOperation(simpleOperator);
                System.out.println("Simple operation block: result ->" + result);
                isOperated = true;
            }
        });

        buttons.put(name, jButton);
        jButton.addActionListener(e -> {
            if (result != 0 && operation == null) {
                setOperation(simpleOperator);
                return;
            }
            if (result == 0) {
                result = Double.parseDouble(labelValue.toString());
                setHistory(result);
            } else if (result != 0) {
                double tmp = Double.parseDouble(lResult.getText());
                calculate(result, tmp);
            }

            setOperation(simpleOperator);
            System.out.println("Simple operation block: result ->" + result);
            isOperated = true;
        });
    }

    private void setComplexOperationButton(String name, Operations.ComplexOperator complexOperator) {
        JButton jButton = new JButton(name);
        buttons.put(name, jButton);
        jButton.addActionListener(e -> {
            if (operation == null) {
                if (result == 0)
                    result = Double.parseDouble(lResult.getText());
                result = complexOperator.apply(result);
                lResult.setText(String.valueOf(result));
                lHistory.setText(String.valueOf(result));
            } else {
                double tmp = Double.parseDouble(lResult.getText());
                tmp = complexOperator.apply(tmp);
                calculate(result, tmp);
            }

            isOperated = true;
        });
    }

    private void setNumberButton(int number) {
        String sNumber = String.valueOf(number);
        JButton jButton = new JButton(String.valueOf(sNumber));

        amap.put(number + ".action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperated) {
                    clearResult();
                    isOperated = false;
                }
                labelValue.append(number);
                setResult(labelValue.toString());
            }
        });

        buttons.put(String.valueOf(number), jButton);

        jButton.addActionListener(e -> {
            if (isOperated) {
                clearResult();
                isOperated = false;
            }
            labelValue.append(number);
            setResult(labelValue.toString());
        });
    }

    private void setSystemButtons() {
        JButton bEquals = new JButton("=");
        buttons.put("=", bEquals);
        JButton bCE = new JButton("CE");
        buttons.put("CE", bCE);
        JButton bC = new JButton("C");
        buttons.put("C", bC);
        JButton bBackspace = new JButton("<-");
        buttons.put("<-", bBackspace);
        JButton bComma = new JButton(".");
        buttons.put(".", bComma);
        JButton bPlusMinus = new JButton("+/-");
        buttons.put("+/-", bPlusMinus);

        bCE.addActionListener(e -> clearResult());

        bC.addActionListener(e -> {
            result = 0;
            clearAll();
        });

        amap.put("<-.action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelValue.length() != 0)
                    labelValue.deleteCharAt(labelValue.length() - 1);
                setResult(labelValue.toString());
            }
        });

        bBackspace.addActionListener(e -> {
            if (labelValue.length() != 0)
                labelValue.deleteCharAt(labelValue.length() - 1);
            setResult(labelValue.toString());
        });

        amap.put("=.action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tmp = Double.parseDouble(lResult.getText());
                calculate(result, tmp);
                clearOperation();
                System.out.println("Equals -> result: " + result);
            }
        });

        bEquals.addActionListener(e -> {
            double tmp = Double.parseDouble(lResult.getText());
            calculate(result, tmp);
            clearOperation();
            System.out.println("Equals -> result: " + result);
        });

        amap.put("..action", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelValue.length() != 0) {
                    for (int i = 0; i < labelValue.length(); i++)
                        if (labelValue.charAt(i) == '.') return;
                    labelValue.append(".");
                    setResult(labelValue.toString());
                }
            }
        });

        bComma.addActionListener(e -> {
            if (labelValue.length() != 0) {
                for (int i = 0; i < labelValue.length(); i++)
                    if (labelValue.charAt(i) == '.') return;
                labelValue.append(".");
                setResult(labelValue.toString());
            }
        });

        bPlusMinus.addActionListener(e -> {
            if (labelValue.charAt(0) == '-')
                labelValue.deleteCharAt(0);
            else labelValue.insert(0, '-');
            setResult(labelValue.toString());
        });
    }

    private void setInputMap() {
        imap = buttonsPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "1.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0), "1.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "2.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "2.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "3.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "3.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "4.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "4.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "5.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "5.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "6.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "6.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "7.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "7.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "8.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0), "8.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "9.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0), "9.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "0.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_0, 0), "0.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "+.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "-.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "-.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "*.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "/.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "=.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "..action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "<-.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "esc.action");
    }

    private void clearAll() {
        clearResult();
        clearOperation();
        clearHistory();
    }

    private void setOperation(Operations.SimpleOperator operation) {
        if (this.operation != operation) {
            this.operation = operation;
            lOperand.setText(operation.toString());
        }
    }

    private void clearOperation() {
        operation = null;
        lOperand.setText("");
    }

    private void clearResult() {
        if (labelValue.length() != 0)
            labelValue.delete(0, labelValue.length());
        setResult(labelValue.toString());
    }

    private void setResult(String result) {
        lResult.setText(result);
    }

    private void setResult(double value) {
        lResult.setText(String.valueOf(value));
    }

    private void setHistory(double value) {
        lHistory.setText(String.valueOf(value));
    }

    private void clearHistory() {
        lHistory.setText("");
    }

    private void calculate(double a, double b) {
        result = operation.apply(a, b);
        clearResult();
        clearOperation();
        setResult(result);
        setHistory(result);
    }
}
