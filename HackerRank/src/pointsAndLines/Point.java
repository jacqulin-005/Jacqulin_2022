package pointsAndLines;

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        double distance = Math.sqrt(
            Math.pow(p2.getY() - p1.getY(), 2) +
            Math.pow(p2.getX() - p1.getX(), 2)
        );

        return distance;
    }
    
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
