import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

    // Method to sort the ArrayList in increasing order
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list); // Sorts the list in increasing order using Collections.sort
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");

        // Read 5 numbers and add them to the list
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num); // Add each number to the list
        }

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Sort the list
        sort(numbers);

        // Display the sorted list
        System.out.println("Sorted list in increasing order: " + numbers);

        scanner.close();
    }
}