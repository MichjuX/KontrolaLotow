import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame() throws Exception {
        JFrame frame = new JFrame("Radar");

        panel = new MyPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setJMenuBar(createMenu(frame));
        //Wyswietla okno
        frame.pack();
        frame.setVisible(true);

    }

    private JMenuBar createMenu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        JMenuItem legenda = new JMenuItem("Legenda");
        JMenuItem option = new JMenuItem("Opcje");

        legenda.addActionListener((ActionEvent e) -> JOptionPane.showMessageDialog(frame, "Leganda:\n" +
                        "* Złote 10-cio katy - drzewa\n" +
                        "* Turkusowe protokaty - budynki\n", "Legenda",
                JOptionPane.INFORMATION_MESSAGE));
        option.addActionListener((ActionEvent e) -> JOptionPane.showMessageDialog(frame, "Opcje:\n", "Opcje",
                JOptionPane.INFORMATION_MESSAGE));
        menuBar.setLayout((new FlowLayout(FlowLayout.LEFT)));
        menuBar.add(legenda);
        menuBar.add(option);
        return menuBar;
    }
}
