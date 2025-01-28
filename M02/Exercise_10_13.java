public class MyRectangle2D {

    // Data fields
    private double x;
    private double y;
    private double width;
    private double height;

    // No-arg constructor that creates a default rectangle (0, 0) with width and height of 1
    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    // Constructor that creates a rectangle with specified x, y, width, and height
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods for x, y, width, and height
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to return the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to check if a point (x, y) is inside the rectangle
    public boolean contains(double x, double y) {
        return x > this.x - width / 2 && x < this.x + width / 2 &&
               y > this.y - height / 2 && y < this.y + height / 2;
    }

    // Method to check if a rectangle is inside this rectangle
    public boolean contains(MyRectangle2D r) {
        return r.getX() - r.getWidth() / 2 >= this.x - this.width / 2 &&
               r.getX() + r.getWidth() / 2 <= this.x + this.width / 2 &&
               r.getY() - r.getHeight() / 2 >= this.y - this.height / 2 &&
               r.getY() + r.getHeight() / 2 <= this.y + this.height / 2;
    }

    // Method to check if a rectangle overlaps with this rectangle
    public boolean overlaps(MyRectangle2D r) {
        return !(r.getX() + r.getWidth() / 2 <= this.x - this.width / 2 ||
                 r.getX() - r.getWidth() / 2 >= this.x + this.width / 2 ||
                 r.getY() + r.getHeight() / 2 <= this.y - this.height / 2 ||
                 r.getY() - r.getHeight() / 2 >= this.y + this.height / 2);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(0, 0, 4, 6);
        MyRectangle2D r2 = new MyRectangle2D(1, 1, 2, 2);
        MyRectangle2D r3 = new MyRectangle2D(5, 5, 2, 2);

        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 1 contains point (1, 1): " + r1.contains(1, 1));
        System.out.println("Rectangle 1 contains Rectangle 2: " + r1.contains(r2));
        System.out.println("Rectangle 1 overlaps Rectangle 3: " + r1.overlaps(r3));
    }
}
