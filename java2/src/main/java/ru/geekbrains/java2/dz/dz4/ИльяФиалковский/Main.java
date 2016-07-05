package ru.geekbrains.java2.dz.dz4.ИльяФиалковский;
import javafx.scene.input.DataFormat;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Demo on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Frame();

    }


}

class Frame extends JFrame {
    public Frame() {
        try {
            SimpleDateFormat dateFormatX = new SimpleDateFormat("ddMMyyHHmmss");
            String x = dateFormatX.format( new Date() )+".txt";
            PrintWriter pw = new PrintWriter(new FileWriter(x),true);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy >> HH:mm:ss");
            pw.write(dateFormat.format( new Date() )+"\n");
        setBounds(500, 200, 800, 600);
        setTitle("GUI Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        JPanel[] jp = new JPanel[2];
        for (int i = 0; i < 2; i++) {
            jp[i] = new JPanel();
            add(jp[i]);
        }
        jp[0].setLayout(new BorderLayout());
        JTextArea area1 = new JTextArea();
        JScrollPane pane1 = new JScrollPane(area1);
        jp[0].add(pane1);
        jp[1].setLayout(new BorderLayout());
        JTextField field = new JTextField();
        JScrollPane pane2 = new JScrollPane(field);
        jp[1].add(pane2);
        JButton button = new JButton("ОТПРАВИТЬ");
        jp[1].add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (area1.getText()!="") {
                    area1.setText(area1.getText()+field.getText()+"\n");
                    pw.write(field.getText()+"\n");
                    pw.flush();
                    field.setText("");
                }
            }
        }
        );
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (area1.getText()!="") {
                    area1.setText(area1.getText()+field.getText()+"\n");
                    pw.write(field.getText()+"\n");
                    pw.flush();
                    field.setText("");
                }            }
        });


            setVisible(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}