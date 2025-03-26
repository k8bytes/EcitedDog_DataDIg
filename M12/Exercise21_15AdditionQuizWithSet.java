import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdditionQuizWithSet {
    public static void main(String[] args) {
        Set<Integer> answers = new HashSet<>();

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        answers.add(answer);

        while (number1 + number2 != answer) {
            System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                answers.add(answer);
            }
        }

        System.out.println("You got it!");
    }
}
