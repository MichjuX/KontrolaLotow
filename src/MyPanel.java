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
    Map map = new Map("src\\mapa.txt", new StationaryObject());
    Point p1 = new Point(0,0);
    Point p2 = new Point(100, 100);
    Point p3 = new Point(300, 300);
    Point p4 = new Point(500, 500);
    Line l1 = new Line(p1, p2);
    Line l2 = new Line(p2, p3);
    Line l3 = new Line(p3, p4);
    Line l4 = new Line(p2, p4);
    Route someRoute = new Route(l1);
   // someRoute.addLine(l4);
    Route someRoute1 = new Route(l2);
    //someRoute1.addLine(l3);
    MyPanel() throws Exception {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        //backgroundImage = new ImageIcon("Assets/sktybuc.png").getImage();
        timer = new Timer(10, this);
        timer.start();
        airShips = new ArrayList<>();//lista airships
        AirShip airShip = new AirShip(new Point(100, 100), 50, 20);//przykladowy
        AirShip airShip1 = new AirShip(new Point(500, 500 ), 500, 100);//przykladowy
        airShip.setFlight(someRoute);
        airShip1.setFlight(someRoute1);
        //airShip.setFlight();
        airShips.add(airShip);
        airShips.add(airShip1);

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(new Color(255, 255, 255));
        g2D.drawRect(x, y, 100, 100);
        map.paint(g);
    //}

        for(AirShip airShip : airShips) {
            // Rysowanie samolotu
            g2D.setPaint(Color.red);
            g2D.drawRect((int) airShip.getCurrentLocation().getX(), (int) airShip.getCurrentLocation().getY(), 50, 50);//to pewnie da sie uproscic
        }

    }

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
           airShip.moveAlongRoute();
        }
        repaint();
    }

}
