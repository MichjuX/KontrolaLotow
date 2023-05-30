public class Line {
    protected Point beginning;
    protected Point ending;

    public Line(Point beginning, Point ending) {
        this.beginning = beginning;
        this.ending = ending;
    }
    public Point direction() {
        double dx = ending.getX() - beginning.getX();
        double dy = ending.getY() - beginning.getY();
        double length = Math.sqrt(dx * dx + dy * dy);
        return new Point(dx / length, dy / length);
    }
    public Point getBeginning() {
        return this.beginning;
    }

    public Point getEnding() {
        return this.ending;
    }

}
