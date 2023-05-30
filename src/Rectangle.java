public class Rectangle {
    private Point position; //in the middle there is our airship
    private double width;
    private double height;
    public Rectangle(Point position, double width, double height)
    {
        this.position = position;
        this.width = width;
        this.height = height;
    }
    public void move(double dx, double dy)
    {
        position.move(dx, dy);
    }
//    public boolean isColliding(Rectangle rectangle)
//    {
//
//    }


    public void setHeight(double height) {
        this.height = height;
    }
}
