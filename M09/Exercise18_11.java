import java.util.Scanner;

public class SumDigits {

    // recursive method: compute sum of digits in the number
    public static int sumDigits(long n) {
        // base case: when n is 0, return 0
        if (n == 0) {
            return 0;
        }

        // add last digit (n % 10) to the sum and recursively call sumDigits with the remaining number (n / 10)
        return (int)(n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt: user to enter an integer
        System.out.print("Enter an integer: ");
        long n = input.nextLong();

        // display: sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(n));

        input.close(); 
    }
}
