package ru.geekbrains.java2.dz.dz4.СараевМаксим;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * Created by desarz on 20.06.2016.
 */
public class ChatFrame extends JFrame {
    public ChatFrame(){
        setTitle("Custom chat on Java");
        ChatPanel panel = new ChatPanel();
        add(panel);
        pack();

    }
}
