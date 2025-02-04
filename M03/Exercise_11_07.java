import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {

    // Method to shuffle the elements in the ArrayList
    public static void shuffle(ArrayList<Integer> list) {
        if (list != null && list.size() > 1) {
            Collections.shuffle(list); // Shuffle the list using the Collections.shuffle method
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter numbers
        System.out.println("Enter a sequence of numbers, ending with 0:");

        // Read input numbers until the user enters 0
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break; // Exit the loop when 0 is entered
            }
            numbers.add(num); // Add the number to the list
        }

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Shuffle the list
        shuffle(numbers);

        // Display the shuffled list
        System.out.println("Shuffled list: " + numbers);

        scanner.close();
    }
}