import java.awt.*;
import java.awt.geom.Path2D;
import javax.swing.*;


public class Building extends JPanel {
    private int x;
    private int y;
    private int h;
    private int a;

    Building(int x, int y, int h, int a) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.a = a;
    }

    public int getHeihgt() {
        return h;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(new Color(255,255,255));
        g2D.drawRect(x,y,a,a+50);
    }
}
