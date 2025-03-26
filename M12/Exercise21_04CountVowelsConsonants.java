import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
import java.io.File;
import java.io.PrintWriter;

public class CountVowelsConsonants {
    public static void main(String[] args) throws Exception {
        // create: sample txt file if one doesn't exist
        File file = new File("myfile.txt");
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("Hello World!");
                writer.println("This is a sample text file.");
                writer.println("It contains vowels and consonants.");
            }
            System.out.println("Sample file 'myfile.txt' created.");
        }

        // define: vowels
        HashSet<Character> vowels = new HashSet<>(Arrays.asList(
            'A', 'E', 'I', 'O', 'U'));

        // use generated file if needed
        Scanner input = new Scanner(file);

        int countVowels = 0;
        int countConsonants = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine().toUpperCase();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (vowels.contains(ch)) {
                    countVowels++;
                } else if (Character.isLetter(ch)) {
                    countConsonants++;
                }
            }
        }

        System.out.println("The number of vowels is " + countVowels +
                           " and consonants is " + countConsonants);
    }
}
