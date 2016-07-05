package ru.geekbrains.java2.dz.dz7.ВадимПрилепишев.client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

/**
 * Created by Prilepishev Vadim on 18.06.2016.
 */
public class ClientChat extends JFrame implements ActionListener {
    private final static String WINDOW_TITLE = "Окно чата";
    private final static String ENTER_BUTTON_TEXT = "Отправить";
    private final static String CLEAR_BUTTON_TEXT = "Очистить историю";
    private final static String FILE_ERROR_MESSAGE = "Ошибка при работе с файлами";
    final String SERVER_ADDR = "localhost";
    final int SERVER_PORT = 8189;
    private Socket socket;
    private File file = new File("src\\main\\java\\ru\\geekbrains\\java2\\dz\\dz7\\ВадимПрилепишев\\ChatHistory.txt");
    DataOutputStream dataOutputStream;
    DataInputStream dataInputStream;
    private FileOutputStream fileOutputStream = null;
    private FileInputStream fileInputStream = null;
    private PrintWriter outFile;

    protected JTextArea textArea;
    private JTextField jTextField;
    private EnterAction enterAction = new EnterAction();
    private ClearLog clearLog = new ClearLog();

    ClientChat() throws IOException {
        super(WINDOW_TITLE);
        JPanel jPanelTextArea = new JPanel(new GridLayout(1,1));
        JPanel jPanelTextField = new JPanel(new GridLayout(1,1));
        JPanel jPanelButtonArea = new JPanel(new GridLayout(2,2));
        JPanel authPanel = new JPanel(new GridLayout(1,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //панель авторизации
        final JTextField jtfLogin = new JTextField("Login");
        final JTextField jtfPass = new JTextField("Password");
        JButton jbAuth = new JButton("Auth");
        authPanel.add(jtfLogin);
        authPanel.add(jtfPass);
        authPanel.add(jbAuth);
        jtfLogin.setToolTipText("Login");

        jbAuth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connect("auth\t" + jtfLogin.getText() + "\t" + jtfPass.getText());
            }
        });

        //окно чата
        textArea = new JTextArea(20,40);
        textArea.setEditable(false);
        String text = readTextFile();
        textArea.append(text);
        JScrollPane scrollPane = new JScrollPane(textArea);

        //border для окна ввода
        Border borderEditTextArea = BorderFactory.createLineBorder(Color.GRAY);

        //окно ввода
        jTextField = new JTextField(20);
        jTextField.setBorder(BorderFactory.createCompoundBorder(borderEditTextArea,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        jTextField.addActionListener(this);

        jPanelTextArea.add(scrollPane);
        jPanelTextField.add(jTextField);
        jPanelButtonArea.add(new JButton(enterAction));
        jPanelButtonArea.add(new JButton(clearLog));

        add(authPanel, BorderLayout.NORTH);
        add(jPanelTextArea, BorderLayout.CENTER);
        add(jPanelTextField, BorderLayout.SOUTH);
        add(jPanelButtonArea, BorderLayout.EAST);
        setLocation(500,200);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        enterText();
    }

    public void connect(String cmd) {
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(cmd);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String w = dataInputStream.readUTF();
                        if (w != null) {
                            if (w.equalsIgnoreCase("end session")) break;
                            textArea.append(w);
                            textArea.append("\n");
                            textArea.setCaretPosition(textArea.getDocument().getLength());
                        }
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                }
            }
        }).start();
    }

    public void enterText(){
        try {
            String text = jTextField.getText();
            dataOutputStream.writeUTF(text);
            dataOutputStream.flush();
            jTextField.setText("");
            String fileText = new String();
            fileText = readTextFile();
            text = fileText + text;
            writeTextFile(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTextFile() throws IOException {
        fileInputStream = new FileInputStream(file);
        int i;
        StringBuffer text = new StringBuffer();

        do {
            i = fileInputStream.read();
            text.append((char)i);
        } while(i != -1);
        text.append('\n');

        fileInputStream.close();

        return text.toString();
    }

    private void writeTextFile(String text) throws FileNotFoundException {
        fileOutputStream = new FileOutputStream(file);

        byte[] buffer = text.getBytes();

        try {
            fileOutputStream.write(buffer);
        } catch (IOException e) {
            System.out.println(FILE_ERROR_MESSAGE);
        } finally {
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(FILE_ERROR_MESSAGE);
            }
        }
    }

    private void clearTextFile() throws IOException {
        fileOutputStream = new FileOutputStream(file);

        byte[] buffer = new byte[0];

        try {
            fileOutputStream.write(buffer);
        } catch (IOException e) {
            System.out.println(FILE_ERROR_MESSAGE);
        } finally {
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(FILE_ERROR_MESSAGE);
            }
        }
    }

    class EnterAction extends AbstractAction {

        public EnterAction(){
            putValue(Action.NAME,ENTER_BUTTON_TEXT);
        }

        @Override
        public void actionPerformed(ActionEvent e)  {
            enterText();
        }
    }

    class ClearLog extends AbstractAction {
        ClearLog(){
            putValue(Action.NAME,CLEAR_BUTTON_TEXT);
        }

        @Override
        public void actionPerformed(ActionEvent e)  {
            try {
                clearTextFile();
                textArea.setText("");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

}