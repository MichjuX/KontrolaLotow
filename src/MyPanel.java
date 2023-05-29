import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 1280;
    final int PANEL_HEIGHT = 720;
    Image backgroundImage;
    Timer timer;
    Random rand = new Random();
    int xVelocity = (Math.abs(rand.nextInt() % 5)) + 1;
    int yVelocity = (Math.abs(rand.nextInt() % 5)) + 1;
    int x = 0;
    int y = 0;
    ArrayList<AirShip> airShips;
    StationaryObject st = new StationaryObject();
    Map map = new Map("src\\mapa.txt", st);

    MyPanel() throws Exception {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        //backgroundImage = new ImageIcon("Assets/sktybuc.png").getImage();
        timer = new Timer(10, this);
        timer.start();
        airShips = new ArrayList<>();//lista airships
        AirShip airShip = new AirShip(new Point(100, 100), 50, 20);//przykladowy
        //airShip.setFlight();
        airShips.add(airShip);

    }

    public void paint(Graphics g) {
        super.paint(g);
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(new Color(255, 255, 255));
        g2D.drawRect(x, y, 100, 100);
        map.paint(g);

    }

        /*for (AirShip airShip : airShips) {
            // Rysowanie samolotu
            g2D.setPaint(Color.red);
            g2D.drawRect((int) airShip.getCurrentLocation().getX(), (int) airShip.getCurrentLocation().getY(), 50, 50);
        }*/

    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - 100 || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= PANEL_HEIGHT - 100 || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
        for (AirShip airShip : airShips) {
            // Aktualizacja położenia samolotu na podstawie trasy lotu
//            double dx = 10; // Oblicz przesunięcie w osi x na podstawie trasy lotu
//            double dy = 10; // Oblicz przesunięcie w osi y na podstawie trasy lotu
//            airShip.move(dx, dy);
//            if (airShip.getX() + airShip.getWidth() >= PANEL_WIDTH || airShip.getX() < 0) {
//                airShip.reverseXVelocity();
//            }
//            if (airShip.getY() + airShip.getHeight() >= PANEL_HEIGHT || airShip.getY() < 0) {
//                airShip.reverseYVelocity();
//            }
//            double dx = airShip.getVelocity() * airShip.getFlight().getDirectionX();
//            double dy = airShip.getVelocity() * airShip.getFlight().getDirectionY();
//            airShip.move(dx, dy);
//            repaint();
        }
    }

}
