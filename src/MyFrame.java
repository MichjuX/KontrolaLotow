import javax.swing.*;

import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        JFrame frame = new JFrame("test");
        panel = new MyPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        createMenu(frame);

        //Wyswietla okno
        frame.pack();
        frame.setVisible(true);
    }
    private void createMenu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("Info");

        item1.addActionListener((ActionEvent e) -> JOptionPane.showMessageDialog(frame, "Funkcjonalnosc:", "Info",
                JOptionPane.INFORMATION_MESSAGE));

        menu.add(item1);
        menuBar.add(item1);
        frame.setJMenuBar(menuBar);
    }
}
