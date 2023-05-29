import java.awt.*;
import java.awt.geom.Path2D;
import javax.swing.*;

public class Tree extends JPanel {
    private int x;
    private int y;
    private int h;
    private int r;

    Tree(int x, int y, int h, int r) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.r = r;
    }

    public int getHeihgt() {
        return h;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        int centerX = this.x;
        int centerY = this.y;
        int radius = this.r;
        int sides = 10;

        double angle = 2 * Math.PI / sides;
        Path2D path = new Path2D.Double();
        path.moveTo(centerX + radius * Math.cos(0), centerY + radius * Math.sin(0));
        for (int i = 1; i <= sides; i++) {
            double x = centerX + radius * Math.cos(angle * i);
            double y = centerY + radius * Math.sin(angle * i);
            path.lineTo(x, y);
        }
        path.closePath();
        g2D.setPaint(new Color(199, 154, 1));
        g2D.draw(path);
    }
}
