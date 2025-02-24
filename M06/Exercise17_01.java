import java.io.*;
import java.util.*;

public class Exercise17_01 {
    public static void main(String[] args) throws IOException {
        // create a file object
        String filename = "Exercise17_01.txt";

        // random object for random number generation
        Random random = new Random();

        // open in append mode with FileOutputStream and PrintWriter
        try (PrintWriter output = new PrintWriter(new FileOutputStream(filename, true))) {
            // write random 100 generated numbers to the file
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(100000); // generates random number between 0 and 99999
                output.print(randomNumber + " "); // write number followed by a space
            }
            output.println(); // moves to a new line after writing numbers 
            System.out.println("100 random integers have been written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // read and display file contents to verify written data ran successfully
        System.out.println("Contents of " + filename + ":");
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
