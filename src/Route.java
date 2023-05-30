import java.util.ArrayList;
public class Route {// mysle ze tu kompozycja z Line bedzie
    private ArrayList<Line> lines;
    public Route(ArrayList<Line> Lines)
    {
        this.lines = Lines;
    }
    public Route(Line line)//zeby mozna bylo stworzyc trase dodajac po prostu jeden odcinek
    {
        this.lines = new ArrayList<>();
        if (line != null)
            this.lines.add(line);
    }
    public void addLine(Line line)
    {
        this.lines.add(line);
    }
    public void addLine(Point p1, Point p2)//dodajesz linie zaczynajac od punktow
    {
        Line line = new Line(p1,p2);
        lines.add(line);
    }
    public void deleteLine(int index)
    {
        lines.remove(index);
    }
    public int getLinesNumber()
    {
        return lines.size();
    }
    // Zwraca linie na zadanej pozycji w trasie
    public Line getLine(int index) {
        return lines.get(index);
    }

}
