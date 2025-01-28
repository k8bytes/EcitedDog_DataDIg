public class MyPoint {

    // Data fields to represent x and y coordinates
    private double x;
    private double y;

    // No-arg constructor that creates a point (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor that creates a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance from this point to a specified point of MyPoint type
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
    }

    // Method to calculate distance from this point to specified x and y coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    // Static method to calculate distance between two MyPoint objects
    public static double distance(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(); // Default point (0, 0)
        MyPoint point2 = new MyPoint(3, 4); // Point at (3, 4)

        System.out.println("Point1 coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point2 coordinates: (" + point2.getX() + ", " + point2.getY() + ")");

        // Distance between point1 and point2
        System.out.println("Distance from Point1 to Point2: " + point1.distance(point2));

        // Distance from point1 to specific coordinates
        System.out.println("Distance from Point1 to (5, 6): " + point1.distance(5, 6));

        // Static method to find distance between two MyPoint objects
        System.out.println("Distance between Point1 and Point2 using static method: " + MyPoint.distance(point1, point2));
    }
}