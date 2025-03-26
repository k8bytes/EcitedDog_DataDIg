import java.util.ArrayList;
import java.util.Scanner;

public class OriginalAdditionQuiz {
    public static void main(String[] args) {
        // list: store previously entered answers
        ArrayList<Integer> answers = new ArrayList<>();

        // generate: two random single-digit numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        answers.add(answer);

        // loop until the correct answer is entered
        while (number1 + number2 != answer) {
            System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

            // check: has answer already been tried?
            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                answers.add(answer); // store: new answer
            }
        }

        System.out.println("You got it!");
    }
}
