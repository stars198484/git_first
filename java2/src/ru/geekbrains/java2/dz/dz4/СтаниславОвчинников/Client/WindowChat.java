package ru.geekbrains.java2.dz.dz4.СтаниславОвчинников.Client;

import ru.geekbrains.java2.lesson6.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * Created by Stars on 17.06.2016.
 */
class WindowChat extends JFrame {
    private CodChat cd = new CodChat();

    WindowChat() {

        ExitAction exitAction = new ExitAction();
        HistoryClearAction historyClearAction = new HistoryClearAction();
        HistoryLoadAction historyLoadAction = new HistoryLoadAction();
        SendMassagesAction sendMassagesAction = new SendMassagesAction();
        setBounds(300, 100, 800, 500);
        setTitle("Чат крольчат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        add(jp);
        jp.setLayout(null);
        cd.jl.setEditable(false);// запрет редактирования
        cd.jl.setWrapStyleWord(true);//перенос слов
        cd.jl.setLineWrap(true);//перенос строк
        JScrollPane jsp = new JScrollPane(cd.jl);
        jp.add(jsp);
        jsp.setBounds(5, 5, 600, 400);
        JScrollPane jsp1 = new JScrollPane(cd.jtf);
        jp.add(jsp1);
        jsp1.setBounds(5, 410, 400, 25);
        JButton jbSend = new JButton(sendMassagesAction);
        jp.add(jbSend);
        jbSend.setBounds(415, 410, 100, 25);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        fileMenu.add(new JMenuItem("Новый"));
        fileMenu.add(new JMenuItem("Открыть"));
        fileMenu.add(new JMenuItem("Сохранить"));
        JMenu historyMenu = new JMenu("История");
        historyMenu.add(new JMenuItem(historyLoadAction));
        historyMenu.add(new JMenuItem(historyClearAction));
        fileMenu.add(historyMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        JMenu editMenu = new JMenu("Правка");
        editMenu.add(new JMenuItem("Копировать"));
        JMenu pasteMenu = new JMenu("Вставить");
        pasteMenu.add(new JMenuItem("Из буфера"));
        pasteMenu.add(new JMenuItem("Из файла"));
        editMenu.add(pasteMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(Box.createHorizontalGlue());
        setJMenuBar(menuBar);

        cd.jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd.Message();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                new ExitAction();

//                try {
//                    out.println(Server.EXIT);
//                    out.close();
//                    in.close();
//                    socket.close();
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                    System.out.println("error");
//                }
            }
        });
        cd.startClient();
        setVisible(true);
    }

    private class ExitAction extends AbstractAction {

        ExitAction() {
            putValue(Action.NAME, "Выход");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                cd.out.println(Server.EXIT);
                cd.out.close();
                cd.in.close();
                cd.socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
                System.out.println("error");
            }
            System.exit(0);
        }
    }

    private class HistoryLoadAction extends AbstractAction {

        HistoryLoadAction() {
            putValue(Action.NAME, "Загрузить историю");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cd.History();
        }
    }

    private class HistoryClearAction extends AbstractAction {


        HistoryClearAction() {
            putValue(Action.NAME, "Очистить историю");
            putValue(Action.SHORT_DESCRIPTION, "Это так же очистит текущие сообщения");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(new JMenuItem(),
                    "Вы уверены, что хотите стереть всю историю и текущие сообщения?")
                    == JOptionPane.YES_OPTION) cd.ClearHistory();
        }
    }

    private class SendMassagesAction extends AbstractAction {


        SendMassagesAction() {
            putValue(Action.NAME, "Отправить");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cd.Message();
        }
    }


}

