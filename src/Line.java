public class Line {
    protected Point beginning;
    protected Point ending;

    public Line(Point beginning, Point ending) {
        this.beginning = beginning;
        this.ending = ending;
    }

    public Point getBeginning() {
        return this.beginning;
    }

    public Point getEnding() {
        return this.ending;
    }

}
