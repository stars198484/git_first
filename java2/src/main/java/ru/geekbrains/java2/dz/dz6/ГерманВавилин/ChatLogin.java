package ru.geekbrains.java2.dz.dz6.ГерманВавилин;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by gta5 on 27.06.2016.
 */
public class ChatLogin extends JDialog {
    //Берем размер экрана, для того, чтобы при генерации поместить оно программы по центру.
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int width = (int)screenSize.getWidth();
    private int height = (int)screenSize.getHeight();
    private int xSize = 225;
    private int ySize = 110;
    private String user;
    public ChatLogin(JFrame topFrame, String title, boolean isModal) {
        super(topFrame, title, isModal);
        this.setTitle("Логин");
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(xSize, ySize);
        setLocation((width - xSize)/2, (height - ySize)/2);
        setResizable(false);
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        JTextField loginTextField = new JTextField();
        JButton submitButton = new JButton("Войти");
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(loginTextField.getText().isEmpty()||loginTextField.getText() == null) {
                    setUser("Guest" + Math.random());
                }else setUser(loginTextField.getText());
                closeLoginFrame();
            }
        });
        JButton exitButton = new JButton("Выход");
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                closeLoginFrame();
            }
        });
        loginTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(loginTextField);
        loginPanel.add(submitButton);
        loginPanel.add(exitButton);
        this.add(loginPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void closeLoginFrame() {
        this.dispose();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
