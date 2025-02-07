import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    /********************************************
     * This program reads the text of President Abraham Lincoln's Gettysburg Address from the online file located at: 
     * https://liveexample.pearsoncmg.com/data/Lincoln.txt
     * it processes the text and counts the total number of words and prints the word count as an output. 
     /********************************************/
     
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Lincoln.txt";

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            int totalWords = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                totalWords += getNumberOfWords(line);
            }

            input.close();
            System.out.println("The total number of words in the Gettysburg Address is: " + totalWords);

        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO Error: Unable to read the file");
        }
    }

    /** Method to count words in a given string **/
    public static int getNumberOfWords(String text) {
        // Split by whitespace and punctuation
        String[] words = text.split("[\\s\\p{Punct}]+");

        int count = 0;
        for (String word : words) {
            if (word.trim().length() > 0) {
                count++;
            }
        }
        return count;
    }
}