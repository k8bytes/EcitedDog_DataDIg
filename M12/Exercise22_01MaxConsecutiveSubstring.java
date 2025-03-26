import java.util.Scanner;

public class MaxConsecutiveSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String maxSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            if (currentSubstring.length() == 0 || 
                str.charAt(i) > currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += str.charAt(i); // add character to current                        increasing sequence
            } else {
                currentSubstring = "" + str.charAt(i); // reset with current char
            }

            if (currentSubstring.length() > maxSubstring.length()) {
                maxSubstring = currentSubstring;
            }
        }

        System.out.println("Maximum consecutive substring is " + maxSubstring);
    }
}
