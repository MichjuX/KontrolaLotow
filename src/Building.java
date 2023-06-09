import java.awt.*;
import java.awt.geom.Path2D;
import javax.swing.*;


public class Building extends StationaryObject {
    public Building(Point position, double height, int parametr) {
        super(position, height, parametr);
    }

    public double getHeihgt() {
        return height;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(new Color(100, 255, 255));
        g2D.drawRect((int) position.getX(), (int) position.getY(), parametr, parametr + 50);
    }
}
