package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * Created by Home-pc on 16.06.2016.
 */
public class SimpleWindow extends JFrame{
    JPopupMenu popup;
    JLabel label;
    SimpleWindow(){
        super("Окно с меню");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        fileMenu.add(new JMenuItem("Новый"));
        fileMenu.add(new JMenuItem("Открыть"));
        fileMenu.add(new JMenuItem("Сохранить"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Выйти"));
        JMenu editMenu = new JMenu("Правка");
        editMenu.add(new JMenuItem("Копировать"));
        JMenu pasteMenu = new JMenu("Вставить");
        pasteMenu.add(new JMenuItem("Из буфера"));
        pasteMenu.add(new JMenuItem("Из файла"));
        editMenu.add(pasteMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(new JLabel("2"));
        setJMenuBar(menuBar);

        label = new JLabel("КНИЖКА", JLabel.RIGHT);
        JPanel panel = new JPanel();
        panel.add(label);
        popup = new JPopupMenu();
        popup.add(new JMenuItem("Прочитать"));
        popup.add(new JMenuItem("Сжечь"));
        label.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent event) {
                if (SwingUtilities.isRightMouseButton(event))
                    popup.show(label, event.getX(), event.getY());
                panel.setBackground(Color.BLUE);
            }
        });
        setContentPane(panel);
        JFileChooser jFileChooser = new JFileChooser();
        if (jFileChooser.showOpenDialog(panel)== JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();

        }

        setSize(250,150);
        setVisible(true);
    }
}
