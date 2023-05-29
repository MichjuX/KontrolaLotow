import java.util.ArrayList;

public class Radar {
    private ArrayList<AirShip> ListOfAirShips = new ArrayList<>();
    private Map StationaryObjectsMap;
    public void addShip(Plane plane){}
    public void addShip(Helicopter helicopter){}
    public void addShip(Baloon baloon){}
    public void addShip(Glider glider){}
    public void removeShip(int ShipID){}
    public void genRandShip(int ShipID){}
    public void genRandRoute(int ShipID){}
    public void changeRoute(int ShipID, Route newRoute){}
    public void detectForCollision(){}
}
