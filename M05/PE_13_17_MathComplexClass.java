import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first complex number
        System.out.print("Enter the first complex number (real and imaginary parts): ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();

        // Prompt the user to enter the second complex number
        System.out.print("Enter the second complex number (real and imaginary parts): ");
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();

        // Create two Complex objects
        Complex c1 = new Complex(a1, b1);
        Complex c2 = new Complex(a2, b2);

        // Display arithmetic operations
        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

        input.close();
    }
}

/**
 * A beginner-friendly Complex class that supports
 * basic arithmetic operations on complex numbers.
 */
class Complex {
    private double real;
    private double imaginary;

    // No-arg constructor (default to 0 + 0i)
    public Complex() {
        this(0, 0);
    }

    // Constructor with specified real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Get the real part
    public double getRealPart() {
        return real;
    }

    // Get the imaginary part
    public double getImaginaryPart() {
        return imaginary;
    }

    // Add two complex numbers
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imaginary + other.imaginary;
        return new Complex(newReal, newImag);
    }

    // Subtract two complex numbers
    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImag = this.imaginary - other.imaginary;
        return new Complex(newReal, newImag);
    }

    // Multiply two complex numbers
    // (a + bi)(c + di) = (ac - bd) + (bc + ad)i
    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImag = (this.imaginary * other.real) + (this.real * other.imaginary);
        return new Complex(newReal, newImag);
    }

    // Divide two complex numbers
    // (a + bi)/(c + di) = ((ac + bd) + (bc - ad)i) / (c^2 + d^2)
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImag = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImag);
    }

    // Return the absolute value |a + bi| = sqrt(a^2 + b^2)
    public double abs() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    // Display complex numbers as (a + bi)
    @Override
    public String toString() {
        if (imaginary == 0) {
            return real + "";
        } else {
            return "(" + real + " + " + imaginary + "i)";
        }
    }
}
