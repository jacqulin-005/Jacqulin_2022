package pointsAndLines;

import java.util.Vector;

interface ListOfLines {
	public Vector<Line> getLinesFromStartingPoint(Point p);
	public Line getLineWithMaxLength();
	public Vector<Line> list_of_lines = null;
}