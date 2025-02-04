import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementInArrayList {

    // Method to find the maximum value in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null; // Return null if the list is null or empty
        }

        // Initialize the max value with the first element
        Integer maxValue = list.get(0);

        // Iterate through the list to find the maximum value
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter numbers ending with 0
        System.out.println("Enter a sequence of numbers, ending with 0:");

        // Read input numbers until the user enters 0
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break; // Exit the loop when 0 is entered
            }
            numbers.add(num); // Add the number to the list
        }

        // Call the max method and display the result
        Integer maxNum = max(numbers);
        
        if (maxNum != null) {
            System.out.println("The largest number is: " + maxNum);
        } else {
            System.out.println("The list is empty or null.");
        }

        scanner.close();
    }
}