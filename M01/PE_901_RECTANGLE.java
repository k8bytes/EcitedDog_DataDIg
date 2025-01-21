public class PE_901_RECTANGLE {
    public static void main(String[] args) {
        // Create the first rectangle object
        MyRectangle myRectangle = new MyRectangle(4, 40);
        System.out.println("The area of a rectangle with width " +
                myRectangle.width + " and height " + myRectangle.height +
                " is " + myRectangle.getArea());
        System.out.println("The perimeter of a rectangle is " +
                myRectangle.getPerimeter());

        // Create the second rectangle object
        MyRectangle yourRectangle = new MyRectangle(3.5, 35.9);
        System.out.println("The area of a rectangle with width " +
                yourRectangle.width + " and height " + yourRectangle.height +
                " is " + yourRectangle.getArea());
        System.out.println("The perimeter of a rectangle is " +
                yourRectangle.getPerimeter());
    }
}

class MyRectangle {
    // Data members
    double width = 1;
    double height = 1;

    // No-arg constructor
    public MyRectangle() {
    }

    // Parameterized constructor
    public MyRectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}