import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class MyPanel extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 1280;
    final int PANEL_HEIGHT = 720;
    Image backgroundImage;
    Timer timer;
    Random rand = new Random();
    int xVelocity = (Math.abs(rand.nextInt()%5))+1;
    int yVelocity = (Math.abs(rand.nextInt()%5))+1;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
//        backgroundImage = new ImageIcon("Assets/sktybuc.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(new Color(0, 0, 0));
        g2D.drawRect(x, y, 100, 100);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(x>=PANEL_WIDTH-100 || x<0 ){
            xVelocity = xVelocity * -1;
        }if(y>=PANEL_HEIGHT-100 || y<0 ){
            yVelocity = yVelocity * -1;
        }
            x=x+xVelocity;
            y=y+yVelocity;
            repaint();

    }
}
