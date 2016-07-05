package ru.geekbrains.java1.dz.dz7.OlyaMikhailyuk.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class MyWindow extends JFrame{
    public MyWindow(){
        setTitle("window");
        setSize(400, 400);
        setLocation(1200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
JLabel label = new JLabel("ghjghjghj");
        add(label);

        JButton button = new JButton("button+");
        button.setSize(40,20);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                label.setText("dgfhgfjhghf");
                setSize(200,130);
            }
        });
        setVisible(true);
    }
}
