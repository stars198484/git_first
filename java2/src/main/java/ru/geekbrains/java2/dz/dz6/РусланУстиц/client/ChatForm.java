package ru.geekbrains.java2.dz.dz6.РусланУстиц.client;

import ru.geekbrains.java2.dz.dz6.РусланУстиц.io.IOFile;
import ru.geekbrains.java2.dz.dz6.РусланУстиц.io.IOServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by darky_000 on 17.06.2016.
 */
public class ChatForm extends JFrame {

    private JTextArea chatArea;
    private JTextField textField;
    private final IOFile file;
    private IOServer server;
    private Client client;
    private boolean serverBased = false;

    public ChatForm(Client client) {
        file = new IOFile();
        this.client = client;

        setTitle("Simple chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        // Form
        setLayout(new BorderLayout());

        // Chat panel
        JPanel chatPanel = new JPanel();
        chatPanel.setLayout(new BorderLayout());

        // Chat panel: Chat area settings
        chatArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(chatArea);
        chatArea.setEditable(false);
        chatArea.setText(file.read());
        chatPanel.add(scrollPane);

        // Message panel
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Message panel: Text field settings
        textField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.9;
        messagePanel.add(textField, c);

        // Message panel: Text field settings: Set focus on text field
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                textField.requestFocusInWindow();
            }
        });

        // Message panel: Send button settings
        JButton sendButton = new JButton(new SendAction());
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        messagePanel.add(sendButton, c);

        // Message panel: Button actions
        InputMap imap = messagePanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter.action");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape.action");
        ActionMap amap = messagePanel.getActionMap();

        amap.put("enter.action", new SendAction());
        amap.put("escape.action", new CloseAction());

        // Add panels to the form
        add(chatPanel, BorderLayout.CENTER);
        add(messagePanel, BorderLayout.SOUTH);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu serverMenu = new JMenu("Server");

        JMenuItem clearItem = new JMenuItem("Clear");
        clearItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(clearItem, "Delete all text?") == JOptionPane.YES_OPTION) {
                    chatArea.setText("");
                    file.clearFile();
                    textField.requestFocusInWindow();
                }
            }
        });
        fileMenu.add(clearItem);

        JMenuItem faqItem = new JMenuItem("F.A.Q.");
        faqItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(faqItem, "Some text here", "F.A.Q.", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        fileMenu.add(faqItem);

        fileMenu.add(new JMenuItem(new CloseAction()));

        serverMenu.add(new JMenuItem(new ServerAction()));

        menuBar.add(fileMenu);
        menuBar.add(serverMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public synchronized void writeLine(String line) {
        chatArea.append(line + "\n");
        file.write(line);
        textField.setText("");
        textField.requestFocusInWindow();
    }

    void setServerManipulator(IOServer server) {
        this.server = server;
        serverBased = true;
    }

    private class SendAction extends AbstractAction {

        SendAction() {
            putValue(Action.NAME, "Send");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            final String line = textField.getText();
            writeLine("User: " + line);
            if (serverBased)
                server.write(line);
        }
    }

    private class CloseAction extends AbstractAction {

        CloseAction() {
            putValue(Action.NAME, "Exit");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Pressed escape: Exiting program");
            System.exit(0);
        }
    }

    private class ServerAction extends AbstractAction {

        private boolean connected = false;

        ServerAction() {
            putValue(Action.NAME, "Connect");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!connected) {
                client.startServerConnection();
                connected = true;
                putValue(Action.NAME, "Disconnect");
            } else {
                writeLine("Server: Disconnected from server");
                if (serverBased)
                    server.write("#disconnect");
                client.stopServerConnection();
                connected = false;
                putValue(Action.NAME, "Connect");
            }

        }
    }
}
