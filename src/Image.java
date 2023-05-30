import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Image extends JPanel {
    private int[][] color;
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }

//    public int[] getColor() {
//        return this.color;
//    }
//
//    public void setKolor(int r, int g, int b) {
//        this.color[0] = r;
//        this.color[1] = g;
//        this.color[2] = b;
//    }
//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//    }

}
