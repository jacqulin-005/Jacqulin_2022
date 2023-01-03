package pointsAndLines;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Solution {

    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String[] input;
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int nLines = Integer.parseInt(sub);
        Vector<Line> lines = new Vector<Line>();
        for(int i=0; i<nLines; i++) {
            input = sc.nextLine().split(" ");
            /* x1 y1 x2 y2 */
            double x1 = Double.parseDouble(input[0]);
            double y1 = Double.parseDouble(input[1]);
            double x2 = Double.parseDouble(input[2]);
            double y2 = Double.parseDouble(input[3]);
            
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Line line = new Line(p1, p2);
            lines.add(line);
        }

        /* Input to find all the line starting from point p1 */
        input = sc.nextLine().split(" ");
        double point_x1 = Double.parseDouble(input[0]);
        double point_y1 = Double.parseDouble(input[1]);
        Point startingPoint = new Point(point_x1, point_y1);

        /* Finding Longest Line*/
        LineList myList = new LineList(lines);
        Line maxLine = myList.getLineWithMaxLength();
        System.out.println("Longest Line --> " + maxLine);
        double length = maxLine.getLineLength();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Length: " + (String)df.format(length));

        /* Finding all the lines starting from point startingPoint */
        Vector<Line> starting_lines = myList.getLinesFromStartingPoint(startingPoint);
        System.out.println("All the Lines starting from point: " + startingPoint);
        Iterator value = starting_lines.iterator(); 
        while(value.hasNext()) {
            System.out.println(value.next());
        }
    }
}