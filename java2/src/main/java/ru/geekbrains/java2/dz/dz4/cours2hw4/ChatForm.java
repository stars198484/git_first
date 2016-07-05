package geekbrains.homework.cours2hw4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Владимир on 20.06.2016.
 */
public class ChatForm extends JFrame
{
    PrintWriter pw;
    public ChatForm() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

        setLayout(new GridLayout(3, 1));
        JPanel[] jp = new JPanel[3];

            jp[0] = new JPanel();
            add(jp[0]);
            jp[0].setBackground(new Color(100 + 0 * 40, 100 + 0 * 40, 100 + 0 * 40));

            jp[1] = new JPanel();
            jp[1].setSize(20, 20);
            add(jp[1]);
            
            jp[1].setBackground(new Color(140, 140, 140));

            jp[2] = new JPanel();
            add(jp[2]);
            jp[2].setBackground(new Color(100 + 2 * 40, 100 + 2 * 40, 100 + 2 * 40));



        jp[0].setLayout(new BorderLayout());
        final JTextField jta = new JTextField();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);

        //jta.addA

        JButton button = new JButton("SEND");
        jp[1].add(button, BorderLayout.PAGE_END);

        jp[2].setLayout(null);
        final JLabel jlab = new JLabel("Chat:");
        jp[2].add(jlab);
        //jp[3].add(js);
        /*js.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jlab.setText("Value: " + js.getValue());
            }
        });*/
       // jlab.getText()



        try
        {
            pw= new PrintWriter(new FileWriter("1.txt"));
        }
        catch (IOException e)
        {
            System.out.println("Начальнике, натумана филе!");
        }

        jta.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s = jlab.getText();
                    jlab.setText(s + "\\n" + jta.getText());
                pw.write("\\n" + jta.getText());

            }
        });

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s = jlab.getText();
                jlab.setText(s + "\\n" + jta.getText());
                pw.write("\\n" + jta.getText());
            }
        });


    }

}
