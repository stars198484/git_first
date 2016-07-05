package ru.geekbrains.java2.dz.dz4.РусланУстиц;

import ru.geekbrains.java2.dz.dz4.РусланУстиц.io.IOFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by darky_000 on 17.06.2016.
 */
public class ChatForm extends JFrame {

    private JTextArea chatArea;
    private JTextField textField;

    public ChatForm() {
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
        chatArea.setText(IOFile.read());
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

        JMenuItem clearItem = new JMenuItem("Clear");
        clearItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(clearItem, "Delete all text?") == JOptionPane.YES_OPTION) {
                    chatArea.setText("");
                    IOFile.clearFile();
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
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }


    private class SendAction extends AbstractAction {

        SendAction() {
            putValue(Action.NAME, "Send");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            final String text = "User: " + textField.getText();
            chatArea.append(text + "\n");
            System.out.printf("Sending message: %s\n", text);
            IOFile.write(text);
            textField.setText("");
            textField.requestFocusInWindow();
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
}
