package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Home-pc on 16.06.2016.
 */
public class SimpleWindowAction extends JFrame {

    private ExitAction exitAction;

    SimpleWindowAction(){
        super("Окно с меню");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        exitAction = new ExitAction();
        DeactivateAction deactivateAction = new DeactivateAction();
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        fileMenu.add(new JMenuItem("Новый"));
        fileMenu.addSeparator();
        fileMenu.add(deactivateAction);
        fileMenu.add(exitAction);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        JToolBar toolBar = new JToolBar("Панель инструментов");
        toolBar.add(exitAction);
        toolBar.add(deactivateAction);
        getContentPane().add(toolBar, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.add(new JButton(exitAction));
        panel.add(new JButton(deactivateAction));
        getContentPane().add(panel);
        setSize(250,250);
        setVisible(true);
    }

    class ExitAction extends AbstractAction {

        ExitAction(){
            putValue(Action.NAME, "Выйти");
            putValue(Action.SHORT_DESCRIPTION, "Программа перестанет работать, а окно исчезнет с экрана.");
        }

        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }

    }

    class DeactivateAction extends AbstractAction {

        DeactivateAction(){
            putValue(Action.NAME, "Запретить выход");
        }

        public void actionPerformed(ActionEvent event) {
            if (exitAction.isEnabled()) {
                exitAction.setEnabled(false);
                putValue(Action.NAME, "Разрешить выход");

            } else {
                exitAction.setEnabled(true);
                putValue(Action.NAME, "Запретить выход");
            }
        }

    }

}