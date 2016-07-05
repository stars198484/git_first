package ru.geekbrains.java1.dz.dz8.ВавилинГерман;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gta5 on 04.06.2016.
 */
public class Calculator extends JFrame {
    String viewPort = "0";
    double result = 0;
    boolean isOperationJustSelected = false;
    int action = 0;
    private int xSize = 400;
    private int ySize = 400;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int width = (int)screenSize.getWidth();
    private int height = (int)screenSize.getHeight();
    public Calculator() {
        super("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(xSize, ySize);
        setLocation((width - xSize)/2, (height - ySize)/2);
        setResizable(false);
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel ioLabel = new JLabel();
        ioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        ioLabel.setText(viewPort);
        add(ioLabel, BorderLayout.NORTH);
        ioLabel.setVisible(true);
        JButton numberZero = new JButton("0");
        numberZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!viewPort.equals("0")) {
                    viewPort = viewPort + "0";
                    ioLabel.setText(viewPort);
                }
            }
        });
        JButton numberOne = new JButton("1");
        numberOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "1";
                else viewPort = viewPort + "1";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberTwo = new JButton("2");
        numberTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "2";
                else viewPort = viewPort + "2";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberThree = new JButton("3");
        numberThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "3";
                else viewPort = viewPort + "3";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberFour = new JButton("4");
        numberFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "4";
                else viewPort = viewPort + "4";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberFive = new JButton("5");
        numberFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "5";
                else viewPort = viewPort + "5";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberSix = new JButton("6");
        numberSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "6";
                else viewPort = viewPort + "6";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberSeven = new JButton("7");
        numberSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "7";
                else viewPort = viewPort + "7";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberEight = new JButton("8");
        numberEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "8";
                else viewPort = viewPort + "8";
                ioLabel.setText(viewPort);
            }
        });
        JButton numberNine = new JButton("9");
        numberNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isOperationJustSelected) {
                    isOperationJustSelected = false;
                    viewPort = "";
                }
                if(viewPort.equals("0")) viewPort = "9";
                else viewPort = viewPort + "9";
                ioLabel.setText(viewPort);
            }
        });
        JButton btnSumm = new JButton("+");
        btnSumm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isOperationJustSelected = true;
                action = 1;
                result = Double.parseDouble(resultOptimizer(viewPort));
                ioLabel.setText(resultOptimizer(Double.toString(result)));
                viewPort = "";

            }
        });
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isOperationJustSelected = true;
                action = 2;
                result = Double.parseDouble(resultOptimizer(viewPort));
                ioLabel.setText(resultOptimizer(Double.toString(result)));
                viewPort = "";
            }
        });
        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isOperationJustSelected = true;
                action = 3;
                result = Double.parseDouble(resultOptimizer(viewPort));
                ioLabel.setText(resultOptimizer(Double.toString(result)));
                viewPort = "";
            }
        });
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isOperationJustSelected = true;
                action = 4;
                result = Double.parseDouble(resultOptimizer(viewPort));
                ioLabel.setText(resultOptimizer(Double.toString(result)));
                viewPort = "";
            }
        });
        JButton btnSolve = new JButton("=");
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (action) {
                    case 1: {
                        viewPort = Double.toString(result + Double.parseDouble(resultOptimizer(ioLabel.getText())));
                        ioLabel.setText(resultOptimizer(viewPort));
                        reset();
                        break;
                    }
                    case 2: {
                        viewPort = Double.toString(result - Double.parseDouble(resultOptimizer(ioLabel.getText())));
                        ioLabel.setText(resultOptimizer(viewPort));
                        reset();
                        break;
                    }
                    case 3: {
                        viewPort = Double.toString(result * Double.parseDouble(resultOptimizer(ioLabel.getText())));
                        ioLabel.setText(resultOptimizer(viewPort));
                        reset();
                        break;
                    }
                    case 4: {
                        if (ioLabel.getText().equals("0")) {
                            ioLabel.setText("На 0 делить нельзя!!!");
                        }
                        else {
                            viewPort = Double.toString(result / Double.parseDouble(resultOptimizer(ioLabel.getText())));
                            ioLabel.setText(resultOptimizer(viewPort));
                        }
                        reset();
                        break;
                    }
                    default: break;
                }

            }
        });
        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(viewPort.indexOf(".") == -1) viewPort = viewPort + ".";
            }
        });
        JButton btnAbs = new JButton("/-/");
        btnAbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 0;
                result = -1 * Double.parseDouble(ioLabel.getText());
                ioLabel.setText(resultOptimizer(Double.toString(result)));
            }
        });
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 0;
                result = 0;
                viewPort = "0";
                ioLabel.setText(viewPort);
            }
        });
        JButton btnSqr = new JButton("x^2");
        btnSqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 0;
                result = Math.pow(Double.parseDouble(ioLabel.getText()), 2);
                ioLabel.setText(resultOptimizer(Double.toString(result)));
            }
        });
        JButton btnSqrt = new JButton("sqrt(x)");
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 0;
                result = Math.sqrt(Double.parseDouble(ioLabel.getText()));
                ioLabel.setText(resultOptimizer(Double.toString(result)));
            }
        });
        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(5, 4, 10, 10));
        keyPanel.add(btnAbs);
        keyPanel.add(btnClear);
        keyPanel.add(btnSqr);
        keyPanel.add(btnSqrt);
        keyPanel.add(numberSeven);
        keyPanel.add(numberEight);
        keyPanel.add(numberNine);
        keyPanel.add(btnSumm);
        keyPanel.add(numberFour);
        keyPanel.add(numberFive);
        keyPanel.add(numberSix);
        keyPanel.add(btnMinus);
        keyPanel.add(numberOne);
        keyPanel.add(numberTwo);
        keyPanel.add(numberThree);
        keyPanel.add(btnDivide);
        keyPanel.add(numberZero);
        keyPanel.add(btnDot);
        keyPanel.add(btnSolve);
        keyPanel.add(btnMultiply);
        add(keyPanel, BorderLayout.CENTER);
        setVisible(true);

    }

    private String resultOptimizer(String str) {
        if(str.equals("")) return "0";
        if(str.indexOf(".") != -1) {
            if(str.indexOf(".") == str.length() - 1) return str.substring(0, str.length() - 2);
            if(str.indexOf(".0") == str.length() - 2) return str.substring(0, str.length() - 2);
        }
        return str;
    }
    private void reset() {
        action = 0;
    }

}
