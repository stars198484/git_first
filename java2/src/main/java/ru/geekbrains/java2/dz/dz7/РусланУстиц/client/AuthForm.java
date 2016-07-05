package ru.geekbrains.java2.dz.dz7.РусланУстиц.client;

import ru.geekbrains.java2.dz.dz7.РусланУстиц.io.IOServer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by darky_000 on 28.06.2016.
 */
public class AuthForm extends JFrame {
    private JPanel panel1;
    private JButton loginButton;
    private JTextField passwordField;
    private JTextField loginField;

    AuthForm(IOServer server) {
        setContentPane(panel1);
        setTitle("Authorization");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 150);

        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String login = loginField.getText();
                final String password = passwordField.getText();
                String message = "auth\t" + login + "\t" + password;
                server.write(message);
                setVisible(false);
            }
        });
    }
}
