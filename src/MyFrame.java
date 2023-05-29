import javax.swing.*;

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
    }
}
