import java.io.*;

public class Exercise17_02 {
    public static void main(String[] args) throws IOException {
        // define binary file name
        String filename = "Exercise17_02.dat";

        // open the file in append mode using FileOutputStream and DataOutputStream
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(filename, true))) {
            // write 100 random integers to the file using binary format
            for (int i = 0; i < 100; i++) {
                int randomNumber = (int) (Math.random() * 100000); // generate a random number between 0 and 99999
                output.writeInt(randomNumber); 
            }
            System.out.println("100 random integers have been written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // read and display file contents to verify the written data
        System.out.println("Contents of " + filename + ":");
        try (DataInputStream input = new DataInputStream(new FileInputStream(filename))) {
            while (input.available() > 0) {
                System.out.print(input.readInt() + " "); // read and print each integer
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
