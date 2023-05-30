public class AirShip {//
    protected Route flight;// trasa lotu
    protected Rectangle hitBox;
    protected Point currentLocation;
    protected double velocity;
    protected double height; // i prosokat tez musi miec te sama wysokosc
    public AirShip(Point startingLocation, double width, double height)
    {
        this.currentLocation=startingLocation;
        hitBox = new Rectangle(startingLocation, width, height);
    }
    public void move(double dx, double dy) //tu jaoks trzeba zrobic zeby np airship dziedziczyl punkt z rectangle albo odwrotnie
    {
        currentLocation.move(dx,dy);
        hitBox.move(dx, dy);
    }
    public void setFlight(Route route)
    {
        this.flight = route;
    }
    public void setVelocity(double velocity)
    {
        this.velocity = velocity;
    }
    public void setHeight(double height)
    {
        this.height = height;
        hitBox.setHeight(height);
    }
    public void setHeight()
    {
        this.height = 100;
        hitBox.setHeight(100);
    }
    public void setVelocity()
    {
        this.velocity = 20;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }
}
