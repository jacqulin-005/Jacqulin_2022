package pointsAndLines;

import java.util.Vector;

class LineList implements ListOfLines  {

    private Vector<Line> list_of_lines;
    
    LineList(Vector<Line> list_of_lines) {
        this.list_of_lines = list_of_lines;
    }
    
    public Line getLineWithMaxLength() {
        Line lineWithMaxLength = list_of_lines.get(0);
        
        for(Line line : list_of_lines) {
            if(line.getLineLength() > lineWithMaxLength.getLineLength()) {
                lineWithMaxLength = line;
            }
        }
        return lineWithMaxLength;
    }
    
    public Vector<Line> getLinesFromStartingPoint(Point p) {
        Vector<Line> lineStartingFromSamePoint = new Vector<>();
        
        for (Line line : list_of_lines) {
            if(line.getStart().getX() == p.getX() && line.getStart().getY() == p.getY()) {
                lineStartingFromSamePoint.add(line);
            }
        }
        return lineStartingFromSamePoint;
    }
}
