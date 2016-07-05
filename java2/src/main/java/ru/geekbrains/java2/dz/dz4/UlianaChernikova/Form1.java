//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz4.UlianaChernikova;
import com.sun.webkit.*;

import javax.swing.*;
import java.awt.*;
import java.awt.PopupMenu;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Form1 extends JFrame{
    public Form1(){
        setTitle("CHAT");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 200);
        setSize(1000, 700);
        setLayout(new GridLayout(2,1));
        //Созданеи основной панели
        JPanel myPanel =new JPanel();
        myPanel.setLayout(new BorderLayout());

        add(myPanel);
// Создание области чата
        JTextArea myTextArea =new JTextArea();
        JScrollPane myScroll=new JScrollPane(myTextArea);
        myPanel.add(myScroll);
        JPanel textPanel=new JPanel();
        textPanel.setLayout(new BorderLayout());

        add(textPanel, BorderLayout.PAGE_END);
// Создание области ввода текста
       JTextField myText=new JTextField(80);
        // Области ввода логина и пароля
        final TextField loginField=new TextField();
        final JPasswordField passField =new JPasswordField();

        textPanel.add(new JLabel("User name", SwingConstants.LEFT));
        loginField.setColumns(10);
        textPanel.add(loginField);
textPanel.add(new JLabel("Password", SwingConstants.LEFT));

        passField.setColumns(10);

        textPanel.add(passField);

textPanel.setLayout(new FlowLayout());
       textPanel.add(myText);
        //Кнопки ввода и удаления
        JButton inputButton=new JButton("Input");
        JButton clearButton=new JButton("Clear");
inputButton.setLayout(new FlowLayout());
        clearButton.setLayout(new FlowLayout());

        textPanel.add(inputButton);
        textPanel.add(clearButton);
        myTextArea.setLineWrap(true);
// События при нажатии кномпки или  нажатии Enter.
        myText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=  myText.getText();
                myTextArea.setText(myTextArea.getText()+ "\n"+ loginField.getText() + ":"+ s);
                myText.setText("");
                try{
                    PrintWriter printWriter=new PrintWriter(new FileWriter("1.txt"));
                    printWriter.write(myTextArea.getText());}
                catch (IOException exc) {System.out.println(exc);}

            }
        });
        inputButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String s=myText.getText();
                myTextArea.setText(myTextArea.getText() + "\n"+ loginField.getText()+ ":" + s);
                myText.setText("");
                try{
                    PrintWriter printWriter=new PrintWriter(new FileWriter("1.txt"));
                    printWriter.write(myTextArea.getText());}
                catch (IOException exc) {System.out.println(exc);}



            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
clearButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=myText.getText();
       myText.setText("");
    }
});

        JMenuBar mainMenu=new JMenuBar();
        JMenu mFile=new JMenu("File");
        JMenu mEdit=new JMenu("Edit");
        JMenuItem mFileNew=new JMenuItem("New");
        JMenuItem mFileExit=new JMenuItem("Exit");
        setJMenuBar(mainMenu);
        mainMenu.add(mFile);
        mainMenu.add(mEdit);
        mFile.add(mFileNew);
        mFile.addSeparator();
        mFile.add(mFileExit);
mFileExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);

    }
});
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye");
            }
        });

        myText.setSize(1000,100);
        textPanel.setSize(1000,100 );
        inputButton.setSize(50,50);
        setVisible(true);


    }
}
