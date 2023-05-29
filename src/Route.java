import java.util.ArrayList;
public class Route {// mysle ze tu kompozycja z Line bedzie
    private ArrayList<Line> Lines;
    public Route(ArrayList<Line> Lines)
    {
        this.Lines = Lines;
    }
    public Route(Line line)//zeby mozna bylo stworzyc trase dodajac po prostu jeden odcinek
    {
        this.Lines = new ArrayList<>();
        Lines.add(line);
    }
    public void addLine(Line line)
    {
        Lines.add(line);
    }
    public void addLine(Point p1, Point p2)//dodajesz linie zaczynajac od punktow
    {
        Line line = new Line(p1,p2);
        Lines.add(line);
    }
    public void deleteLine(int index)
    {
        Lines.remove(index);
    }
    public int getLinesNumber()
    {
        return Lines.size();
    }

}
