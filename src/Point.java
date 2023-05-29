public class Point {
    //koordynaty (X,Y)
    private double x;
    private double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    double getX()
    {
        return this.x;
    }
    double getY()
    {
        return this.y;
    }
    void move(double dx, double dy)
    {
        this.x+=dx;
        this.y+=dy;
    }
}
