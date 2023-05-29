import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map extends JPanel {
    private List<StationaryObject> stationaryObjects = new ArrayList<>();

    Map(String fileName, StationaryObject stationaryObject) throws Exception {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(";");
        while (scanner.hasNext()) {
            String kind = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int height = scanner.nextInt();
            int parametr = scanner.nextInt();

            if (kind.contains("t")) {
                stationaryObject.addTree(new Tree(new Point(x, y), height, parametr));
                stationaryObjects.add(stationaryObject);
            }
            if (kind.contains("b")) {
                stationaryObject.addBuilding(new Building(new Point(x, y), height, parametr));
                stationaryObjects.add(stationaryObject);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        StationaryObject st = stationaryObjects.get(0);
        st.paintComponent(g);
    }


}
