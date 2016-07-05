package ru.geekbrains.java2.dz.dz4.ВадимПрилепишев;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by Prilepishev Vadim on 18.06.2016.
 */
public class ChatWindow extends JFrame implements ActionListener {
    private final static String WINDOW_TITLE = "Окно чата";
    private final static String ENTER_BUTTON_TEXT = "Отправить";
    private final static String CLEAR_BUTTON_TEXT = "Очистить историю";
    private final static String FILE_ERROR_MESSAGE = "Ошибка при работе с файлами";

    protected JTextArea textArea;
    protected JTextField jTextField;
    private EnterAction enterAction = new EnterAction();
    private  ClearLog clearLog = new ClearLog();
    private File file = new File("src\\ru\\geekbrains\\java2\\dz\\dz4\\ВадимПрилепишев\\ChatHistory.txt");
    private FileOutputStream fileOutputStream = null;
    private FileInputStream fileInputStream = null;

    ChatWindow() throws IOException {
        super(WINDOW_TITLE);
        JPanel jPanelTextArea = new JPanel();
        JPanel jPanelTextField = new JPanel();
        JPanel jPanelButtonArea = new JPanel();
        jPanelTextArea.setLayout(new GridLayout(1,1));
        jPanelTextField.setLayout(new GridLayout(1,1));
        jPanelButtonArea.setLayout(new GridLayout(1,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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

        add(jPanelTextArea,BorderLayout.NORTH);
        add(jPanelTextField,BorderLayout.CENTER);
        add(jPanelButtonArea,BorderLayout.SOUTH);
        setLocation(500,200);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
         enterText();
    }

    private String readTextFile() throws IOException {
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

    private void enterText(){
        String text = jTextField.getText();
        jTextField.setText("");
        textArea.append(text + '\n');
        jTextField.selectAll();

        textArea.setCaretPosition(textArea.getDocument().getLength());

        String fileText = new String();

        try {
            fileText = readTextFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        text = fileText + text;

        try {
            writeTextFile(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

        EnterAction(){
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
