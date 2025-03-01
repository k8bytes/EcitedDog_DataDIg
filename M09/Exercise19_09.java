import java.util.Scanner;

public class ReverseStringDisplay {

    // display: recursive method; characters in reverse order
    public static void reverseDisplay(String value) {
        // base case: when the string is empty, stop recursion
        if (value.isEmpty()) {
            return;
        }

        // display: first character then call function recursively
        System.out.print(value.charAt(value.length() - 1));
        reverseDisplay(value.substring(0, value.length() - 1)); // recursively process remaining string
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt: user to enter a string
        System.out.print("Enter a string: ");
        String value = input.nextLine();

        // display: reverse of the string
        System.out.print("The reverse of the string is: ");
        reverseDisplay(value);

        input.close(); 
    }
}
