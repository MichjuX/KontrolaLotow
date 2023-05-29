public class AirShip {// imo zwiazek z puntkem ma
    protected Route Flight;
    protected Rectangle HitBox;
    protected Point currentLocation;
    protected double velocity;
    protected double height; // i prosokat tez musi miec te sama wysokosc
    public AirShip(Point startingLocation, double width, double height)
    {
        this.currentLocation=startingLocation;
        HitBox = new Rectangle(startingLocation, width, height);
    }
    public void move(double dx, double dy) //tu jaoks trzeba zrobic zeby np airship dziedziczyl punkt z rectangle albo odwrotnie
    {
        currentLocation.move(dx,dy);
        HitBox.moveRect(dx, dy);
    }
    public void setFlight(Route route)
    {
        this.Flight = route;
    }
    public void setVelocity(double velocity)
    {
        this.velocity = velocity;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setHeight()
    {
        this.height = 100;
    }
    public void setVelocity()
    {
        this.velocity = 20;
    }


}
