package ru.geekbrains.java2.dz.dz6.ГерманВавилин;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by gta5 on 27.06.2016.
 */
public class ChatMenu extends JFrame {
    //Берем размер экрана, для того, чтобы при генерации поместить оно программы по центру.
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int width = (int)screenSize.getWidth();
    private int height = (int)screenSize.getHeight();
    private int xSize = 225;
    private int ySize = 110;
    public ChatMenu() {
        super("Меню");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(xSize, ySize);
        setLocation((width - xSize)/2, (height - ySize)/2);
        setResizable(false);
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        JButton serverButton = new JButton("Запуск Сервера");
        serverButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                launchServer();
            }
        });
        JButton clientButton = new JButton("Запуск клиента");
        clientButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                launchClient();
            }
        });
        JButton exitButton = new JButton("Выход");
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.exit(0);
            }
        });
        serverButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        clientButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(serverButton);
        menuPanel.add(clientButton);
        menuPanel.add(exitButton);
        this.add(menuPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void launchServer() {
        ChatServer server = new ChatServer();
        Thread serverThread = new Thread(server);
        serverThread.start();
    }

    private void launchClient() {
        ChatClient client = new ChatClient();
    }

}
