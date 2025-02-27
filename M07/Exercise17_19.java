import java.io.*;
import java.util.Scanner;

public class Exercise17_19 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // user enters file name 
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();

        try {
            // open file (if found) in read mode
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");

            // read bytes from the file & display their hex 
            System.out.println("The hex representation of the file's bytes:");

            int byteData;
            while ((byteData = raf.read()) != -1) {
                String hexString = String.format("%02X", byteData);
                System.out.print(hexString + " ");
            }
            System.out.println();

            // closes file
            raf.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}
