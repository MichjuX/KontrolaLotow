import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class MyPanel extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
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
        enemy = new ImageIcon("Assets/jakowluk.png").getImage();
        backgroundImage = new ImageIcon("Assets/sktybuc.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, this);
        g2D.drawImage(enemy, x, y, this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0 ){
            xVelocity = xVelocity * -1;
        }if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0 ){
            yVelocity = yVelocity * -1;
        }
            x=x+xVelocity;
            y=y+yVelocity;
            repaint();
    }
}
