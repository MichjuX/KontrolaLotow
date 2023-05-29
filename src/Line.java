public class Line {
    protected Point beginning;
    protected Point ending;
    public Line(Point beginning, Point ending)
    {
        this.beginning=beginning;
        this.ending=ending;
    }
    public Point GetBeginning()
    {
        return this.beginning;
    }
    public Point GetEnding()
    {
        return this.ending;
    }

}
