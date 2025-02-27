import java.io.*;
import java.util.Scanner;

public class Exercise17_19 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = input.nextLine();

        FileInputStream in = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = reader.readLine()) != null) {
            // split line into individual numbers (split by spaces) for readability
            String[] numbers = line.split(" ");
            for (String number : numbers) {
                int value = Integer.parseInt(number); // pase integers from string
                System.out.print(getHex(value) + " "); // convert to hex and print
            }
        }

        reader.close();
        input.close();
    }

    /** convert an integer to a 2-digit hex number */
    public static String getHex(int value) {
        // using String.format to get hexadecimal rep of value
        return String.format("%02X", value);
    }
}
