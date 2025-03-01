import java.util.Scanner;

public class ReverseDisplay {

    // display: recursive method; digits in reverse
    public static void reverseDisplay(int value) {
        // base case: stop recursion if value is 0
        if (value == 0) {
            return;
        }

        // display: last digit and call recursively with remaining digits
        System.out.print(value % 10);
        reverseDisplay(value / 10); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt: user to enter integer
        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        // display: reverse of the number
        System.out.print("The reverse of the number is: ");
        reverseDisplay(value);

        input.close(); 
    }
}
